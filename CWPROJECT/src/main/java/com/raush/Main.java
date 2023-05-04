package com.raush;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int c;
		do {
			System.out.println("*********************WELCOME TO YATRI*********************");
			System.out.println("1. For admin login press 1");
			System.out.println("2. For user signup press 2");
			System.out.println("3. For user login press 3");
			System.out.println("0. Exit");
		
			c=sc.nextInt();
			switch(c) {
			case 1:
				AdminUI(sc);
				break;
			case 2:
				UserSignupUI(sc);
				break;
			case 3:
				UserloginUI(sc);
				break;
			case 0:
				System.out.println("Thanks Visit Again");
				break;
				default :
					System.out.println("**********Invalid Entry,Plesa enter valid choice***********");
					break;
			}
			
		}while(c!=0);
		sc.close();
		
		

	}

	 static void UserloginUI(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	 static void UserSignupUI(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	 static void AdminUI(Scanner sc) {
		String Userid="Raushan";
		String Password ="1234";
		System.out.print("Enter Userid");
		String user =sc.next();
		System.out.print("Enter Password");
		String Pass =sc.next();
		
		if(user.equals(Userid)) {
			if(Pass.equals(Password)){
				System.out.println("Login Success");
			}
			else if(Pass!=Password){
				System.out.println("Enter correct password");
			}
			
		}
		
		else {
			System.out.println("Enter correct userid");
		}
		
	}

}
