package com.carazem.controller;

import com.carazem.config.ConfigService;
import com.carazem.config.Keys;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by RENT on 2016-07-18.
 */
@RestController
public class IndexController {
    @Autowired
    ConfigService configService;

    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping("/")
    public String home() {
        System.out.println(configService.get(Keys.SERVER_PORT));

        //Test polaczenia
        String query = "SELECT schemaname FROM pg_catalog.pg_tables LIMIT 1";
        System.out.println(entityManager.createNativeQuery(query).getSingleResult().toString());

        return "Dziala backend!";
    }

}
