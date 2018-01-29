package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityDetailsDTO {

    private Integer id;
    private String username;
    private String password;
    private List<RoleDTO> roles;
}
