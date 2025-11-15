package com.codingdojo.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "burgers")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Burger name is required")
    @Size(min=2, message="Name must be at least 2 characters")
    @Column(name="burger_name")
    private String burgerName;

    @NotBlank(message="Restaurant name is required")
    @Column(name="restaurant_name")
    private String restaurantName;

    @NotBlank(message="Notes is required")
    @Size(min=2, message="Notes must be at least 2 characters")
    @Column(name="notes")
    private String notes;

    @NotNull(message="Rating is required")
    private Integer rating;

    public Burger() {}

    public Long getId() {
        return id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
