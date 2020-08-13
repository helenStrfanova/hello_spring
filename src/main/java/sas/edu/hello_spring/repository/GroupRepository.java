package sas.edu.hello_spring.repository;

/*
@author Alona Sviridova
@version Ver_1.1
        07.08.2020
        hello_spring
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import sas.edu.hello_spring.model.Group;

public interface GroupRepository extends MongoRepository<Group, String> {
}
