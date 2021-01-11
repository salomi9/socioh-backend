package tech.salomiedward.sociohbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.salomiedward.sociohbackend.entity.Animal;
import tech.salomiedward.sociohbackend.service.AnimalService;

import java.util.List;


@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("/addAnimal")
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid")
    public void saveAnimal(@RequestBody Animal animal){
        Animal dog = animalService.save(animal);
    }

    @GetMapping(path = "/list", consumes = "application/json", produces = "application/json")
    public List<Animal> getAnimal(Model model) {
        return (List<Animal>) animalService.findAll();
    }


    @DeleteMapping(path = "/delete", value = "/{name}")
    public ResponseEntity<?> deleteAnimal(@PathVariable String name){
        Animal deleteDog = animalService.deleteByNameMatches(name);
    }
}
