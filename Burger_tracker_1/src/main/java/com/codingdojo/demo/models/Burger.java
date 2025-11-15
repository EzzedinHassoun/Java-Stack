package com.codingdojo.demo.models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="burgers")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=3, message="Burger name must be at least 3 characters")
    private String burgerName;

    @NotNull
    @Size(min=3, message="Restaurant name must be at least 3 characters")
    private String resturentName;

    @NotNull
    @Min(value=1, message="Rating must be between 1 and 5")
    @Max(value=5, message="Rating must be between 1 and 5")
    private Integer rating;

    @NotNull
    @Size(min=3, message="Notes must not be empty")
    private String note;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public Burger() {}

    public Burger(String burgerName, String resturentName, Integer rating, String note) {
        this.burgerName = burgerName;
        this.resturentName = resturentName;
        this.rating = rating;
        this.note = note;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getResturentName() {
        return resturentName;
    }

    public void setResturentName(String resturentName) {
        this.resturentName = resturentName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }


    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
