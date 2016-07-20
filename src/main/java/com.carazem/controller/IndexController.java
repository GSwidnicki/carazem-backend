package com.carazem.controller;

import com.carazem.config.ConfigService;
import com.carazem.config.Keys;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RENT on 2016-07-18.
 */
@RestController
public class IndexController {
    @Autowired
    ConfigService configService;

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/")
    public String home() {
        System.out.println(configService.get(Keys.SERVER_PORT));

//        String query = "SELECT schemaname FROM pg_catalog.pg_tables LIMIT 1";

        System.out.print(sessionFactory.getCurrentSession().isConnected());

        System.out.println("DUPA");
        return "Dziala backend!";
    }

}
