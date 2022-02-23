package com.vicko.CrudExample;

import javax.persistence.*;

@Entity
@Table(name = "productoscrud")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer price;

    public Producto() {
    }

    public Producto(Integer id, String nombre, Integer price) {
        this.id = id;
        this.nombre = nombre;
        this.price = price;
    }

    public Producto(String nombre, Integer price) {
        this.nombre = nombre;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
