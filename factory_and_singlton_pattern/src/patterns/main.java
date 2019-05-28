/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author user
 */
public class main {
    
    public static void main(String[] args){
        
        singletonClass s1 = singletonClass.getInstance();
        singletonClass s2 = singletonClass.getInstance();
        
        if(s1 == s2)
            System.out.println("The objects are the same");
        else
            System.out.println("The objects are not the same");
        
        
        ////// for the ball factory..
        
        Ball b = ball_factory.create_ball(Ball.basketball);
        System.out.println(b.toString());
        
        ball_factory mf = new ball_factory();
        Ball B = mf.create_ball(Ball.softball);
        System.out.println(B);
        
        
    }
}
