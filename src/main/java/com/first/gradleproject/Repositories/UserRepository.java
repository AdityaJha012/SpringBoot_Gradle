package com.first.gradleproject.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.first.gradleproject.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
