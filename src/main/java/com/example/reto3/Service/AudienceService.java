package com.example.reto3.Service;

import com.example.reto3.Repository.AudienceRepository;
import com.example.reto3.model.Audience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AudienceService {

    @Autowired
    private AudienceRepository audienceRepository;

    public List<Audience> getAll() {
        return audienceRepository.getAll ();
    }

    public Optional<Audience> getAudience(int id){
        return audienceRepository.getAudience(id);
    }

    public Audience save(Audience audiences){
        if (audiences.getId() == null){
            return audienceRepository.save(audiences);
             }else {
            Optional<Audience> auditorio1 = audienceRepository.getAudience(audiences.getId());
            if(auditorio1.isEmpty()){
                return audienceRepository.save(audiences);
            }else{
                return audiences;
            }
        }
    }
}
