package com.coviam.YoStore.Users.service.impl;

import com.coviam.YoStore.Users.entity.Users;
import com.coviam.YoStore.Users.repository.UsersRepository;
import com.coviam.YoStore.Users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // this class performs the serivces
public class UsersServiceClass implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }


    @Override
    public Users findOne(String userId) {

        return usersRepository.findOne(userId);
    }

    @Override
    public Iterable<Users> findAll() {
        return (Iterable<Users>) usersRepository.findAll();
    }

    @Override
    public Users findByUserName(String userName) {
        return usersRepository.findByUserName(userName);
    }
}