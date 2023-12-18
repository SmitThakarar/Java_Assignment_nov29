package com.assignment;

import java.util.Scanner;

public class sumandfindavg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg=0;
		for(int i=1;i<=5;i++)
		{
			int a= sc.nextInt();
			sum+=a;
			avg=sum/5;
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
	}

}
