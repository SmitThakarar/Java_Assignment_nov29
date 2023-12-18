package com.assignment;

import java.util.Scanner;

public class Leapyear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("this year is leap year");
		}
		else
			System.out.println("this year is not a leap year");
		
	}

}
