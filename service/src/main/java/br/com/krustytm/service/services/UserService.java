package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.user.UserDTO;
import br.com.krustytm.dto.dtos.user.role.RoleDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException {
        List<RoleDTO> roles = new ArrayList<>();
        roles.add(new RoleDTO("ROLE_ADMIN"));
        return new UserDTO(
                "Igor",
                "igor.venturelli@me.com",
                "igorventurelli",
                "$2a$04$bmwTRL2KoBRZyGTFjTqYPuK.NjH2c6Tyw3wJTrHSZBnh7bbYlQuWa",
                roles);
    }
}
