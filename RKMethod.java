import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

class RKMethod
 { 
 
     public void getValue(double x, double y, double h)
	 {
		 double k1, k2, k3 , k4;
         k1 = h * getPolynomialValue(x, y);
		 System.out.println("Value of K1 =  "+getFourDecimalValue(k1));
		 
		 
		 k2 = h * getPolynomialValue((getPolynomialValue(x, h/2)),(getPolynomialValue(y, k1/2)));
		 System.out.println("Value of K2 =  "+getFourDecimalValue(k2));

		 k3 = h * getPolynomialValue((getPolynomialValue(x, h/2)),(getPolynomialValue(y, k2/2)));
		 System.out.println("Value of K3 =  "+getFourDecimalValue(k3));
		 
		 k4 = h * getPolynomialValue((getPolynomialValue(x, h)),(getPolynomialValue(y, k3)));
		 System.out.println("Value of K2 =  "+getFourDecimalValue(k4));

		 double k = (k1 + (2*k2) + (2*k3)+ k4)/6;
		 System.out.println(" Resultant Value using Runge-Kutta method is :: "+ getFourDecimalValue(k)) ;

		 
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
    double h;
    double x0;
	double y0;
    double n;
    Scanner sc = new Scanner(System.in);

	System.out.println("Enter the value of x0 and Y0 and h:: ");
	x0 = sc.nextDouble();
	y0 = sc.nextDouble();
	h = sc.nextDouble();

     RKMethod obj = new RKMethod();
	 obj.getValue(x0, y0, h);
   }
 }
 