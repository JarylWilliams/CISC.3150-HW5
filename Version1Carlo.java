/*
 * CISC.3150 HW5
 * MonteCarlo Version 1
 */

/**
 *
 * @author Jaryl
 */
import java.util.*;
 
//http://www.mathresource.iitb.ac.in/linear%20algebra/FinalPi_Method/dots/index.html 
//https://stackoverflow.com/questions/25346042/monte-carlo-simulation-of-pi-in-simple-java
class MonteCarlo {
    
         double circle,x,y,Pi;
    public double calcPi(double a)
    {
            
            circle=0; //dots in circle
        
        for(double i=1;i<a;i++)
        {
            
            x=Math.random()*2-1; //X coord dots
            y=Math.random()*2-1; // Y coord dots
            
            if(Math.pow(x, 2)+Math.pow(y, 2) <=1)
                circle++;  
        
        }
       Pi=(circle/a)*4; //Calculates Pi
        return Pi;
    }
}

public class Version1Carlo {
   
    static Scanner sc=new Scanner(System.in);
   
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
            System.out.println("Please enter the number of dots:");
        
       double a=sc.nextDouble();
       
       MonteCarlo trial1=new MonteCarlo();
       
        
            System.out.println("The value of Pi is: "+trial1.calcPi(a));
        
            System.out.println(System.currentTimeMillis()-before);
    }
}
