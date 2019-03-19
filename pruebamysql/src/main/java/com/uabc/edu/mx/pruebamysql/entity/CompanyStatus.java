package com.uabc.edu.mx.pruebamysql.entity;


import com.uabc.edu.mx.pruebamysql.entity.Company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="companystatus")
public class CompanyStatus implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column (name = "id", length = 11)
    private int id;

    @Column(name="name", length = 30)
    private String name;

    @OneToMany(mappedBy = "companyStatus", cascade = CascadeType.ALL)
    private Set<Company> companies;

    public CompanyStatus(String name) {
        this.name = name;
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

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }
}
