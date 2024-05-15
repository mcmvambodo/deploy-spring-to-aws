package doitwell.group.springaws;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class SpringAwsApplicationTests {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;
    @BeforeEach
    void contextLoads() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void givenString_whenHttpGetAws_thenReturnString() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/aws"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username",is("mc")))
                .andExpect(jsonPath("$.password",is("mvambodo")));
    }



}
