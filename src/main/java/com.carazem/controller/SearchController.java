package com.carazem.controller;

import com.carazem.search.SearchRequestDto;
import com.carazem.search.SearchResponseDto;
import com.carazem.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by RENT on 2016-07-21.
 */

@RestController
public class SearchController {

    @Autowired
    private RideService rideService;

    @RequestMapping(value = "/search", method = GET)
    public List<SearchResponseDto> search( SearchRequestDto searchRequestDto){
        return rideService.searchRides(searchRequestDto);
    }

}
