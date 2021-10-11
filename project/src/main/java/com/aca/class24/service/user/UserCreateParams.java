package com.aca.class24.service.user;

public class UserCreateParams {

    private  String username;
    private  String password;
    private  String firstName;
    private  String lastName;

    public UserCreateParams(final String username,
                            final  String password,
                            final String firstName,
                            final String lastName) {
        if(username == null) {
            throw new IllegalArgumentException("Username should not be null");
        }
        if(username == null) {
            throw new IllegalArgumentException("Password should not be null");
        }

        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
