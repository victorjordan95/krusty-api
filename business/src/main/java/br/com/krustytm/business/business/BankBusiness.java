package br.com.krustytm.business.business;

import br.com.krustytm.dto.dtos.BankDTO;

import java.util.List;

public interface BankBusiness {

    List<BankDTO> findAll();
}
