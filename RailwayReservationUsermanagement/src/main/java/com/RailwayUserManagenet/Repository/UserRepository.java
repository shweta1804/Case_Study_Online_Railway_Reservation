package com.RailwayUserManagenet.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RailwayUserManagenet.model.TrainDetails;
/**
 * @author Shweta Pawar
 * This Interface Is Used For Adding MongoRepository Which Acts As A Database For Users
 */
@Repository
public interface UserRepository extends MongoRepository<TrainDetails, Integer> {

}
