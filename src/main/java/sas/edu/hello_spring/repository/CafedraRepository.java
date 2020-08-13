package sas.edu.hello_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sas.edu.hello_spring.model.Cafedra;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra,String> {
}
