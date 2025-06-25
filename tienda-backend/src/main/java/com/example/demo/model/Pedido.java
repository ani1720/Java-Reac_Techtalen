package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private String texto;
    private String color;
    private String fuente;
    private String estilo;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters y setters

    public Long getId() {
        return id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFuente() {
        return fuente;
    }
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
