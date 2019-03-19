package com.uabc.edu.mx.pruebamysql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "contactdetail")
public class ContactDetail implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id", length = 11)
    private int id;

    @Column(name = "gender", length = 11)
    private int gender;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn
    private Contact contact;

    public ContactDetail(int gender, Date dateOfBirth, Contact contact) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
