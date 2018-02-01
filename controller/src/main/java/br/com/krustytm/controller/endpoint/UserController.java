package br.com.krustytm.controller.endpoint;

import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/{id}")
    public UserDTO findById(@PathVariable final Integer id) {
        return service.findById(id);
    }
}
