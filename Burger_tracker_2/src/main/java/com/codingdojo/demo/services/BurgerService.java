package com.codingdojo.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.codingdojo.demo.models.Burger;
import com.codingdojo.demo.repositories.BurgerRepository;

@Service
public class BurgerService {

    private final BurgerRepository burgerRepo;

    public BurgerService(BurgerRepository burgerRepo) {
        this.burgerRepo = burgerRepo;
    }

    public List<Burger> allBurgers() {
        return burgerRepo.findAll();
    }

    public Burger createBurger(Burger b) {
        return burgerRepo.save(b);
    }

    public Burger findBurger(Long id) {
        return burgerRepo.findById(id).orElse(null);
    }

    public Burger updateBurger(Burger b) {
        return burgerRepo.save(b);
    }
}
