package br.com.krustytm.controller.endpoint;

import br.com.krustytm.dto.dtos.UserDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public UserDTO findById(@PathVariable final Integer id) {
        return null;
    }
}
