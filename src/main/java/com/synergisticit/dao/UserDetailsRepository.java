package com.synergisticit.dao;

import com.synergisticit.domain.UserDetails;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {
}
