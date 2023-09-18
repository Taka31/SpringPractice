package com.example.demo.web;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Qqun;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService service;

    public UserController(UserService userService){
        this.service=userService;
    }

    @GetMapping
    public List<Qqun> findAllUsers(){
        return this.service.findAllUsers();
    }

    @GetMapping(path="{id}")
    public Qqun findUserById(@PathVariable("id") Long id){
        return this.service.findUserById(id);
    }

    /*@GetMapping(path="{lastName}")
    public Collection<Qqun> findUserByLastName(@PathVariable String lastName){
        return this.service.findUserByLastName(lastName);
    }*/

    @PostMapping
    public void addUser(@RequestBody Qqun user){
        service.addUser(user);
    }

    @DeleteMapping(path="{id}")
    public void deleteUser(@PathVariable("id") Long id){
        service.deleteUser(id);
    }

    @PutMapping
    public void updateUser(@RequestBody Qqun user){
        this.service.updateUser(user);
    }
    
}
