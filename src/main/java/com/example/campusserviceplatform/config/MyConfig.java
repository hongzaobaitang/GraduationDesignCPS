package com.example.campusserviceplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @description:
 * @author: Zousir
 * @email: SloooFish@163.com
 * @date: 2022/9/24 18:38
 */
@Configuration
public class MyConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");//允许任意源
        corsConfiguration.addAllowedHeader("*");//任意请求头
        corsConfiguration.addAllowedMethod("*");//任意请求方式
        return corsConfiguration;
    }

        @Bean
        public CorsFilter corsFilter() {
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", buildConfig());
            return new CorsFilter(source);
        }


}
