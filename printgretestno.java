package com.assignment;

import java.util.Scanner;

public class printgretestno 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:- ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2:- ");
		int num2 = sc.nextInt();

		System.out.println("Enter number 3:- ");
		int num3 = sc.nextInt();

		if(num1>num2 && num1>num3) {
			System.out.println("A is greator...");
		}else if(num2>num1 && num2>num3){
			System.out.println("B is greator...");
		}else {
			System.out.println("C is greator...");
		}
	
	}

}
