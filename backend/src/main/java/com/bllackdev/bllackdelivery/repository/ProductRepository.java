package com.bllackdev.bllackdelivery.repository;

import com.bllackdev.bllackdelivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Método para Ordenar produtos pelo Nome
    List<Product> findAllByOrderByNameAsc();
}
