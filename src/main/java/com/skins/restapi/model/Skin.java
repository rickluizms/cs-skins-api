package com.skins.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String fase;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String fn;

    public Skin() {}
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFase() {
        return fase;
    }
    public void setFase(String fase) {
        this.fase = fase;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getFn() {
        return fn;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    
}
