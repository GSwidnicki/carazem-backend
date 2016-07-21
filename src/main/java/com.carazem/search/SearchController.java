package com.carazem.search;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by javaDevPCZ on 2016-07-20.
 */

@RestController
public class SearchController {

    @RequestMapping(value = "/search", method = GET)
    public List<SearchResponseDto> searchResponse(SearchRequestDto request){
        return null;
    }

}
