package Service;

import Repository.Crud.CrudRepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private CrudRepositoryAdmin repositoryAdmin;
}
