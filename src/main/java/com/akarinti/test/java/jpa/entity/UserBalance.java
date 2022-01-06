package com.akarinti.test.java.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Declare your own Field
 * **/

@Getter
@Setter
@Entity
public class UserBalance {

    @OneToOne
    private Users users;
}
