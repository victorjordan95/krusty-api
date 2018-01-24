package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.Bank;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends CrudRepository<Bank, Integer> {

}
