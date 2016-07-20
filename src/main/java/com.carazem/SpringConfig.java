package com.carazem;


import com.carazem.config.ConfigService;
import com.carazem.config.Keys;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.annotation.PostConstruct;

/**
 * Created by RENT on 2016-07-18.
 */
@EnableAutoConfiguration
@ComponentScan("com.carazem")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Autowired
    ConfigService configService;

    @PostConstruct
    public Flyway flyway(){
        Flyway flyway = new Flyway();
        flyway.setDataSource(configService.get(Keys.DB_URL), configService.get(Keys.DB_USER), configService.get(Keys.DB_PASSWORD));
        flyway.migrate();
        return flyway;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedMethod("POST");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
