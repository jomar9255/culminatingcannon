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
        
        
        System.out.println("dislacement is: "+Δdv1taFORΔdy(v1,t,a));
        System.out.println("initial vel is: "+Δdv1taFORv1(Δdv1taFORΔdy(v1,t,a),t,a));
    }
    
    public static double Δdv1taFORΔdy(double v1,double t,double a){
        // DECLARE Δ DISPLACEMENT VARIABLE
        double Δdy;

        // CALCULATE FOR Δ DISPLACEMENT
        Δdy=v1*t+0.5*a*Math.pow(t, 2);
        
        // RETURN
        return Δdy;
    }
    
    public static double Δdv1taFORv1(double Δdy,double t,double a){
        // DECLARE initial speed
        double v1;

        // CALCULATE FOR initial speed
        v1=(Δdy-(0.5*a*Math.pow(t, 2)))/t;
        
        // RETURN
        return v1;
    }
    
}
