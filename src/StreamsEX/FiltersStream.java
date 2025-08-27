package StreamsEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltersStream {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Alex", "Adamasds", "John"));

        Predicate<String> predicate1 = str -> str.contains("A");
        Predicate<String> predicate2 = str -> str.length()<5;

        List<String> resultAnd = nameList.stream()
                .filter(predicate1.and(predicate2))
                .collect(Collectors.toList());

        System.out.println(resultAnd);

        List<String> resultOR = nameList.stream()
                .filter(predicate1.or(predicate2))
                .collect(Collectors.toList());

        System.out.println(resultOR);

        List<String> resultNegate = nameList.stream()
                .filter(predicate1.or(predicate2.negate()))
                .collect(Collectors.toList());

        System.out.println(resultNegate);

        //default method in interface
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        //static method in interface
        System.out.println(Vehicle.getHorsePower(2500, 480));

    }
}

interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

class Car implements Vehicle {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}

