package com.growlogic.eeko.subscription_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "https://app.eeko.ai",
                        "https://www.eeko.ai",
                        "https://eeko.ai",
                        "https://app-dev.eeko.ai",
                        "https://app-demo.eeko.ai",
                        "https://admin-dev.eeko.ai",
                        "https://admin-demo.eeko.ai",
                        "http://localhost:3000",
                        "http://localhost:3001",
                        "https://eeko.growlogic.in",
                        "https://userapp.eeko.ai",
                        "http://demo.eeko.ai") // Replace with your UI's origin
                .allowedOriginPatterns("https://app-dev.eeko.ai") // Replace with your UI's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
                .allowedHeaders("*", "Authorization")
                .allowCredentials(true);
    }
}