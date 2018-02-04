package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
