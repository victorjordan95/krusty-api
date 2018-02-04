package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.TaskType;
import org.springframework.data.repository.CrudRepository;

public interface TaskTypeRepository extends CrudRepository<TaskType, Integer> {
}
