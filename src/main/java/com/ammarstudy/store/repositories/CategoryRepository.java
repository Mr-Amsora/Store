package com.ammarstudy.store.repositories;

import com.ammarstudy.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Category findByName(String name);
}
