package com.vicko.HelloWorldMVC.Controller;

import com.vicko.HelloWorldMVC.Models.Phone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class PhoneControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setup(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(new PhoneController()).build();
    }

    @Test
    public void CheckIfTheMVCIsWorking() throws Exception{
        this.mockMvc.perform(get("/validatePhone")).andExpect(view().name("phoneHome"));
    }

    @Test
    public void CheckIfTheValidatorWorks() throws  Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.post("/addValidatePhone")
                .accept(MediaType.TEXT_HTML)
                .param("phoneInput", "123456678"))
                .andExpect(model().attributeHasFieldErrorCode("Phone", "phoneNumber", "ContactNumberConstraint"))
                .andExpect(view().name("phoneHome"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}