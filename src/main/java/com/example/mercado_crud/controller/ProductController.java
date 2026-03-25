package com.example.mercado_crud.controller;


import com.example.mercado_crud.exceptions.RecursoNaoEncontradoException;
import com.example.mercado_crud.model.Product;
import com.example.mercado_crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return  productService.createProduct((product));
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductByid(@PathVariable Long id){
        try{
            Product product = productService.getProductByid(id);
            return ResponseEntity.ok(product);
        } catch (RecursoNaoEncontradoException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleProduct(id);
        return ResponseEntity.noContent().build();
    }
}
