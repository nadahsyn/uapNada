// Di ShippingCostCalculator.java
package interfaces;

public interface ShippingCostCalculator {
    public static final int PRICE_PER_KG = 2000;
    double calculateCost(double massInKg);
}