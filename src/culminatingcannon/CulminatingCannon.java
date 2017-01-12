
//hi will


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
        
        
        System.out.println("dislacement is: "+dv1taOFdy(v1,t,a));
        System.out.println("initial vel is: "+dv1taOFv1(dv1taOFdy(v1,t,a),t,a));
    }
    
    public static double dtOFv(double d, double t){
        // DECLARE A CONSTANT SPEED VARIABLE
        double v;
        
        // CALCULATE FOR VELOCITY
        v = d/t;
        
        // RETURN
        return v;
    }
    
    public static double dvOFt(double d, double v){
        // DECLARE A DELTA TIME VARIABLE
        double t;
        
        // CALCULATE FOR DELTA TIME
        t = d/v;
        
        // RETURN
        return v;
    }
    
    public static double tvFd(double t, double v){
        // DECLARE A DELTA DISPLACEMENT
        double d;
        
        // CALCULATE FOR DELTA DISPLACEMENT
        d = t*v;
        
        // RETURN
        return d;
    }
    
    
    // THIS IS SECTION 1 FOR PROJECTILE MOTION
    // IT USES THE FORMULA d = v1*t + 1/2 * a * t *t

    
    public static double dv1taOFdy(double v1,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double Δdy;

        // CALCULATE FOR Δ DISPLACEMENT
        Δdy=v1*t+0.5*a*Math.pow(t, 2);
        
        // RETURN
        return Δdy;
    }
    
    public static double dv1taOFv1(double Δdy,double t,double a){
        // DECLARE initial speed
        double v1;

        // CALCULATE FOR initial speed
        v1=(Δdy-(0.5*a*Math.pow(t, 2)))/t;
        
        // RETURN
        return v1;
    }
    
    public static double dv1tv1OFa(double Δdy,double t,double v1){
        // DECLARE ACCELERATION VARIABLE
        double a;

        // CALCULATE FOR initial speed
        a=(2*(Δdy-(v1*t)))/Math.pow(t, 2);
        
        // RETURN
        return a;
    }
    
    public static double dv1av1OFt(double Δdy,double a,double v1){
        // DECLARE ACCELERATION VARIABLE
        double t1, t2;
        double trueTime = 133742069; // set as wild number to verify for testing
        
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
    
    // THIS IS SECTION 1 FOR PROJECTILE MOTION
    // IT USES THE FORMULA d = v2*t - 1/2 * a * t *t
    public static double v2taOFdy(double v2,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double dy;

        // CALCULATE FOR Δ DISPLACEMENT
        dy = v2*t - (a*t*t)/2;
        
        // RETURN
        return dy;
    }
    
    public static double dytaOFv2(double dy,double t,double a){
        // DECLARE FINAL VELOCITY VARIBALE
        double v2;

        // CALCULATE FOR FINAL VELOCITY
        v2 = (dy+(a*t*t)/2)/t;
        
        // RETURN
        return v2;
    }
    
    public static double dyv2aOFt(double dy,double v2,double a){
        // DECLARE FINAL VELOCITY VARIBALE
        double t1, t2, trueTime = 0;

        // CALCULATE FOR FINAL VELOCITY
        t1 = (-v2 + Math.sqrt(v2*v2 - 4*(-a/2)*(-dy)))/2*(-a);
        t2 = (-v2 + Math.sqrt(v2*v2 - 4*(-a/2)*(-dy)))/2*(-a);
        
        // CHECK WHICH ONE OF THE TIMES IS VALID AND SET THE TRUE TIME TO IT
        if(t1<0){
           trueTime=t1; 
        }
        else if(t2<0){
            trueTime=t2;
        }
        
        return trueTime;
    }
    
    public static double dyv2tOFa(double dy,double v2,double t){
        // DECLARE ACCELERATION VARIABLE
        double a;

        // CALCULATE FOR initial speed
        a=(-2)*(dy-v2*t)/(t*t);
        
        // RETURN
        return a;
    }
    
    //Method to solve for the final velocity given the initial velocity, acceleration, and time
    //Uses the formula v2=v1+at
    public static double v1atOFv2(double v1, double a, double t){
        //Variable to be solved for
        double v2;
        //Formula to solve for variable
        v2 = v1+(a*t);
        //Return value
        return v2;
    }
    
    //Method to solve for the initial velocity given the final velocity, acceleration, and time
    //Uses the formula v1=v2-at
    public static double v2atOFv1(double v2, double a, double t){
        //Variable to be solved for
        double v1;
        //Formula to solve for variable
        v1 = v2-(a*t);
        //Return value
        return v1;
    }
    
    //Method to solve for the acceleration given the initial velocity, final velocity, and time
    //Uses the formula a=(v2-v1)/t
    public static double v1v2tOFa(double v1, double v2, double t){
        //Variable to be solved for
        double a;
        //Formula to solve for variable
        a=(v2-v1)/t;
        //Return value
        return a;
    }
    
    //Method to solve for the time given the initial velocity, final velocity, and acceleration
    //Uses the formula t=(v2-v1)/a
    public static double v1v2aOFt(double v1, double v2, double a){
        //Variable to be solved for
        double t;
        //Formula to solve for variable
        t=(v2-v1)/a;
        //Return value
        return t;
    }
    
    //Method to solve for the final velocity given the initial velocity, acceleration, and displacement
    //Uses the formula v2= square root(v1*v1+2ad)
    public static double v1adOFv2(double v1, double a, double d){
        //Variable to be solved for
        double v2;
        //Formula to solve for variable
        v2=Math.sqrt( (v1*v1) + (2*a*d) );
        //Return value
        return v2;
    }
    
    //Method to solve for the initial velocity given the final velocity, acceleration, and displacement
    //Uses the formula v1= square root(v2*v2-2ad)
    public static double v2adOFv1(double v2, double a, double d){
        //Variable to be solved for
        double v1;
        //Formula to solve for variable
        v1=Math.sqrt( (v2*v2) - (2*a*d) );
        //Return value
        return v1;
    }
    
    //Method to solve for the acceleration given the initial velocity, final velocity, and displacement
    //Uses the formula a = (v2*v2-v1*v1)/2d
    public static double v1v2dOFa(double v1, double v2, double d){
        //Variable to be solved for
        double a;
        //Formula to solve for variable
        a=((v2*v2)-(v1*v1))/(2*d);
        //Return value
        return a;
    }
    
    //Method to solve for the displacement given the initial velocity, final velocity, and acceleration
    //Uses the formula d = (v2*v2-v1*v1)/2a
    public static double v1v2aOFd(double v1, double v2, double a){
        //Variable to be solved for
        double d;
        //Formula to solve for variable
        d=((v2*v2)-(v1*v1))/(2*a);
        //Return value
        return d;
    }
    
    //Method to solve for the displacement given the initial velocity, final velocity, and time
    //Uses the formula d=((v2+v1)/2)*t 
    public static double v1v2tOFd(double v1, double v2, double t){
        //Variable to be solved for
        double d;
        //Formula to solve for variable
        d=((v2+v1)/2)*t;
        //Return value
        return d;
    }
    
    //Method to solve for the time given the initial velocity, final velocity, and displacement
    //Uses the formula t=2d/v2+v1
    public static double v1v2dOFt(double v1, double v2, double d){
        //Variable to be solved for
        double t;
        //Formula to solve for variable
        t=(2*d)/(v2+v1);
        //Return value
        return t;
    }
    
    //Method to solve for the final velocity given the initial velocity, displacement, and time
    //Uses the formula v2=2d/t-v1
    public static double v1dtOFv2(double v1, double d, double t){
        //Variable to be solved for
        double v2;
        //Formula to solve for variable
        v2=((2*d)/t)-v1;
        //Return value
        return v2;
    }
    
    //Method to solve for the initial velocity given the final velocity, displacement, and time
    //Uses the formula v1=2d/t-v2
    public static double v2dtOFv1(double v2, double d, double t){
        //Variable to be solved for
        double v1;
        //Formula to solve for variable
        v1=((2*d)/t)-v2;
        //Return value
        return v1;
    }


}
