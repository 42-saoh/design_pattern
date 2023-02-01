package factory;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input Car Name");
            Factory fac = new CarFactory();
            Car car = fac.produceCar(input.nextLine());
            System.out.println(car);
            System.out.println("End? y or any key");
            if (input.nextLine().equals("y"))
                break ;
        }
    }
}