package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.models.Zoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, long> {

}
