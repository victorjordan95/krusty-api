package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.BankDetailsDTO;
import br.com.krustytm.model.repository.BankDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankDetailsService {

    @Autowired
    private BankDetailsRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<BankDetailsDTO> findAll() {
        List<BankDetailsDTO> dtos = new ArrayList<>();

        repository.findAll()
                .forEach(bank ->
                        dtos.add(
                                modelMapper.map(bank, BankDetailsDTO.class)));
        return dtos;
    }
}
