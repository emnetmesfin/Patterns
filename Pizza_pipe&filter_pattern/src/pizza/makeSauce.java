
package pizza;

import java.util.Scanner;


public class makeSauce implements Runnable{
    String sauce = "";
    @Override
    public void run() {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter the ingridiants of your sause: ");
       sauce = input.next();
       this.sauce = sauce;
       System.out.println("lets bake the sauce by using:  " + sauce);
        System.out.println("Now we are left with only one thing to finish our pizza , only cheese remains");
    }

    String getSauce() {
       return sauce;
    }
}
