package com.ayursutra.panchakarma.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ayursutra.panchakarma.Model.Authen;
import com.ayursutra.panchakarma.Model.AuthenMongo;
@Repository
public interface AuthenMongoRepo extends MongoRepository<AuthenMongo, Integer>{ 

}
