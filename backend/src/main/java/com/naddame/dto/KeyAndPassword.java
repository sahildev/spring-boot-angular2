package com.naddame.dto;

/**
 * View Model object for storing the user's key and password.
 */
public class KeyAndPassword {

    private String key;

    private String newPassword;

    public KeyAndPassword() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
