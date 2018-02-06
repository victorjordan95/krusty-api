package br.com.krustytm.business.business.impl;

import br.com.krustytm.business.business.UserBusiness;
import br.com.krustytm.dto.dtos.UserDTO;
import br.com.krustytm.model.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBusinessImpl implements UserBusiness {

    @Autowired
    private UserRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public UserDTO findById(final Integer id) {
        return modelMapper.map(repository.findOne(id), UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> dtos = new ArrayList<>();

        repository.findAll().forEach(u -> dtos.add(
                modelMapper.map(u, UserDTO.class)
        ));

        return dtos;
    }
}
