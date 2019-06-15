package com.coviam.YoStore.Users.service;

import com.coviam.YoStore.Users.entity.Users;

import java.util.List;

public interface UsersService {
    public Users save(Users user);
    public Users findOne(String userId);
    public Iterable<Users> findAll();

    public Users findByUserName(String userName);
//    public boolean exists(String employeeId);
//    public List<Employee> findAll();
//    public Iterator<Employee> findAll(Iterable<String> employeeIds);
//    public long count();
//    public void delete(String employeeId);

}
