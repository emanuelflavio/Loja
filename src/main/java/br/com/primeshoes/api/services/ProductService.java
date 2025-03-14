package br.com.primeshoes.api.services;

import br.com.primeshoes.api.entities.Product;
import br.com.primeshoes.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Save new product
     * @param product
     */

    public void store(Product product){

        productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

}
