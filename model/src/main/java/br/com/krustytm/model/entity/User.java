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

    @OneToOne(mappedBy = "user")
    private SecurityDetails securityDetails;

    @OneToOne(mappedBy = "user")
    private ContactDetails contactDetails;

    @OneToOne(mappedBy = "user")
    private BankDetails bankDetails;

    @OneToOne(mappedBy = "user")
    private AddressDetails addressDetails;

    @OneToOne(mappedBy = "user")
    private Task task;
}
