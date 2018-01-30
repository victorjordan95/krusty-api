package br.com.krustytm.model.repository;

import br.com.krustytm.model.entity.ContactDetails;
import org.springframework.data.repository.CrudRepository;

public interface ContactDetailsRepository extends CrudRepository<ContactDetails, Integer> {
}
