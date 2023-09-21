package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
@Order(2)
public class CommandLineRunner1 implements CommandLineRunner{

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineRunner1.class);


    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("je suis dans mon commande line Runner 1");
    }
    
}
