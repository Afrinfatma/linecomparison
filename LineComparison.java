package com.bridgelabz.linecomparison;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LineComparison {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		DecimalFormat decForm=new DecimalFormat("0.##");
		double x1=0;
		double x2=0;
		double y1=0;
		double y2=0;
		double distance=0;
		System.out.println("please enter x1 coordinates");
		x1=scan.nextInt();
		System.out.println("please enter x2 coordinates");
		x2=scan.nextInt();
		System.out.println("please enter y1 coordinates");
		y1=scan.nextInt();
		System.out.println("please enter y2 coordinates");
		y2=scan.nextInt();
		
		scan.close();
		distance=Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
		System.out.println("The distance between the line" + decForm.format(distance));
	}
}