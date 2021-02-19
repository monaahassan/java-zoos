package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooServices")
public class ZooServicesImplementation {
    @Autowired
    ZooRepository zooRepos;

    @Override
    public List<Zoo> allZoos(){
        List<Zoo> zoos = new ArrayList<>();
        zooRepos.findAll().iterator().forEachRemaining(zoos::add);

        return zoos;
    }
}
