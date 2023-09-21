package com.example.demo.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.example.demo.data.UserRepository;

@Component
public class TotalUserInfo implements InfoContributor{

    private final UserRepository repo;

    @Autowired
    public TotalUserInfo(UserRepository userRepository){
        this.repo=userRepository;
    }

    @Override
    public void contribute(Builder builder) {
        builder.withDetail("user.app", repo.count());
    }
    
}
