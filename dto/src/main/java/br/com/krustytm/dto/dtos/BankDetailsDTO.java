package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetailsDTO {

    private Integer id;
    private BankDTO bank;
    private String agency;
    private String accountNumber;
}
