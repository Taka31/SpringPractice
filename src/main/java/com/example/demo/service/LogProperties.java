package com.example.demo.service;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("log")
public class LogProperties {

    private Date prefix;
    private String suffix;

    public Date getPrefix(){
        return this.prefix;
    }

    public void setPrefix(Date prefix){
        this.prefix=prefix;
    }

    public String getSuffix(){   
        return this.suffix;
    }

    public void setSuffix(String suffix){
        this.suffix=suffix;
    }

    
}
