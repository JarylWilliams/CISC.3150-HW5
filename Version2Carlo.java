/*
 *CISC. 3150 HW5
 * Monte Carlo Verison 2
 */

/**
 *
 * @author Jaryl
 */
import java.util.*;

class MonteCarlo 
{
    public double  h,k,r; //Center of circle (h,k) and radius r
   
    private  Random rn = new Random();
	public MonteCarlo(double h,double k,double r)
	{
	 this.h=h;
	 this.k=k;
	 this.r=r;
	}
	
        //X Coord Drop
	public double drop_X()
        {
		return (rn.nextDouble()*2*r)+(h-r);
	}
	
        //Y Coord Drop
	public double drop_Y()
        {
		return (rn.nextDouble()*2*r)+(k-r);
	}
	
        //Dot is in the circle
	public boolean insideCirle(double x , double y){
		
		return Math.pow((x-h), 2)+Math.pow((y-k), 2)<=Math.pow(r,2); //Equation for center of cirlce
	}
}


public class Version2Carlo {
    
     static MonteCarlo trial2 = new MonteCarlo(5,3,2); //Specific coordinates of the circle along with radius
     static int circle=0; //Circle count
     static int square =0; //Circle count
  public static void main(String[] args)
  {  		
      long before = System.currentTimeMillis();
   		
      
            for(int i=0; i<1000000000;i++){
   			double x = trial2.drop_X();
   			double y = trial2.drop_Y();
   			if(trial2.insideCirle(x, y)){
   				circle++; 				
   			}
   			square++;
   		}
                     // Calculation of Pi
   		System.out.println("The value of Pi is , "+circle*Math.pow((2*trial2.r), 2)/(square*Math.pow(trial2.r, 2)));
  System.out.println(System.currentTimeMillis()-before);
  
  
  }
}
