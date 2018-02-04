package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
