package main.java.com.Extra_Extra_Vision.Rentalsystem.Decorator;
//concrete class applies special offer to items
public class SpecialOfferDecorator extends RentalDecorator {
    private double discount;

    public SpecialOfferDecorator(Rental decoratedRental, double discount) {
        super(decoratedRental);
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return Math.max(0, super.getCost() - discount);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (special offer applied)";
    }
}
