package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private Long cpf;
    private SecurityDetailsDTO securityDetails;
    private ContactDetailsDTO contactDetails;
    private BankDetailsDTO bankDetails;
    private AddressDetailsDTO addressDetails;
}
