package br.com.krustytm.controller.endpoint;

import br.com.krustytm.dto.dtos.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public UserDTO index() {
        UserDTO user = new UserDTO();
        user.setName("Igor");
        user.setUsername("igorventurelli");
        return user;
    }
}
