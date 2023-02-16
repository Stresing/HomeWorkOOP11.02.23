public class Program {
  public static void main(String[] args) {

    // orders.add(new Fruits("Ananas", "Green", 100, 67));
    Car car1 = new Car("Toyota", 2020, 12345, "gray", 1.6, 100, null);
    Car car2 = new Car("Toyota", 2022, 5363, "silver", 1.2, 100, null);
    Fruits fruts1 = new Fruits("Ananas", "Green", 100, 67);

    car1.getInfo();
    car2.getInfo();
    car1.start();
    car1.road("Rome");
 car1.hisFilled();
 car1.filTruck(fruts1.getNameFruts());
    
    car1.getInfo();

  }
}
// 