package com.uabc.edu.mx.pruebamysql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table (name = "company")
public class Company implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column (name = "id")
    private int id;

    @Column (name = "name")
    private String name;


    @ManyToOne
    @JoinColumn
    private CompanyStatus companyStatus;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Contact> contacts;

    public Company(String name, CompanyStatus companyStatus) {
        this.name = name;
        this.companyStatus = companyStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyStatus getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(CompanyStatus companyStatus) {
        this.companyStatus = companyStatus;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
}
