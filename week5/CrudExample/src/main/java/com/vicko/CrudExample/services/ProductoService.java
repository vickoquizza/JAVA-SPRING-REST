package com.vicko.CrudExample.services;


import com.vicko.CrudExample.Producto;
import com.vicko.CrudExample.repositores.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> getProducts(){
        return productoRepositorio.findAll();
    }

    public void saveProduct(Producto product){
        productoRepositorio.save(product);
    }

    public Producto getProductById(Integer id){
        return productoRepositorio.findById(id).get();
    }

    public void deleteProduct(Integer id){
        Producto producto = getProductById(id);
        productoRepositorio.delete(producto);
    }


}
