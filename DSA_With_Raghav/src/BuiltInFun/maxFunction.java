package BuiltInFun;

import java.util.Scanner;

public class maxFunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		double no1 = sc.nextInt();
		double no2 = sc.nextInt();
		double no3 = sc.nextInt();
		double no4 = sc.nextInt();
		
		System.out.println(Math.max(Math.max(no1, no2), Math.max(no3, no4)));
		
	}
}
