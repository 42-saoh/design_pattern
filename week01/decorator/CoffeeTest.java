package decorator;

import java.util.Scanner;

public class CoffeeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please input the type of coffee you want : K(Kenya), E(Ethiopia)");
            String coffeeType = input.nextLine();
            Coffee coffee;
            if (coffeeType.equals("K"))
                coffee = new KenyaCoffee();
            else if (coffeeType.equals("E"))
                coffee = new EthiopiaCoffee();
            else {
                System.out.println("Invalid input");
                continue ;
            }
            String decoratingType;
            while (true)
            {
                System.out.println("Please input the type of Decorating : L(Latte), M(Mocha), W(WhippedCream), any other key to exit");
                decoratingType = input.nextLine();
                if (decoratingType.equals("L"))
                    coffee = new Latte(coffee);
                else if (decoratingType.equals("M"))
                    coffee = new Mocha(coffee);
                else if (decoratingType.equals("W"))
                    coffee = new WhippedCreamMocha(coffee);
                else {
                    break;
                }
            }
            coffee.assemble();
            System.out.println("\nEnd of the program? (y or any other key)");
            if (input.nextLine().equals("y"))
                break;
        }
    }
}
