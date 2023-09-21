package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandLineRunner2 implements CommandLineRunner{

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineRunner2.class);

    @Override
    public void run(String... args) throws Exception {
       LOGGER.info("Je suis dans mon command line runner 2");
    }

    
    
}
