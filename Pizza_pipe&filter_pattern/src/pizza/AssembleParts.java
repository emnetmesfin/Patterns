
package pizza;


public class AssembleParts {
    
    private String assembleParts = "";
    public AssembleParts(chopVegetables cv ,makePizzaBase mpb , makeSauce ms){
        Thread t1 = new Thread(cv);
        Thread t2 = new Thread(mpb);
        Thread t3 = new Thread(ms);
        
        t1.run();
        t2.run();
        t3.run();
        
        this.assembleParts = (cv.getVegitable()+ "," +mpb.getPizzaBase()+ "," +ms.getSauce());
        
    }
    
//    public String getAssembleParts(){
//       return assembleParts;
//    }

    public String getAssembleParts() {
        return assembleParts;
    }
}
