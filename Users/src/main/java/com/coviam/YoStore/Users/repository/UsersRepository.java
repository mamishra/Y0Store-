package com.coviam.YoStore.Users.repository;

import com.coviam.YoStore.Users.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<Users, String> {
    public Users findByUserName(String userName);

}