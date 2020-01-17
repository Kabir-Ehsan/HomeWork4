package com.example.HW4.Service;

import com.example.HW4.Model.User;
import com.example.HW4.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServ{

    @Autowired
    private UserRepo repo;

    public List<User> getUser() {
        return new ArrayList<>();
    }

    public User save(User user) {
        return repo.save(user);
    }

}
