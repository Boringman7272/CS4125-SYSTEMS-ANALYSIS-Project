package main.java.com.Extra_Extra_Vision.Rentalsystem.Decorator;
//concrete implementation of the rental interface, basic item with no extra 
public class StandardRental implements Rental {
    private double cost;
    private String description;

    public StandardRental(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
