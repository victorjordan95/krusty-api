package br.com.krustytm.business.business;

import br.com.krustytm.dto.dtos.UserDTO;

import java.util.List;

public interface UserBusiness {

    UserDTO findById(final Integer id);

    List<UserDTO> findAll();
}
