package com.codingdojo.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.codingdojo.demo.models.Burger;
import com.codingdojo.demo.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerControllers {

    private final BurgerService burgerService;

    public BurgerControllers(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/burger/new")
    public String newBurger(@ModelAttribute("burger") Burger burger, Model model) {
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        return "index";
    }

    @PostMapping("/burgers")
    public String create(@Valid @ModelAttribute("burger") Burger burger,BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("burgers", burgerService.allBurgers());
            return "index";
        }

        burgerService.createBurger(burger);
        return "redirect:/burger/new";
    }

    @GetMapping("/burger/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("burger", burgerService.findBurger(id));
        return "edit";
    }

    @PutMapping("/burger/{id}")
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {

        if (result.hasErrors()) {
            return "edit";
        }

        burgerService.updateBurger(burger);
        return "redirect:/burger/new";
    }

    @GetMapping("/burger/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("burger", burgerService.findBurger(id));
        return "show";
    }
}
