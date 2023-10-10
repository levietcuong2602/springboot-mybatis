package com.smartosc.utils;


import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt token provider
 * @author cuonglv
 */

@Component
public class JwtTokenUtil {

    private static final Logger logger = LoggerFactory.getLogger(JwtTokenUtil.class);

    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";

    /**
     * jwt secret
     */
    @Value("${jwt.secret}")
    private String jwtSecret;

    /**
     * jwt expiration
     */
    @Value("${jwt.expiration}")
    private Long jwtExpirationDate;

    /**
     * generate token
     */
    public String generateToken(Authentication authentication) {
        String username = authentication.getName();

        Date currentDate = new Date();

        Date expireDate = new Date(currentDate.getTime() + jwtExpirationDate);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(getKey())
                .compact();
    }

    /**
     * getClaimsFromToken
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;

        try {
            claims = Jwts.parserBuilder()
                    .setSigningKey(getKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            logger.info("getClaimsFromToken:{}", token);
        }

        return claims;
    }

    /**
     * generate Expiration Date
     *
     * @return expiration milliseconds
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + jwtExpirationDate * 1000);
    }

    /**
     * Get username from token
     *
     * @param token jwt token
     * @return username
     */
    public String getUserNameFromToken(String token) {

        String username;

        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    private Key getKey() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    /**
     * verify token
     *
     * @param token
     * @return true/false
     */
    public boolean verifyToken(String token) {
        try{
            Jwts.parserBuilder()
                    .setSigningKey(getKey())
                    .build()
                    .parse(token);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }

    /**
     * check token is expired
     *
     * @param token jwt
     * @return boolean
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);

        return !expiredDate.before(new Date());
    }

    /**
     * get expired date from token
     *
     * @param token jwt
     * @return date
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }
    /**
     * check token can refresg
     *
     * @param token jwt
     * @return boolean
     */
    public boolean canRefresh(String token) {
        return isTokenExpired(token);
    }

    /**
     * generate token
     *
     * @param claims
     * @return jwt token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(getKey())
                .compact();
    }

    /**
     * refresh token
     *
     * @param token
     * @return new token
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }
}
