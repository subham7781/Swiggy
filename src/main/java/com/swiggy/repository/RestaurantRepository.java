package com.swiggy.repository;


import com.swiggy.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    List<Restaurant> findByMenusNameContainingIgnoreCase(String foodName);

    Restaurant findByName(String name);
}