package br.com.krustytm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private Long cpf;

    @OneToOne
    @JoinColumn(name = "security_details_id")
    private SecurityDetails securityDetails;

    @OneToOne
    @JoinColumn(name = "contact_details_id")
    private ContactDetails contactDetails;

    @OneToOne
    @JoinColumn(name = "bank_details_id")
    private BankDetails bankDetails;

    @OneToOne
    @JoinColumn(name = "address_details_id")
    private AddressDetails addressDetails;
}
