package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDetailsDTO {

    private Integer id;
    private String street;
    private Integer number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
