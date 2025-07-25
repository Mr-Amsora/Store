package com.ammarstudy.store.repositories;

import com.ammarstudy.store.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("SELECT p from Product p where p.price between :min and :max order by p.name")
    List<Product> findAllBy(@Param("min") BigDecimal minPrice,@Param("max") BigDecimal maxPrice);

    @Query("select p from Product p where p.price between :min and :max order by p.name")
    List<Product> findProducts(@Param("min") BigDecimal minPrice, @Param("max") BigDecimal maxPrice);
}
