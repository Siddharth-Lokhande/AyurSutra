package com.ayursutra.panchakarma.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ayursutra.panchakarma.Model.Mongose;
@Repository
public interface MongoRepo extends MongoRepository<Mongose,Integer>{ 

}
