package br.com.krustytm.controller.endpoint;

import br.com.krustytm.dto.dtos.BankDTO;
import br.com.krustytm.service.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "*")
public class BankController {

    @Autowired
    private BankService service;

    @RequestMapping("")
    public List<BankDTO> findAll() {
        return service.findAll();
    }

}
