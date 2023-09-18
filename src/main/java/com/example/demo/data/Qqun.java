package com.example.demo.data;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Qqun implements Serializable{

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    public Qqun(){

    }

    public Qqun(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }


    
}
