package com.vicko.CrudExample.repositores;

import com.vicko.CrudExample.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
