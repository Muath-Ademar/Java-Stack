package com.example.burger.repositeries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.burger.models.Burger;

@Repository
public interface BurgerRepositery extends CrudRepository<Burger, Long> {
    List<Burger> findAll();
    // this method finds burgers with descriptions containing the search string


}
