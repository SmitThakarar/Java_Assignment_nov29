package com.assignment;

import java.util.Scanner;

public class FindCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :- ");
		char checkVowel = sc.next().charAt(0);
		
		if(checkVowel == 'a' || checkVowel == 'e' || checkVowel == 'i' || checkVowel == 'o' || checkVowel == 'u') {
			System.out.println("Vowel...");
		}else if((checkVowel >= 'a' && checkVowel <= 'z') || (checkVowel >= 'A' && checkVowel <= 'Z')){
			System.out.println("Constant...");
		}else {
			System.out.println("Error!! .. Enter a character..");
		}
	}
	

}
