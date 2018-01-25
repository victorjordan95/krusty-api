package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.BankDetails;
import org.springframework.data.repository.CrudRepository;

public interface BankDetailsRepository extends CrudRepository<BankDetails, Integer> {
}
