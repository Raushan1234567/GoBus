package com.raush;
import java.util.*;
import usersignup.dto.*;
import bus.dto.*;
import com.raush.dao.*;
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
		
		 System.out.println("Eneter Email");
		 String email=sc.next();
		 System.out.println("Enter Password");
		 String password=sc.next();
		 
		 Interface login=new ServiceImplementation();
		 
		 login.Usersignup(email,password);
		
	}

	 static void UserSignupUI(Scanner sc) {
		System.out.println("Eneter Email");
		String email=sc.next();
		
		System.out.println("Eneter Name");
		String name=sc.next();
		
		System.out.println("Eneter Password");
		String Password=sc.next();
		
		System.out.println("Eneter Address");
		String address=sc.next();
		
		System.out.println("Eneter MobileNo");
		String Mobile=sc.next();
		
		UserSignup user=new UserSignup(email,name,Password,address,Mobile);
		
		Interface use=new ServiceImplementation();
		
        use.Usersignup(user);
		
		
		
		
		
		 
		 
		
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
				Adminaddservice(sc);
				
			}
			else if(Pass!=Password){
				System.out.println("Enter correct password");
			}
			
		}
		else if(user!=Userid&&Pass!=Password)
		{
			System.out.println("Both userid and password are incorrect");
		}
		else {
			System.out.println("Enter correct userid");
		}
		
	}

	 static void Adminaddservice(Scanner sc) {
		 int c;
		 do {
				System.out.println("*********************WELCOME TO YATRI*********************");
				System.out.println("1. For Adding Bus Press 1");
				System.out.println("2. For Update press 2");
				System.out.println("3. For Delete press 3");
				System.out.println("4. For Search By BusName press 4");
				System.out.println("5. For print all Bus press 5");
				System.out.println("0. Exit");
			
				c=sc.nextInt();
				switch(c) {
				case 1:
					AdddbusUI(sc);
					break;
				case 2:
					UpdateBusUI(sc);
					break;
				case 3:
					DeleteUI(sc);
					break;
				case 4:
					PrintBusUI(sc);
					break;
				case 5:
					SearchBusUI(sc);
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

	  static void SearchBusUI(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	 static void PrintBusUI(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	static void DeleteUI(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	 static void UpdateBusUI(Scanner sc) {
		 
		 System.out.println("Enter id");
		 int id=sc.nextInt();
		 System.out.println("Enter Bus Name");
		 String name=sc.next();
		 System.out.println("Enter Bus Number");
		 String bnumber=sc.next();
		 System.out.println("Enter Bus Starting point");
		 String spoint=sc.next();
		 System.out.println("Enter Bus destination");
		 String dpoint=sc.next();
		 System.out.println("Enter Bus Fare");
		 double fare=sc.nextDouble();
		 System.out.println("Enter Bus Seat available");
		 int busseat=sc.nextInt();
		 
		
		 
         Interface b=new ServiceImplementation();
		 
		 b.Updatebus(id,name,bnumber,spoint,dpoint,fare,busseat);
	}

	 static void AdddbusUI(Scanner sc) {
		
		 System.out.println("Enter Bus Name");
		 String name=sc.next();
		 System.out.println("Enter Bus Number");
		 String bnumber=sc.next();
		 System.out.println("Enter Bus Starting point");
		 String spoint=sc.next();
		 System.out.println("Enter Bus destination");
		 String dpoint=sc.next();
		 System.out.println("Enter Bus Fare");
		 double fare=sc.nextDouble();
		 System.out.println("Enter Bus Seat available");
		 int busseat=sc.nextInt();
		 
		 Addbus bus=new Addbus(name,bnumber,spoint,dpoint,fare,busseat);
		 
		 Interface b=new ServiceImplementation();
		 
		 b.addbus(bus);
		 
		
	}

}
