package edu.jspider.OOP;

import java.util.Scanner;

public class MiniATM {

	String customerName;
	long accountNumber;
	long mobileNumber;
	String address;
	static int myBalance = 50000;
	
	public MiniATM(String customerName, long accountNumber, long mobileNumber, String address) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	void customerDetails()
	{
		System.out.println("Account Holder       : "+customerName);
		System.out.println("Account Number       : "+accountNumber);
		System.out.println("Mobile Number        : "+mobileNumber);
		System.out.println("Address              : "+address);
		System.out.println("Your Current Balance : "+myBalance);
	}

	public static void myBalance(int withdraw, int deposite)
	{
		
		if(deposite==0)
			myBalance = 50000-withdraw;
		if(withdraw==0)
			myBalance = 50000+deposite;
	}
	
	public static void deposite(int amount)
	{
		myBalance(0,amount);
		System.out.println("Amount Deposited Successfully.");
	}
	
	public static void withdraw(int amount)
	{
		myBalance(amount,0);
		if(amount%100!=0)
		{
			System.out.println("Enter Multiple Of 100 Only.");
			return;
		}
		if(amount/2000>0)
		{
			System.out.println("2000 x "+amount/2000);
			amount%=2000;
		}
		if(amount/500>0)
		{
			System.out.println("500 x "+amount/500);
			amount%=500;
		}
		if(amount/200>0)
		{
			System.out.println("200 x "+amount/200);
			amount%=200;
		}
		if(amount/100>0)
		{
			System.out.println("100 x "+amount/100);
		}
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		MiniATM customer1 = new MiniATM("Arshad Alam",123456789,987654321,"Bengaluru");
		System.out.println(".     Welcome To Mini ATM     .");
		System.out.println("...............................");
		System.out.println();
		
		int pass1=1234; int pass2=4321; int pass3=1111; int pass4=0000;
		
	while(true)
	{
		System.out.println("1.Home "
				+ "2.Banking "
				+ "3.About");
		System.out.println();
		System.out.println("Slect Option.");
		int choice = obj.nextInt();
		if(choice==1)
		{
			System.out.println("Branch : Bengaluru");
			System.out.println("Branch Code : 7129");
			System.out.println("Address : Marathahalli,Bengaluru-721519");
			System.out.println();
		}
		else if(choice==2)
		{
			System.out.println("Login Here...");
			System.out.println();
			System.out.println("Please Enter Your Password.");
			System.out.println();
			System.out.println("Suggestion's : 0000 1111 1234 4321");
			int password =  obj.nextInt();
			System.out.println();
			
			if(password==pass1||password==pass2||password==pass3||password==pass4)
			{
				System.out.println("Login Successful.");
				System.out.println();
				System.out.println("1.Cash Withdraw "
						+ " 2.Cash Deposite "
						+ " 3.Balance Enquiry");
				System.out.println("Choice ?.");
				int option = obj.nextInt();
				if(option==1)
				{
					System.out.println("Enter the Amount ?");
					int amount = obj.nextInt();
					MiniATM.withdraw(amount);
					System.out.println();
					System.out.println("Do You Want to Continue  Y/y or N/n");
					char c = obj.next().charAt(0);
					if(c=='Y'||c=='y')continue;
					else break;
				}
				else if(option==2)
				{
					System.out.println("Enter the Amount to Deposite ?");
					int amount = obj.nextInt();
					MiniATM.deposite(amount);
					
					System.out.println();
					System.out.println("Do You Want to Continue  Y/y or N/n");
					char c = obj.next().charAt(0);
					if(c=='Y'||c=='y')continue;
					else break;
				}
				else if(option==3)
				{
					customer1.customerDetails();
					System.out.println();
					System.out.println("Do You Want to Continue  Y/y or N/n");
					char c = obj.next().charAt(0);
					if(c=='Y'||c=='y')continue;
					else break;
				}
			}
			else
			{
				System.out.println("You Have Entered Wrong Password");
				System.out.println("Try Again !");
				System.out.println();
				continue;
			}
		}
		else if(choice==3)
		{
			System.out.println("Marathahalli Branch Details.");
			System.out.println();
			System.out.println("Department Head  :  James Goslin");
			System.out.println("Manager          :  Allen Mark");
			System.out.println("Executive        :  Mark Wood");
			System.out.println();
			System.out.println("Complain Number  :  9988776655");
			System.out.println("Service Number   :  5544332211");
			System.out.println();
		}
			
		}
		
	}

}
