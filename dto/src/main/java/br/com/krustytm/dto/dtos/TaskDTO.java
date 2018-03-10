package br.com.krustytm.dto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    private Integer id;
    private TaskTypeDTO taskType;
    private UserDTO user;
    private ProjectDTO project;
    private String description;
    private LocalDate limitDate;
    private Integer points;
}
