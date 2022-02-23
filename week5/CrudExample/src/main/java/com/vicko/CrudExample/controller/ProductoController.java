package com.vicko.CrudExample.controller;

import com.vicko.CrudExample.Producto;
import com.vicko.CrudExample.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return  productoService.getProducts();
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> getProductById(@PathVariable Integer id){
        try{
            Producto producto = productoService.getProductById(id);
            return new ResponseEntity<Producto>(producto, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/productos")
    public void saveProduct(@RequestBody Producto producto){
        productoService.saveProduct(producto);
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Producto producto, @PathVariable Integer id){
        try{
            Producto productToUpdate = productoService.getProductById(id);
            productToUpdate.setNombre(producto.getNombre());
            productToUpdate.setPrice(producto.getPrice());
            productoService.saveProduct(productToUpdate);
            return new ResponseEntity<Producto>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }


    }
    @DeleteMapping("/productos/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productoService.deleteProduct(id);
    }
}
