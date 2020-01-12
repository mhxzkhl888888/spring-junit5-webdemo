package com.example.demo;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.demo.service.DesireService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DesireController.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DesireService service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        when(service.desire()).thenReturn("keny分清扬年年发财一定会实现的！");
        this.mockMvc.perform(get("/desire")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("keny分清扬年年发财一定会实现的！")));
    }
}
