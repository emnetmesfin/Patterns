/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;



public class LaunchEvent implements Runnable{
    
     int start;
     String message;
     timemonitor tm;
    
    public LaunchEvent(int start, String message,timemonitor tm) {
       this.start = start;
       this.message = message;
       this.tm = tm;
       
    }
     
    public void run(){
        boolean eventdone = false;
        while(!eventdone){
          try{
            Thread.sleep(10);
          }
          catch(InterruptedException e){ 
          }  
        }
        if(tm.get_time() <= start){
             System.out.println(this.message);
             eventdone = true;
        }
        
       
    }
    
    
    public static void main(String[] args) {
        
        CountDownClock clock = new CountDownClock(20);
        
        /*Runnable flood,ignition , liftoff;
        flood =  new LaunchEvent(16 ,"Flood the pad!" , (timemonitor) clock);
        ignition = new LaunchEvent(6, "start the engines!", (timemonitor) clock);
        liftoff = new LaunchEvent(0, "Liftoff!", (timemonitor) clock);
        
        clock.start();
        
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
        */
        new Thread(new LaunchEvent(18 , "Ready?",clock)).start();
        
        LaunchEvent x = new LaunchEvent(8,"again floo", clock);
        Thread T = new Thread(x);
        T.start();
        
         ArrayList<LaunchEvent> L = new ArrayList<LaunchEvent>();
        L.add(new LaunchEvent(17, "flood!!", clock));
        L.add(new LaunchEvent(7, "engins!!",clock));
        
        for(Runnable l :L){
        new Thread(l).start();
        }
          
        
    }
    
}
interface timemonitor{
    int get_time();
    
}
