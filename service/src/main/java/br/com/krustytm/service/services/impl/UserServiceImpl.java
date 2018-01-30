package br.com.krustytm.service.services.impl;

import br.com.krustytm.business.business.UserBusiness;
import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBusiness business;

    @Override
    public UserDTO findById(final Integer id) {
        return business.findById(id);
    }
}
