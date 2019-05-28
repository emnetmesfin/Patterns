/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author user
 */
public class CountDownClock extends Thread implements timemonitor {
    
     private int i;
     
    public CountDownClock(int start){
        this.i = start;
    }
    
    public void run(){
        for(; i>=0; i--){
            System.out.println("T minus " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
    public int get_time(){
        return i;
    }
    
}
