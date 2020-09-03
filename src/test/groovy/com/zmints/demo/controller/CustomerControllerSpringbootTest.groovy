package com.zmints.demo.controller

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.zmints.demo.domain.Customer
import org.junit.Before
import org.junit.jupiter.api.BeforeEach
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
class CustomerControllerSpringbootTest {
    @Autowired MockMvc mvc
    Customer customer

    @BeforeEach
    void setup(){
        customer = new Customer(firstName: "Mike", lastName: "Smith")
    }

    @Test
    void add_customer(){
        mvc.perform(MockMvcRequestBuilders.post("/customer")
                .content(convertToJson(customer))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{'id':1, 'firstName':'Mike', 'lastName':'Smith'}"))
    }


    private byte[] convertToJson(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper.writeValueAsBytes(object);
    }

}
