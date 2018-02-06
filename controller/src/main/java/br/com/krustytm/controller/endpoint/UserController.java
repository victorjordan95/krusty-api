package br.com.krustytm.controller.endpoint;

import br.com.krustytm.controller.representation.UserRepresentation;
import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/{id}")
    public UserRepresentation findById(@PathVariable final Integer id) {
        return new UserRepresentation(service.findById(id));
    }

    @RequestMapping("")
    public List<UserRepresentation> findAll() {
        List<UserRepresentation> representations = new ArrayList<>();

        service.findAll().forEach(u -> representations.add(
                new UserRepresentation((u))
        ));

        return representations;
    }
}
