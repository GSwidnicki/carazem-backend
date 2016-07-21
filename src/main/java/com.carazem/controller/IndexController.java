package com.carazem.controller;

import com.carazem.config.ConfigService;
import com.carazem.config.Keys;
import com.carazem.service.RideService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@RestController
public class IndexController {

    @Autowired
    private ConfigService configService;

    @Autowired
    private RideService rideService;

    @RequestMapping("/")
    public String home() {
        System.out.println(configService.get(Keys.SERVER_PORT));
        rideService.searchRides().forEach(System.out::println);

        return "Dziala backend!";
    }

}
