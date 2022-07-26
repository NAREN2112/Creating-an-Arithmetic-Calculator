package com.oops.interfaceexample1;

import java.util.Scanner;

public class CalculatorDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator calc=new Calculator();
		int result;
		//Menu Driven program
		System.out.println("Enter 1. Addition 2 Subraction 3 Multiplication 4 Division ");
		int choice=sc.nextInt();
		switch(choice){
			case 1 :result=calc.addition(a, b);
					System.out.println("sum="+result);
					break;
			case 2 : result=calc.subraction(a, b);
			        System.out.println("Diff="+result);
			        break;
			case 3 : result=calc.multiplication(a, b);
			         System.out.println("M="+result);
			         break;
			case 4 : result=calc.division(a, b);
					 System.out.println("Q="+result);
					 break;
		}
		


	}

}
