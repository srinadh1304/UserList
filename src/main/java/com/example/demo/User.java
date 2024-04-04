package com.example.demo;

public class User {
  String userName;
  String firstName;
  String surName;
  String password;
  String confirmPassword;
  String role;

  public User(String userName, String firstName, String surName, String password, String confirmPassword, String role) {
    this.userName = userName;
    this.firstName = firstName;
    this.surName = surName;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.role = role;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
