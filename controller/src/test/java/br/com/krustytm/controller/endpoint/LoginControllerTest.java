package br.com.krustytm.controller.endpoint;

import br.com.krustytm.controller.configuration.ControllerModuleConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ControllerModuleConfiguration.class})
@WebMvcTest(LoginController.class)
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnIndex() throws Exception {
        this.mockMvc.perform(
                get("/login"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("login")))
                .andDo(print());
    }

    @Test
    public void shouldReturnLoginAction() throws Exception {
        this.mockMvc.perform(
                get("/login/doLogin"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(
                        "login action")));
    }

    @Test
    public void shouldReturnLogoutAction() throws Exception {
        this.mockMvc.perform(
                get("/login/doLogout"))
                .andExpect(status().isFound());
    }
}
