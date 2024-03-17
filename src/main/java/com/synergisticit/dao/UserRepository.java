package com.synergisticit.dao;

import com.synergisticit.domain.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;


@EnableScan
public interface UserRepository extends CrudRepository<User, String> {
}
//@Repository
//public interface UserRepository extends MongoRepository<User, String> {
//}
