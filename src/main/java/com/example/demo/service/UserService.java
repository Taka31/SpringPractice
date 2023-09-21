package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.data.Qqun;
import com.example.demo.data.UserRepository;

@Service
public class UserService {

    private UserRepository repo;

    public UserService(UserRepository userRepository){
        this.repo=userRepository;
    }

    public List<Qqun> findAllUsers(){
        List<Qqun> users = new ArrayList<Qqun>();
        Iterable<Qqun> liste = repo.findAll();
        liste.forEach(x->users.add(x));
        return users;
    }

    public Qqun findUserById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Collection<Qqun> findUserByLastName(String lastName){
        return repo.getUserByLastName(lastName);
    }

    public void addUser(Qqun user){
        repo.save(user);
    }

    public void deleteUser(long id){
        repo.deleteById(id);;
    }

    public void updateUser(Qqun user){
        Optional<Qqun> oldUser = repo.findById(user.getId());
        if(null!=oldUser){
            repo.save(user);
        }
    }
    
}
