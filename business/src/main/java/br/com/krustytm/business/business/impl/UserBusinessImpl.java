package br.com.krustytm.business.business.impl;

import br.com.krustytm.business.business.UserBusiness;
import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.model.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserBusinessImpl implements UserBusiness {

    @Autowired
    private UserRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public UserDTO findById(final Integer id) {
        return modelMapper.map(repository.findOne(id), UserDTO.class);
    }
}
