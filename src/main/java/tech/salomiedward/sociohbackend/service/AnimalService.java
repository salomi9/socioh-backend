package tech.salomiedward.sociohbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.salomiedward.sociohbackend.entity.Animal;
import tech.salomiedward.sociohbackend.repository.AnimalRepository;

@Service

public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    public  Iterable<Animal> findAll(){
        return animalRepository.findAll();
    }

    public void deleteByNameMatches(String name){
        animalRepository.deleteByNameMatches(name);
    }
}
