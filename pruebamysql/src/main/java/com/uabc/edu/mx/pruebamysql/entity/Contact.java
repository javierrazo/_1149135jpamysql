package com.uabc.edu.mx.pruebamysql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table (name = "contact")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "id", length = 11)
    private int id;

    @Column (name = "firstName", length = 30)
    private String firstName;

    @Column (name = "lastName", length = 30)
    private String lastName;

    @Column (name = "telephone", length = 15)
    private String telephone;

    @Column (name = "email", length = 30)
    private String email;

    @ManyToOne
    @JoinColumn
    private Company company;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private Set<ContactDetail> contactDetails;

    public Contact(String firstName, String lastName, String telephone, String email, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
        this.company = company;
    }
}
