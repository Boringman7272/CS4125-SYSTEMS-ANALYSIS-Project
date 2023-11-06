package com.Extra_Extra_Vision.Clerk;

import java.util.ArrayList;

public class Clerk {
    // declare attributes for the Clerk object
    private static ArrayList<Clerk> accounts = new ArrayList<Clerk>(); // the static ArrayList is used for indexing the Clerk accounts
    private String username;
    private String password;
    private boolean active;
    private boolean admin;

    // empty contructor that creates an account with default values
    public Clerk () {
        this.username = "NaN";
        this.password = "NaN";
        this.active = false;
        this.admin = false;
        accounts.add(this);
    }

    // populated constuctor to add fields
    public Clerk (String username, String password, boolean active, boolean admin) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.admin = admin;
        accounts.add(this);
    }

    // class to change a clerk's password (by an admin)
    public void changePassword(Clerk clerk, String password) {
        if (this.admin == true) {
            clerk.password = password;
        }
    }

    // get clerk based on the index of the accounts ArrayList
    public Clerk getClerk(int accountId) {
        return accounts.get(accountId);
    }

    // check if the user specified is active
    public boolean getActive() {
        return this.active;
    }

    // set the clerk to active/inactive
    public void setActive(boolean active) {
        this.active = active;
    }

    // deletes clerk if the clerk invoking the method is an admin
    public void deleteClerk(int accountId) {
        if (this.active == true) {
            accounts.remove(accountId);
        }
    }
}