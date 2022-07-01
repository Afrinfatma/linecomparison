package com.bridgelabz.linecomparison;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LineComparison {
	public static void main(String[] args){
	   
		Scanner scan=new Scanner(System.in);
		DecimalFormat decForm=new DecimalFormat("0.##");
		
		System.out.println("please enter x1 coordinates");
		double x1 =scan.nextDouble();
		System.out.println("please enter y1 coordinates");
		double y1=scan.nextDouble();
		System.out.println("please enter x2 coordinates");
		double x2=scan.nextDouble();
		System.out.println("please enter y2 coordinates");
		double y2=scan.nextDouble();
		System.out.println("please enter x3 coordinates");
		double x3=scan.nextDouble();
		System.out.println("please enter y3 coordinates");
		double y3=scan.nextDouble();
		System.out.println("please enter x4 coordinates");
		double x4=scan.nextDouble();
		System.out.println("please enter y4 coordinates");
		double y4=scan.nextDouble();
		
		
		scan.close();
		Double distance1=Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
		Double distance2=Math.sqrt(Math.pow(x4-x3,2)+(Math.pow(y4-y3,2)));
		System.out.println("The distance between the line1 :" +decForm.format(distance1));
		System.out.println("The distance between the line2 :" +decForm.format(distance2));
		
		
		int compareValue = distance1.compareTo(distance2);
		  
        if (compareValue == 0) {
            System.out.println("distance1 and distance2 are equal");
        }
        else if (compareValue < 0) {
            System.out.println("distance1 is less than distance2");
        }
        else {
            System.out.println("distance1 is greater than distance2");
    }
}
			
		}
		
	
	
