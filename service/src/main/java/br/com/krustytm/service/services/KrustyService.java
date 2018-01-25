package br.com.krustytm.service.services;

import java.util.List;

public interface KrustyService<DTO> {

    List<DTO> findAll();

    DTO findById(final Integer id);
}
