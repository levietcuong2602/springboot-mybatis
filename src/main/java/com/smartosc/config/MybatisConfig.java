package com.smartosc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages = {"com.smartosc.datasource.mapper"})
@Configuration
public class MybatisConfig {
}