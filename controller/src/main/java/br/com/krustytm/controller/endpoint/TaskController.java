package br.com.krustytm.controller.endpoint;

import br.com.krustytm.controller.representation.TaskRepresentation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {



    @GetMapping("/tasks")
    public List<TaskRepresentation> findAll() {
        return null;
    }
}
