package com.zmints.demo.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTest {
    @Autowired MockMvc mvc

    @Test
    void happy_default(){
        mvc.perform(MockMvcRequestBuilders.get("/greetings").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{'greetingText':'Hello, World'}"))
    }


    @Test
    void happy_with_param(){
        mvc.perform(MockMvcRequestBuilders.get("/greetings?name=Nakib").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{'greetingText':'Hello, Nakib'}"))
    }
}
