
package pizza;


public class Pizza {

    
    public static void main(String[] args) {
        chopVegetables cv = new chopVegetables();
        makeSauce ms = new makeSauce();
        makePizzaBase mpb = new makePizzaBase();
                
        AssembleParts ap = new AssembleParts(cv,mpb,ms);
        ap.getAssembleParts();
        
        addCheese cheese = new addCheese(ap);
        cheese.getAddCheese();
        
    }
    
}
