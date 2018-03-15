package com.project.smongo.mvc.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.smongo.mvc.entity.HomeEntity;

public interface HomeRepository extends MongoRepository<HomeEntity, String> {

	public List<HomeEntity> findAllBy(TextCriteria criteria);
}
