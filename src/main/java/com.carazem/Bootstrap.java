package com.carazem;


import com.carazem.config.ConfigService;
import com.carazem.config.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Bootstrap {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringConfig.class, args);
    }
}
