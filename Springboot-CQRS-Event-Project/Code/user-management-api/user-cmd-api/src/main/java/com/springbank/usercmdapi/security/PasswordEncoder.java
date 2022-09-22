package com.springbank.usercmdapi.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
