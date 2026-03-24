package com.example.mercado_crud.service;

import com.example.mercado_crud.model.Product;
import com.example.mercado_crud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //criar
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return  productRepository.save(product);
    }
    //listar
    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }
    //buscar
    public Product getProductByid(Long id){
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto com" + id +"Não encontrado"));
    }
    //deletar
    public void deleProduct(Long id){

        if(!productRepository.existsById(id)){
            throw new RuntimeException("Produto com" + id +"Não encontrado");
        }
        productRepository.deleteById(id);
    }



}
