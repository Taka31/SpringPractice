package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.service.HelloService;
import com.example.demo.web.HelloController;

public class SimpleTest {

    @Test
    void simple_test_bonjour(){
        HelloService service = new HelloService();
        HelloController controller = new HelloController(service);
        String message = controller.getBonjour();
        assertEquals(message,"Bonjour toi");
    }
    
}
