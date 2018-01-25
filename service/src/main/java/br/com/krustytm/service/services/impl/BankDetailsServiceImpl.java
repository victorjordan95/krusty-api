package br.com.krustytm.service.services.impl;

import br.com.krustytm.dto.dtos.BankDetailsDTO;
import br.com.krustytm.model.repository.BankDetailsRepository;
import br.com.krustytm.service.services.BankDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankDetailsServiceImpl implements BankDetailsService<BankDetailsDTO> {

    @Autowired
    private BankDetailsRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<BankDetailsDTO> findAll() {
        List<BankDetailsDTO> dtos = new ArrayList<>();

        repository.findAll()
                .forEach(bank ->
                        dtos.add(
                                modelMapper.map(bank, BankDetailsDTO.class)));
        return dtos;
    }

    @Override
    public BankDetailsDTO findById(final Integer id) {
        return modelMapper.map(repository.findOne(id), BankDetailsDTO.class);
    }
}
