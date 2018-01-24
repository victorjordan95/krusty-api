package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.BankDTO;
import br.com.krustytm.model.repository.BankRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<BankDTO> findAll() {
        List<BankDTO> dtos = new ArrayList<>();

        repository.findAll()
                .forEach(bank ->
                dtos.add(
                        modelMapper.map(bank, BankDTO.class)));

        return dtos;
    }

    public BankDTO findById(final Integer id) {
        return modelMapper.map(repository.findOne(id), BankDTO.class);
    }
}
