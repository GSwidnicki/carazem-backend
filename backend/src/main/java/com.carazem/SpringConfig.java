package com.carazem;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RENT on 2016-07-18.
 */
@EnableAutoConfiguration
@ComponentScan("com.carazem")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
