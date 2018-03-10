package br.com.krustytm.service.services;

import br.com.krustytm.dto.dtos.TaskDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> findAll();
}
