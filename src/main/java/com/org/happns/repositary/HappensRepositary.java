package com.org.happns.repositary;

import com.org.happns.model.HappenModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HappensRepositary extends MongoRepository<HappenModel,Integer> {

}


