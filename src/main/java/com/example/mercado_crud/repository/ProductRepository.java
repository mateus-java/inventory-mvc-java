package com.example.mercado_crud.repository;

import com.example.mercado_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
