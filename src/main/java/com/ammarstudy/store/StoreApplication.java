package com.ammarstudy.store;

import com.ammarstudy.store.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var productRepository = context.getBean("productRepository", com.ammarstudy.store.repositories.ProductRepository.class);
        var categoryRepository = context.getBean("categoryRepository", com.ammarstudy.store.repositories.CategoryRepository.class);

        var hellCategory = categoryRepository.findByName("hell");

        var existingProduct = productRepository.findById(1L).orElse(null);
        if (existingProduct != null) {
            // Update the existing product
            existingProduct.setName("Updated Product 1");
            existingProduct.setPrice(200);
            existingProduct.setCategory((Category) hellCategory); // Set the category
            productRepository.save(existingProduct);
        } else {
            var product1 = Product.builder()
                    .name("Product 1")
                    .price(100)
                    .category((Category) hellCategory) // Set the category
                    .build();
            productRepository.save(product1);
        }

        productRepository.findAll().forEach(System.out::println);
    }
}
