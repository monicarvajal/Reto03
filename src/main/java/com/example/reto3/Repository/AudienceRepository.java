package com.example.reto3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.model.Audience;
import com.example.reto3.Repository.Crud.CrudRepositoryAudience;

@Repository
public class AudienceRepository {

    @Autowired
    private CrudRepositoryAudience crudRepositoryAudience;

    public List<Audience> getAll(){
        return (List<Audience>) crudRepositoryAudience.findAll();
    }
    public Optional<Audience> getAudience(int id){
        return crudRepositoryAudience.findById(id);
    }

    public Audience save(Audience audiences){
        return crudRepositoryAudience.save(audiences);
    }
}
