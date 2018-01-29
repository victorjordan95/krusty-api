package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.UserDTO;

public interface UserService {

    UserDTO findById(final Integer id);
}
