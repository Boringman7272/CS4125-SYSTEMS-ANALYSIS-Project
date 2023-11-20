package com.Extra_Extra_Vision.Rentalsystem;

// This class provides a factory for creating login states
public class LoginStateFactory {

    // Enum to define possible login states
    public enum LoginState {
        LOGGED_IN,
        LOGGED_OUT,
        LOGIN_FAILED,
        PASSWORD_RESET_SUCCESSFUL,
        PASSWORD_RESET_FAILED
    }

    // Method to get a message based on the login state
    public static String getLoginStateMessage(LoginState state) {
        switch (state) {
            case LOGGED_IN:
                return "User successfully logged in.";
            case LOGGED_OUT:
                return "User logged out.";
            case LOGIN_FAILED:
                return "Login failed. Please check your username and password.";
            case PASSWORD_RESET_SUCCESSFUL:
                return "Password reset successful.";
            case PASSWORD_RESET_FAILED:
                return "Password reset failed. Please check your old password.";
            default:
                return "Unknown login state.";
        }
    }
}
