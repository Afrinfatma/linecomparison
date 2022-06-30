package com.bridgelabz.linecomparison;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LineComparison {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		DecimalFormat decForm=new DecimalFormat("0.##");
		
		System.out.println("please enter x1 coordinates");
		double x1=scan.nextDouble();
		System.out.println("please enter x2 coordinates");
		double x2=scan.nextDouble();
		System.out.println("please enter y1 coordinates");
		double y1=scan.nextDouble();
		System.out.println("please enter y2 coordinates");
		double y2=scan.nextDouble();
		scan.close();
		double distance=Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
		System.out.println("The distance between the line:" +decForm.format(distance));
	}
}