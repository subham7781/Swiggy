package com.swiggy.controller;


import com.swiggy.entity.Menu;
import com.swiggy.entity.Restaurant;
import com.swiggy.entity.UserInfo;
import com.swiggy.payload.MenuDto;
import com.swiggy.payload.RestaurantDto;
import com.swiggy.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class AuthController {
    @Autowired
    private RestaurantService restaurantService;

    // http://localhost:8080/public/search

    @GetMapping("/search/{search}")
    public List<Restaurant> searchRestaurantsByFoodName(@PathVariable String search) {
        return restaurantService.findRestaurantsByFoodName(search);
    }
    //http://localhost:8080/public/searchRestaurants
    @GetMapping("/searchRestaurants/{search}")
    public ResponseEntity<?> searchRestaurants(@PathVariable String search) {
        List<Restaurant> restaurants = restaurantService.findRestaurants(search);
        return new ResponseEntity<>(restaurants,HttpStatus.OK);
    }

    // http://localhost:8080/public/signup
    @PostMapping("/signup")
    public ResponseEntity<?> Signup(@RequestBody UserInfo user){
        String signIn = restaurantService.signIn(user);
        return new ResponseEntity<>(signIn, HttpStatus.CREATED);
    }

}
