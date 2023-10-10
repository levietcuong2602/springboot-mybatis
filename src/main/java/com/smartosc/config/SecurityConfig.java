package com.smartosc.config;

import com.smartosc.security.JwtAccessDeniedHandler;
import com.smartosc.security.JwtAuthenticationEntryPoint;
import com.smartosc.security.JwtAuthenticationTokenFilter;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig  {
    @Resource
    private UserDetailsService userDetailsService;
    @Resource
    private JwtAuthenticationEntryPoint authenticationEntryPoint;
    @Resource
    private JwtAccessDeniedHandler accessDeniedHandler;
    @Resource
    private JwtAuthenticationTokenFilter authenticationFilter;

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf() // disable csrf
                .disable()
                .authorizeHttpRequests((authorize) -> {
                    authorize.requestMatchers("/api/**").permitAll()
                            .requestMatchers(
                                    HttpMethod.GET,
                                    "/",
                                    "/*.html",
                                    "/favicon.ico",
                                    "/**/*.png",
                                    "/**/*.html",
                                    "/**/*.css",
                                    "/**/*.js",
                                    "/swagger-resources/**",
                                    "/v3/api-docs/**"
                            ).permitAll()
                            .requestMatchers("/api/v1/account/logout", "/api/v1/account/login", "/api/v1/account/register").permitAll()
                            .requestMatchers("/api/auth/**").permitAll()
                            .requestMatchers(HttpMethod.OPTIONS).permitAll()
                            .anyRequest().authenticated();
                })
                .exceptionHandling( exception -> exception
                        .authenticationEntryPoint(authenticationEntryPoint)
                        .accessDeniedHandler(accessDeniedHandler)
                ).sessionManagement( session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                );
        httpSecurity.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }
}
