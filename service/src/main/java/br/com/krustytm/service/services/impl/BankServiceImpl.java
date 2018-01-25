package br.com.krustytm.service.services.impl;

import br.com.krustytm.dto.dtos.BankDTO;
import br.com.krustytm.model.entity.Bank;
import br.com.krustytm.model.repository.BankRepository;
import br.com.krustytm.service.services.BankService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankServiceImpl implements BankService<BankDTO> {

    @Autowired
    private BankRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<BankDTO> findAll() {
        List<BankDTO> dtos = new ArrayList<>();

        repository.findAll()
                .forEach(bank ->
                dtos.add(
                        modelMapper.map(bank, BankDTO.class)));
        return dtos;
    }

    @Override
    public BankDTO findById(final Integer id) {
        return modelMapper.map(repository.findOne(id), BankDTO.class);
    }
}
