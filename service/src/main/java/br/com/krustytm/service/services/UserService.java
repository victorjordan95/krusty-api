package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO findById(final Integer id);

    List<UserDTO> findAll();
}
