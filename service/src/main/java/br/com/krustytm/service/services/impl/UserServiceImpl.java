package br.com.krustytm.service.services.impl;

import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.service.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO findById(final Integer id) {
        return null;
    }
}
