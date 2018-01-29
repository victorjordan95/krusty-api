package br.com.krustytm.service.services.impl;

import br.com.krustytm.business.business.BankBusiness;
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
public class BankServiceImpl implements BankService {

    @Autowired
    private BankBusiness business;

    @Override
    public List<BankDTO> findAll() {
        return business.findAll();
    }
}
