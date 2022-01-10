package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class ApiListControllerTest {

    @Test
    void travels_respond_OK(@Autowired MockMvc mockMvc) throws Exception {

    }
/*
        mockMvc
            .perform(MockMvcRequestBuilders.get("/api/travels"))
            .andExpect(MockMvcResultMatchers.status().isOk());
            //.andExpect(MockMvcResultMatchers.content().string("OK"));
    }
    @Test
    void inscription_respond_OK(@Autowired MockMvc mockMvc) throws Exception {

        mockMvc
            .perform(MockMvcRequestBuilders.get("/api/inscription"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("OK"));
    }
*/
}
