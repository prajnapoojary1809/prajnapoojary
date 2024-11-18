package Task3.Problem1;

public class Car {
    String make;
    String model;
    int year;

    //constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public void details() {
        System.out.println("The car: " + this.model + " was made by:" + this.make + " in " + this.year);

    }

}
