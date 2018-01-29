package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetailsDTO {

    private Integer id;
    private String phone;
    private String email;
}
