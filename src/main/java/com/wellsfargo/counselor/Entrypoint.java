package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "securities")
public class Security {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(name = "purchase_date", nullable = false)
    private LocalDate purchaseDate;

    @Column(name = "purchase_price", nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    public Security() {}

    public Security(String name, String category, LocalDate purchaseDate, 
                   double purchasePrice, int quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}

