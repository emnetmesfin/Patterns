
package patterns;

public class singletonClass {
    private static singletonClass instance;
    
    private singletonClass(){
    } 
    
    public static singletonClass getInstance(){
        if (instance == null)
            instance = new singletonClass();
        return instance;
            
        }
    
}

