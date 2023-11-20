package com.Extra_Extra_Vision.Rentalsystem;

import java.util.HashMap;
import java.util.Map;
import static com.Extra_Extra_Vision.Rentalsystem.LoginStateFactory.LoginState;
import static com.Extra_Extra_Vision.Rentalsystem.LoginStateFactory.getLoginStateMessage;

public class LoginClass  extends Customer {
    private Map<String, String> loginCredentials;

    public LoginClass() {
        loginCredentials = new HashMap<>();
    }

    public String registerCustomer(String username, String password, CustomerClass customer) {
        if (!loginCredentials.containsKey(username)) {
            loginCredentials.put(username, encryptPassword(password));
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

    private boolean checkPassword(String inputPassword, String storedPassword) {
        // Password comparison logic should be implemented here
        return inputPassword.equals(storedPassword); // This is a placeholder
    }
}


