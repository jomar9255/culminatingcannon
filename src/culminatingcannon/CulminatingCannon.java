package culminatingcannon;

/**
 *
 * @author wipri9236
 */
public class CulminatingCannon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARATIONS / INITIALZATIONS
        double v1=10, t=6,a=-9.8;
        
        
        System.out.println("dislacement is: "+Δdv1taOFΔdy(v1,t,a));
        System.out.println("initial vel is: "+Δdv1taOFv1(Δdv1taOFΔdy(v1,t,a),t,a));
    }
    
    public static double ΔdΔtOFv(double Δd, double Δt){
        // DECLARE A CONSTANT SPEED VARIABLE
        double v;
        
        // CALCULATE FOR VELOCITY
        v = Δd/Δt;
        
        // RETURN
        return v;
    }
    
    public static double ΔdvOFΔt(double Δd, double v){
        // DECLARE A DELTA TIME VARIABLE
        double Δt;
        
        // CALCULATE FOR DELTA TIME
        Δt = Δd/v;
        
        // RETURN
        return v;
    }
    
    public static double ΔtvOFΔd(double Δt, double v){
        // DECLARE A DELTA DISPLACEMENT
        double Δd;
        
        // CALCULATE FOR DELTA DISPLACEMENT
        Δd = Δt*v;
        
        // RETURN
        return Δd;
    }
    
    
    // THIS IS SECTION 1 FOR PROJECTILE MOTION
    // IT USES THE FORMULA d = v1*t + 1/2 * a * t *t
    
    public static double Δdv1taOFΔdy(double v1,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double Δdy;

        // CALCULATE FOR Δ DISPLACEMENT
        Δdy=v1*t+0.5*a*Math.pow(t, 2);
        
        // RETURN
        return Δdy;
    }
    
    public static double Δdv1taOFv1(double Δdy,double t,double a){
        // DECLARE initial speed
        double v1;

        // CALCULATE FOR initial speed
        v1=(Δdy-(0.5*a*Math.pow(t, 2)))/t;
        
        // RETURN
        return v1;
    }
    
    public static double Δdv1tv1OFa(double Δdy,double t,double v1){
        // DECLARE ACCELERATION VARIABLE
        double a;

        // CALCULATE FOR initial speed
        a=(2*(Δdy-(v1*t)))/Math.pow(t, 2);
        
        // RETURN
        return a;
    }
    
    
    /* LOOK INTO THIS ASK ETHAN */
    public static double Δdv1av1OFt(double Δdy,double a,double v1){
        // DECLARE ACCELERATION VARIABLE
        double t1, t2;
        double trueTime = 999999; // set as wild number to verify for testing
        
        // CALCULATE FOR initial speed
        t1=(-2*v1+Math.sqrt(Math.pow(2*v1, 2)-4*(a*(-2*Δdy))))/2*a;
        t2=(-2*v1-Math.sqrt(Math.pow(2*v1, 2)-4*(a*(-2*Δdy))))/2*a;
        
        // CHECK WHICH ONE OF THE TIMES IS VALID AND SET THE TRUE TIME TO IT
        if(t1<0){
           trueTime=t1; 
        }
        else if(t2<0){
            trueTime=t2;
        }
        
        return trueTime;
    }
}
