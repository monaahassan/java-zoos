package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.AnimalCounts;

import java.util.List;

public interface AnimalServices {
    List<AnimalCounts> animalCounts();
    Animal getById(long id);
}
