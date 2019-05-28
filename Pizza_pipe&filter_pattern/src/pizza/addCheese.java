
package pizza;

import java.awt.BorderLayout;
import java.util.Scanner;


public class addCheese {
    String addedcheese;
    
    public addCheese(AssembleParts ap){
        Scanner input = new Scanner(System.in);
        System.out.println("please add cheese:");
        String cheese = input.next();
        this.addedcheese = cheese;
        System.out.println(addedcheese + "  is added to your Pizza.");
        System.out.println("Your favorite Pizza is ready Now!!!");
    }
    public String getAddCheese(){
        return addedcheese;
    }
    
}
