package com.example.demo.appin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Cluster extends MongoRepository<ClientId,String>{

}
