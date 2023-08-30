package com.learning.springex.springexample.repository;

import com.learning.springex.springexample.beans.User;
import com.learning.springex.springexample.exceptions.ApplicationException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("select u from User u where u.username=:username")
    public User searchByName(@Param("username") String username) throws ApplicationException;
//    @Query()
//    public User checkPassword(@Param("password") String password) throws ApplicationException;
}
