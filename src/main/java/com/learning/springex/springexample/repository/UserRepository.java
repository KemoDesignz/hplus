package com.learning.springex.springexample.repository;

import com.learning.springex.springexample.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
//    @Query("select u from Users u where u.password= :password and u.username=:username")
//    public boolean userAuth(@Param("username") String username, @Param("password") String password);

}
