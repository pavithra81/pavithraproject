package com.projectbypp.tarinmanagementms.repository;

import com.projectbypp.tarinmanagementms.model.trainModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface trainrepository extends MongoRepository<trainModel,Integer> {
}
