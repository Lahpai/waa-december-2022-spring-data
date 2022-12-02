package miu.edu.day3springdata.demo.service;

import miu.edu.day3springdata.demo.entity.User;

import java.util.List;

public interface UserService {
    void save (User user);
    List<User> getAllUser();
    User findById(int id);
    void deleteById(int id);
}
