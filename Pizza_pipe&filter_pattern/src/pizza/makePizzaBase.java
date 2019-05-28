
package pizza;

import java.util.Scanner;


public class makePizzaBase implements Runnable {
    String pizzaBase;
    @Override
    public void run() {
        Scanner input = new Scanner(System.in);
       System.out.println("please add Pizza Base:");
       pizzaBase = input.next();
       this.pizzaBase = pizzaBase;
       System.out.println("Now we are making: " + pizzaBase + "for our sauce");
    }

    String getPizzaBase() {
        return pizzaBase;
    }
}
