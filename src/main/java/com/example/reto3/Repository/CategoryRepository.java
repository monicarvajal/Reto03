package com.example.reto3.Repository;

import java.util.List;
import java.util.Optional;

import com.example.reto3.Repository.Crud.CrudRepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.model.Category;

@Repository
public class CategoryRepository {
    @Autowired
    private CrudRepositoryCategory crudRepositoryCategory;

    public List<Category> getAll(){
        return (List<Category>) crudRepositoryCategory.findAll();
    }
    public Optional<Category> getCategory(int id){
        return crudRepositoryCategory.findById(id);
    }

    public Category save(Category category){
        return crudRepositoryCategory.save(category);
    }
}
