package com.reactapp.domain.model;
import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name="clients")

public class Client {
    /*
    email: data.get('email'),
      password: data.get('password'),
      firstName: data.get('firstName'),
      lastName:data.get('lastName')
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public Client() {
    }

    public Client(String email, String password, String firstName, String lastName) {

        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
