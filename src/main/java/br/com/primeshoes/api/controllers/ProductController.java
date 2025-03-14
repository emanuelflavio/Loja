package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.entities.Product;
import br.com.primeshoes.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    public void createProduct(Product product){
        productService.store(product);
    }
}
