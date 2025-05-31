package models;

import bases.Shape;
import interfaces.*; // Ini sudah bagus, bisa meringkas import

public class Torus extends Shape implements PiRequired, ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator {

    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        // Rumus volume Torus (doughnut) adalah 2 * PI^2 * R * r^2
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        // Rumus luas permukaan Torus (doughnut) adalah 4 * PI^2 * R * r
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
 
    public double getMass() {
    return DENSITY * getSurfaceArea() * THICKNESS;
    }


    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    // *** PERBAIKAN PENTING DI SINI ***
    // Tambahkan parameter 'massInKg' agar sesuai dengan interface
    public double calculateCost(double massInKg) {
        return Math.ceil(massInKg) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f cm^3%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f cm^2%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f gr%n", getMass());
        System.out.printf("Massa dalam kg  : %.2f kg%n", gramToKilogram());
        // *** PERBAIKAN PENTING DI SINI ***
        // Panggil calculateCost dengan parameter yang sesuai
        System.out.printf("Biaya kirim     : Rp%.0f%n", calculateCost(gramToKilogram()));
    }
}