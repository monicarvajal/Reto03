package com.example.reto3.Repository;

import com.example.reto3.Repository.Crud.CrudRepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public
class AdminRepository {

    @Autowired
    private CrudRepositoryAdmin crudRepositoryAdmin;


}
