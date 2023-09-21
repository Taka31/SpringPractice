package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import com.example.demo.service.HelloService;

@SpringBootTest
@AutoConfigureMockMvc
public class TestIntegrationWithMockChange {

    @MockBean
    HelloService service;

    @Autowired
    MockMvc monMock;

    @Test
    void bonjour_with_Mock_updated() throws Exception{
        when(service.bonjour()).thenReturn("Adios amigos");
        monMock.perform(get("/bonjour")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("$").value("Adios amigos"));

    }

    
}
