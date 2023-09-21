package com.example.demo.demo;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class TestIntegrationMockMvc {

    @Autowired
    private MockMvc monMock;

    @Test
    void bonjour_with_mock_mvc() throws Exception{
        this.monMock.perform(get("/bonjour")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("$").value("Bonjour toi"));
    }


    
}
