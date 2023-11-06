package com.Extra_Extra_Vision.Rentalsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Basic Testing

// Currently cannot add much to testing as this is just our implementation phase

// However the following are some basic tests just making sure the customer class behaves correctly

class CustomerClassTest {

    private CustomerClass customer;

    @BeforeEach
    void setUp() {
        // Initializes a customer object before each test
        customer = new CustomerClass("123", "John Doe", "123 Main St", "555-1234", "john.doe@example.com");
    }

    @Test
    void canRentActiveAccount() {
        // Tests that an active account with zero balance can rent
        // This can be easily be changed to also incorperate balance
        assertTrue(customer.canRent());
    }

    @Test
    void canRentInactiveAccount() {
        // Tests that an inactive account cannot rent
        customer.setAccountStatus("Inactive");
        assertFalse(customer.canRent());
    }

    @Test
    void rentItem() {
        // Tests renting an item adds it to the current rentals
        String itemID = "Item001";
        customer.rentItem(itemID);
        assertTrue(customer.getCurrentRentals().contains(itemID));
    }

    @Test
    void returnItem() {
        // Tests returning an item removes it from the current rentals
        String itemID = "Item001";
        customer.rentItem(itemID);
        customer.returnItem(itemID);
        assertFalse(customer.getCurrentRentals().contains(itemID));
    }

    @Test
    void payFees() {
        // Tests paying fees correctly adjusts the balance
        customer.setBalance(100.0);
        customer.payFees(50.0);
        assertEquals(50.0, customer.getBalance());
    }

    @Test
    void invalidEmailThrowsException() {
        // Tests that an invalid email throws an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            customer.updateProfile("John Doe", "123 Main St", "555-1234", "invalid-email");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

}
