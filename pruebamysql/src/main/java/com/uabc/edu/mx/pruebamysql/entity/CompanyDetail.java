package com.uabc.edu.mx.pruebamysql.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "companydetail")
public class CompanyDetail implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column (name = "id")
    private int id;

    @Column (name = "employeeStrength", length = 11)
    private int employeeStrength;

    @Column (name = "notes", length = 1024)
    private String notes;

    public CompanyDetail(int employeeStrength, String notes) {
        this.employeeStrength = employeeStrength;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeStrength() {
        return employeeStrength;
    }

    public void setEmployeeStrength(int employeeStrength) {
        this.employeeStrength = employeeStrength;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
