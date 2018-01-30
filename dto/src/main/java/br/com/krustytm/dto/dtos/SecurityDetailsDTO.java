package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityDetailsDTO {

    private Integer id;
    private String username;
    private String password;
    private SecurityRoleDTO securityRole;
}
