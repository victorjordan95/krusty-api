package br.com.krustytm.controller.endpoint;

import br.com.krustytm.controller.representation.UserRepresentation;
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
    public UserRepresentation findById(@PathVariable final Integer id) {
        return new UserRepresentation(service.findById(id));
    }
}
