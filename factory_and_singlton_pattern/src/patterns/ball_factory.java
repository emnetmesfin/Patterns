
package patterns;

public class ball_factory {
    
    public static Ball create_ball(String s)
    {
        
        if(s.equals(Ball.basketball)){
            return new basketball(2);
        }
        else if(s.equalsIgnoreCase(Ball.softball)) {
            return new softball(7);
        }
        return null;
        
    }
        
}

