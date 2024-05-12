package com.example.moviecatalogservice.controller;

import com.example.moviecatalogservice.config.CatalogItem;
import com.example.moviecatalogservice.config.UserRating;
import com.example.moviecatalogservice.service.CatalogItemService;
import com.example.moviecatalogservice.service.UserRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class AppController {

    @Autowired
    private UserRatingService userRatingService;

    @Autowired
    private CatalogItemService catalogItemService;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        UserRating userRatings = userRatingService.getUserRating(userId);
        return userRatings.getUserRatings().stream().map(rating -> catalogItemService.getCatalogItem(rating)).collect(Collectors.toList());
    }
}
