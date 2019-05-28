
package pizza;

import java.util.Scanner;

public class chopVegetables implements Runnable{
    String vegitables;
    @Override
    public void run() {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter the necessary vegitables nedded to make a pizza:");
       vegitables = input.next();
       this.vegitables = vegitables;
        System.out.println("After choping  " + vegitables);
        System.out.println("The next step is adding the Base to hold the vegitables we prepared.");
            
    }

    public String getVegitable() {
        return vegitables;
    }
}
