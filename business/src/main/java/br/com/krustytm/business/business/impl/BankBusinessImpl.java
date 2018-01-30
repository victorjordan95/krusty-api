package br.com.krustytm.business.business.impl;

import br.com.krustytm.business.business.BankBusiness;
import br.com.krustytm.dto.dtos.BankDTO;
import br.com.krustytm.model.repository.BankRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankBusinessImpl implements BankBusiness {

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
}
