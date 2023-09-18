package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImpl implements LogService {

    Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

    @Autowired
    private LogProperties properties;

    @Override
    public void tracer(String message) {
        logger.info(this.properties.getPrefix() + "traces "+ message +" : "+this.properties.getSuffix());
    }

    
}
