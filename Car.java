public class Car {
    private int carCapacity;
    String model;
    int year;
    double price;
    String color;
    double power;
    boolean isEngine;
    boolean filled;
    String cargo;

    public Car(String model, int year, double price, String color, double power, int carCapacity, String cargo) {

        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.isEngine = false;
        this.filled = false;
        this.cargo = cargo;
        this.carCapacity = carCapacity;
    }

    public double getCarCapacity() {
        return carCapacity;
    }

    public void getInfo() {
        if (cargo == null)
            System.out.println(
                    "Model:" + model + ", year: " + year + ", price: " + price + ", color: " + color + ", power: "
                            + power);
        else
            System.out.println("Model:" + model + ", year: " + year + ", price: " + price + ", color: " + color
                    + ", power: " + power + " cargo " + cargo);
    }

    public void start() {
        this.isEngine = true;
        System.out.println(this.model + " is working");
    }

    public void stop() {
        this.isEngine = false;
        System.out.println(this.model + " is stopped");
    }

    public void road(String place) {
        if (this.isEngine) {
            System.out.println(this.model + " goes to " + place);
        } else {
            System.out.println(this.model + " is not working so we can't go eny where " + place);
        }
    }

    public void filTruck(String product) {
        this.filled = true;
        this.cargo = product;
        System.out.println("filling truck with " + product + " successfully");
    }

    public void hisFilled() {
        if (this.filled) {
            System.out.println(this.model + " truck is full");
        } else
            System.out.println(this.model + " truck if empty");
    }

}
