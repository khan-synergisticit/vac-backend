package com.synergisticit.dao;

import com.synergisticit.domain.UserDetails;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

@EnableScan
public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {
}
//@Repository
//public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {
//}