package com.swiggy.repository;


import com.swiggy.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    Optional<List<Restaurant>> findByMenusNameContainingIgnoreCase(String foodName);

    Optional<List<Restaurant>> findByName(String name);
}