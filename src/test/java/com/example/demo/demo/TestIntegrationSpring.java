package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.demo.web.HelloController;

@SpringBootTest
public class TestIntegrationSpring {

    @Autowired
    HelloController myController;

    @Test
    void bonjour_with_context_spring(){
        assertThat(myController).isNotNull();
        assertThat(myController.getService()).isNotNull();
    }
    
}
