package com.akarinti.test.java.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


/**
 * Declare your own Field
 **/

@Getter
@Setter
@Entity
public class Users {

    @OneToOne(mappedBy = "users")
    private UserBalance userBalance;
}
