package com.mphasis.dataproducts.apigen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mphasis.dataproducts.apigen.configs.ApiConfigModel;

@Configuration
public class AppConfig {

    @Bean
    public ApiConfigModel apiConfigModel() {
        return new ApiConfigModel(); 
    }
}

