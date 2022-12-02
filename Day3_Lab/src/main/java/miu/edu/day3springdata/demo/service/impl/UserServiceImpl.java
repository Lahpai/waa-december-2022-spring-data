package miu.edu.day3springdata.demo.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day3springdata.demo.entity.User;
import miu.edu.day3springdata.demo.repository.UserRepo;
import miu.edu.day3springdata.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }
}
