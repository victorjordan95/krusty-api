package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.BankDTO;

import java.util.List;

public interface BankService {

    List<BankDTO> findAll();
}
