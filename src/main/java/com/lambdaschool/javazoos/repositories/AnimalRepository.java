package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.services.AnimalServices;
import com.lambdaschool.javazoos.views.AnimalCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, long> {
    @Query(value = "SELECT a.animalid id, animaltype type, count(z.zooid) countanimals " +
            "FROM animals a LEFT JOIN zooanimals z " +
            "ON z.animalid = a.animalid " +
            "GROUP BY a.animalid", nativeQuery = true)
    List<AnimalCounts> animalCounts();
    Animal getByAnimalid(long id);
}
