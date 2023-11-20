package com.Extra_Extra_Vision.Clerk;

public class ClerkFactory {
    public static ClerkClass createClerk(String username, String password, boolean active, boolean admin) {
        return new ClerkClass(username, password, admin, admin);
    }
}
