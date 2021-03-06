package com.emc.ideaforce.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    private String firstName;

    private String lastName;

    private String password;

    @Id
    @Column(length = 100)
    @Setter(AccessLevel.NONE)
    private String email;

    private String[] roles;

    //created
    //locked
    //failed login attempts
    //reset pwd

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

}
