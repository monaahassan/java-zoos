package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.repositories.AnimalRepository;
import com.lambdaschool.javazoos.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "animalservices")
public class AnimalServicesImplementation implements AnimalServices {
    @Autowired
    AnimalRepository animalRepos;

    @Override
    public List<AnimalCounts> animalCounts() {
        return animalRepos.animalCounts();
    }

    @Override
    public Animal getById(long id) {
        return animalRepos.getByAnimalid(id);
    }
}
