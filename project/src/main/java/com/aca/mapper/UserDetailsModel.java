package com.aca.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class UserDetailsModel {

    @JsonProperty("userName") //karanq chdnenq, bayc cankaliya
    private String username;

    @JsonProperty("firstName")
    private String firsName;

    @JsonProperty("lastName")
    private String lastName;

    /*
    user part of DB structure/private thing - should encapsulate
    user => userDetailsModel
    userDetailsModel => jsonString
     */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserDetailsModel{" +
                "username='" + username + '\'' +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
