package br.com.krustytm.business.business;

import br.com.krustytm.dto.dtos.UserDTO;

public interface UserBusiness {

    UserDTO findById(final Integer id);
}
