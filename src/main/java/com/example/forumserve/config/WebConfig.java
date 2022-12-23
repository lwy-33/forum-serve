package com.example.forumserve.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/userImage/icon/**").addResourceLocations("file:D:\\userImage\\icon\\");
        registry.addResourceHandler("/userImage/userImage/**").addResourceLocations("file:D:\\userImage\\userImage\\");
    }
}
