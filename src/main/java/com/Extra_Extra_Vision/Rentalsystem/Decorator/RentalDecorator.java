package main.java.com.Extra_Extra_Vision.Rentalsystem.Decorator;

//abstract class, base class for decoratorsr
public abstract class RentalDecorator implements Rental {
    protected Rental decoratedRental;

    public RentalDecorator(Rental decoratedRental) {
        this.decoratedRental = decoratedRental;
    }

    @Override
    public double getCost() {
        return decoratedRental.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedRental.getDescription();
    }
}
