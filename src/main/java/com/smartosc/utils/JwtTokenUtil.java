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
 * jwt 字符串工具
 *
 * @author YuJian95  clj9509@163.com
 * @date 2020/1/19
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
     * 从 token中获取登录用户名
     *
     * @param token jwt 字符串
     * @return 账号名称
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
     * 验证token是否还有效
     *
     * @param token       客户端传入的token
     * @return 是否有效
     */
    // verify jwt token
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
     * 判断 token是否已经失效
     *
     * @param token jwt 格式字符串
     * @return 是否失效
     */
    private boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);

        return !expiredDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     *
     * @param token jwt 格式字符串
     * @return 过期时间
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }
    /**
     * 判断token是否可以被刷新
     *
     * @param token jwt 格式字符串
     * @return 是否能刷新
     */
    public boolean canRefresh(String token) {
        return isTokenExpired(token);
    }

    /**
     * generate token
     *
     * @param userDetails 用户信息
     * @return jwt token
     */
    /**
     * 根据负责生成JWT的 token
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(getKey())
                .compact();
    }

    /**
     * 刷新token
     *
     * @param token 原来的 jwt字符串
     * @return 刷新后的字符串
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }
}
