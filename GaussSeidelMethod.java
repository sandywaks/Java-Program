
import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

class GaussSeidelMethod
 { 
    double x = 0 , y=0, z=0;
    public void get(double n){
		
     System.out.println("Iteration     X          Y          Z");

	 for(int i =0 ; i<n; i++) 
	  {
	  x = (17 - y + (2*z))/20;
	  y =  (-18-(3*x)+z)/20;
      z =  (25 -(2*x) + (3*y))/20;	  
      System.out.println(i +"          " +getFourDecimalValue(x)+"       "+getFourDecimalValue(y)+ "      "+getFourDecimalValue(z));	  
	}
    
	}
		 
		
		 
	Object getFourDecimalValue(double d){
		DecimalFormat deciFormat = new DecimalFormat("#.####");
		return deciFormat.format(d);
	}	 

	 
     
public static void main(String... arg) {
    
    double n;
    Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Number of iteration : :");
	n = sc.nextDouble();

     GaussSeidelMethod obj = new GaussSeidelMethod();
	 obj.get(n);
   }
 }
 