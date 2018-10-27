package com.queryholic.spring.vanila.model;

import lombok.Getter;
import lombok.ToString;

/**
 * @author : queryholic
 * @since : 2018. 9. 2.
 */
@Getter
@ToString
public class User {
    private String id;
    private String name;
    private String password;
    private String mail;
}
