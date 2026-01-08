package ru.netology.springBootDemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.netology.springBootDemo.systemProfile.*;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev",
            havingValue = "true"
    )
    public DevProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            name = "netology.profile.dev",
            havingValue = "false"
    )
    public ProductionProfile productionProfile() {
        return new ProductionProfile();
    }
}
