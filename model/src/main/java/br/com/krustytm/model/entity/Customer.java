package br.com.krustytm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private Long cpf;

    @Column(name = "address")
    private String address;

    @Column(name = "company_name")
    private String companyName;

    @OneToOne(mappedBy = "customer")
    private Project project;
}
