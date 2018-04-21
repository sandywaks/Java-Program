import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

class ModifiedEulersMethod
 { 
 
     public void getValue(double n, double x, double y0, double h )
	 {
        double x1 = x/n , tempYn = y0 ,f,yn = 0;		
        double ynArray[] = new double[50];
		 
		 for(int j = 0 ; j < ynArray.length ; j ++){
			 ynArray[j] = 0;
		 }
		 
		double x0 = 0;
		int k = 1;
        for(int i= 0 ; i < n; i++){
		y0 = tempYn;	
		yn = y0 + (h * getPolynomialValue(x0, y0));
		ynArray [k] = yn;
		
		System.out.println("yn    ::  "+getFourDecimalValue(yn));
		while(ynArray[k] != ynArray[k-1]){
		tempYn = y0 + ( h/2 * (getPolynomialValue(x0, y0) + getPolynomialValue(x1, yn)));
		System.out.println("yn     ::"+getFourDecimalValue(tempYn));
		yn = tempYn;
		ynArray[k+1] = tempYn;
		k++;
		}
		System.out.println("Y value After" + i +" iteration is::  " + getFourDecimalValue(tempYn)); 
		
		y0 = tempYn;
		x0 = x1;
		x1 = x1 +x1; 
	 }
		
		
		 
		 
		 
	 }
	 double getPolynomialValue(double x, double y)
		 {
			 return (x+y);
		 }
		 
	Object getFourDecimalValue(double d){
		DecimalFormat deciFormat = new DecimalFormat("#.############");
		return deciFormat.format(d);
	}	 

	 
     
public static void main(String... arg) {
    double x0;
	double y0;
    double n;
	double h;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println();
	System.out.print("Enter the Number of iteration:: ");
	n = sc.nextDouble();
	//System.out.println(n);
	System.out.print("Enter the value of x0 and y0 and h:: ");
	x0 = sc.nextDouble();
	y0 = sc.nextDouble();
	h = sc.nextDouble();

     ModifiedEulersMethod obj = new ModifiedEulersMethod();
	 obj.getValue(n, x0, y0, h);
   }
 }
 