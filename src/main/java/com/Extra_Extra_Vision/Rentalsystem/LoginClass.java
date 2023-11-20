package com.Extra_Extra_Vision.Rentalsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.Extra_Extra_Vision.Rentalsystem.LoginStateFactory.LoginState;
import static com.Extra_Extra_Vision.Rentalsystem.LoginStateFactory.getLoginStateMessage;

public abstract class LoginClass {
    private static List<Integer> accounts;
    private int accountId;
    private Map<String, String> loginCredentials;
    private boolean admin;
    private boolean active;

    public LoginClass() {
        loginCredentials = new HashMap<>();
    }

    public String registerAccount(String username, String password, boolean admin) {
        if (!loginCredentials.containsKey(username)) {
            loginCredentials.put(username, encryptPassword(password));
            accountId = accounts.size();
            accounts.add(accountId);
            this.setAdmin(admin);
            // Additional logic to add customer to the database or customer management system
            return getLoginStateMessage(LoginState.LOGGED_IN);
        } else {
            return getLoginStateMessage(LoginState.LOGIN_FAILED);
        }
    }

    public String login(String username, String password) {
        if (loginCredentials.containsKey(username) && checkPassword(password, loginCredentials.get(username))) {
            return getLoginStateMessage(LoginState.LOGGED_IN);
        } else {
            return getLoginStateMessage(LoginState.LOGIN_FAILED);
        }
    }

    public String logout(String username) {
        // Logic to handle logout, like updating system logs or customer status
        return getLoginStateMessage(LoginState.LOGGED_OUT);
    }

    public String resetPassword(String username, String oldPassword, String newPassword) {
        if (loginCredentials.containsKey(username) && checkPassword(oldPassword, loginCredentials.get(username))) {
            loginCredentials.put(username, encryptPassword(newPassword));
            return getLoginStateMessage(LoginState.PASSWORD_RESET_SUCCESSFUL);
        } else {
            return getLoginStateMessage(LoginState.PASSWORD_RESET_FAILED);
        }
    }

    private String encryptPassword(String password) {
        // Password encryption logic should be implemented here
        return password; // This is a placeholder
    }

    private String decryptPassword(String password) {
        // Password decryption logic should be implemented here
        return password; // This is a placeholder
    }

    private boolean checkPassword(String inputPassword, String storedPassword) {
        // Password comparison logic should be implemented here
        return inputPassword.equals(decryptPassword(storedPassword)); // This is a placeholder
    }

    private void setAdmin(boolean admin) {
        this.admin = admin;
    }
}


