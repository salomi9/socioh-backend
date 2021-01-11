package tech.salomiedward.sociohbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.salomiedward.sociohbackend.entity.Animal;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    public Animal save(Animal animal);
    public List<Animal> findAll();
    public void deleteByNameMatches(String name);
}
