package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
