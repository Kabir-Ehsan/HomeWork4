package com.example.HW4.Resource;

import com.example.HW4.Model.User;
import com.example.HW4.Service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserReso {
    @Autowired
    private UserServ Serv;

    @GetMapping("/1")
    public List<User> me()
    {
       return Serv.getUser();
    }

    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        return Serv.save(user);
    }
}
