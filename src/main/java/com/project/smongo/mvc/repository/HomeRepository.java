package com.project.smongo.mvc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.smongo.mvc.entity.HomeEntity;

public interface HomeRepository extends MongoRepository<HomeEntity, String> {

}
