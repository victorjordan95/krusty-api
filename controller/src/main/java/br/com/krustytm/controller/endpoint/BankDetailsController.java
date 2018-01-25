package br.com.krustytm.controller.endpoint;

import br.com.krustytm.dto.dtos.BankDetailsDTO;
import br.com.krustytm.service.services.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bankDetails")
public class BankDetailsController {

    @Autowired
    private BankDetailsService service;

    @RequestMapping("")
    public List<BankDetailsDTO> findAll() {
        return service.findAll();
    }
}
