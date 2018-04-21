import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

class EulersMethod
 { 
 
     public void getValue(double n, double x, double y)
	 {
        double h = (x-0)/n , tempYn =y,f,yn;		 
		System.out.println(" X          Y         dy/dx          Yn   ");
		 for(int i = 0; i< n ;i++)
		 {
					 
			// to calculate f of dy / dx 
			x = i == 0 ? 0: x;
			f = getPolynomialValue(x, tempYn);
			//to calculate  iteration y value
			yn = tempYn +(h*f);
            System.out.print(""+getFourDecimalValue(x));
			y = i == 0 ? y : tempYn;
            System.out.print("        " +getFourDecimalValue(y));
            System.out.print("        "+ getFourDecimalValue(f));  
			System.out.println("        "+getFourDecimalValue(yn))            ;
		    x = x + h;
			tempYn = yn;
					
		 }
		 
		 
		 
	 }
	 double getPolynomialValue(double x, double y)
		 {
			 return (x+y);
		 }
		 
	Object getFourDecimalValue(double d){
		DecimalFormat deciFormat = new DecimalFormat("#.####");
		return deciFormat.format(d);
	}	 

	 
     
public static void main(String... arg) {
    double polynomial;
    double x0;
	double y0;
    double n;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number of iteration:: ");
	n = sc.nextDouble();
	//System.out.println(n);
	System.out.print("Enter the value of x0 and Y0:: ");
	x0 = sc.nextDouble();
	y0 = sc.nextDouble();

     EulersMethod obj = new EulersMethod();
	 obj.getValue(n, x0, y0);
   }
 }
 