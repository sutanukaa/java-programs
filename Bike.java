import java.util.*;
public class Bike{
    double speed = 100.0;
    double distance = 20.0;
    double price;

public static void main(String[] args){
    Bike bike1 = new Bike();
    Bike bike2 = new Bike();
    bike1.price = 1500.0;
    bike2.price = 2000.0;
    System.out.println("Bike 1 Price: " + bike1.price);
    System.out.println("Bike 2 Price: " + bike2.price);
    System.out.println("Bike 1 Speed: " + bike1.speed);
    System.out.println("Bike 2 Speed: " + bike2.speed);
    System.out.println("Bike 1 Distance: " + bike1.distance);
    System.out.println("Bike 2 Distance: " + bike2.distance);

}
}