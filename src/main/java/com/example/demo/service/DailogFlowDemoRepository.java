package com.example.demo.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DailogFlowAIColl;


@Repository
public interface DailogFlowDemoRepository extends MongoRepository<DailogFlowAIColl, String> {
	
}
