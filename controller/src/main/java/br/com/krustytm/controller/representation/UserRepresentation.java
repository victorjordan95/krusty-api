package br.com.krustytm.controller.representation;

import br.com.krustytm.dto.dtos.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRepresentation {

    private UserDTO user;
}
