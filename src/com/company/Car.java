package com.company;

public class Car {
    int averageMilesPerGallon;
    String licensePlate;
    boolean areTailingWorking;

    public Car(int inputAverageMPG, String inputLicensePlate, boolean inputTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.areTailingWorking = inputTaillightsWorking;
    }

    public void changeLicensePlate(String text) {
        this.licensePlate = text;
    }

    public static void main(String[] args) {
        Car car1 = new Car(12, "A1B2C3", true);
        Car car2 = new Car(14, "A3B4C5", false);

        System.out.println(car1.averageMilesPerGallon);
        System.out.println(car2.areTailingWorking);

        System.out.println(car1.licensePlate);
        car1.changeLicensePlate("D7F8G9");
        System.out.println(car1.licensePlate);
    }
}
