package edu.jspider.ATMmachine;

import java.util.Scanner;

public class ATMmachine 
{
	
	//Check Balance Method.
	public static int myBalance(int deposite, int withdraw)
	{
		int myBalance = 100000;
		if(deposite != 0)
		{
			myBalance+=deposite;
		}
		if(withdraw != 0)
		{
			myBalance-=withdraw;
		}
		return myBalance;
	}
	

	
	// Deposits Method
	public static int deposite(int deposite)
	{
		myBalance(deposite, 0);
		return deposite;
	}
	
	//Withdraw Method
	public static int withdrawal(int amount)
	{
		if(amount%100 != 0)
		{
			System.out.println("Please enter x100 only.");
			return 0;
		}
		int withdrawBalance = myBalance(0,amount);
		System.out.println("Your Current Balance After Withdraw :"+withdrawBalance);
		while(amount!=0)
		{
			if(amount/2000 != 0)
			{
				System.out.println("2000 x : "+ amount/2000);
				amount%=2000;
			}
			if(amount/500 != 0)
			{
				System.out.println("500 x : "+ amount/500);
				amount%=500;
			}
			if(amount/200 != 0)
			{
				System.out.println("200 x : "+ amount/200);
				amount%=200;
			}
			if(amount/100 != 0)
			{
				System.out.println("100 x : "+ amount/100);
				amount%=100;
			}
			System.out.println();
			System.out.println();
			System.out.println(".    Thank You, Visit Again     . ");
		}return 0;
	}
	
	
//	Password Verification
	public static boolean password(int pass)
	{
//		System.out.println("Please Enter Your Password -");
		int password4 = 1234;
		int password1 = 0000;
		int password2 = 4321;
		int password3 = 1111;
		
		if(pass==password1 || pass==password2 || pass==password3 || pass==password4)
		{
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println(".           Welcome To SBI ATM.           .");
		System.out.println();
		System.out.println("Enter your Password...");
		System.out.println();
		int ATMBalance = 50000;
		int myBalance = 100000;
//		System.out.println();
		int pass = obj.nextInt();
		for(int i=1; i<4; i++)
		{
			if(password(pass))
			{
				System.out.println("Logged In.");
				System.out.println("_________");
				System.out.println();
				System.out.println();
				
			    while(true)
				{
					System.out.println("1.Saving Account :");
					System.out.println("2.Current Account :");
					System.out.println();
//					System.out.println();
					System.out.println("Choose an Option...");
					int input = obj.nextInt();
					if(input==1)
					{
						System.out.println("1.Amount Withdraw...");
//						System.out.println("Notes Available : 100 , 200 , 500 , 2000 .");
						System.out.println("2.Amount Deposit.");
						System.out.println("3.Check Balance.");
						System.out.println();
						System.out.println("Choose Option...");
						System.out.println();
						int option = obj.nextInt();
						if(option==1)
						{
							System.out.println("Enter the Amount ?");
							int amount = obj.nextInt();
							ATMmachine.withdrawal(amount);
							break;
						}
						else if(option==2)
						{
							System.out.println("Enter the Amount ?");
							int deposite = obj.nextInt();
							ATMmachine.deposite(deposite);
							break;
						}
						else if(option==3)
						{
							int balance = ATMmachine.myBalance(0,0);
							System.out.println("Your Balance is = "+ balance);
							break;
						}
					}
					else if(input==2)
					{
						System.out.println();
						System.out.println("1.Amount Withdrawal.");
//						System.out.println("Notes Available : 100 , 200 , 500 , 2000 .");
						System.out.println("2.Amount Deposite.");
						System.out.println("3.Check Balance.");
						System.out.println();
						System.out.println("Choose Option...");
						System.out.println();
						int option = obj.nextInt();
						if(option==1)
						{
							System.out.println("option1");
						}
						else if(option==2)
						{
							System.out.println("option2");
						}
						else if(option==3)
						{
							System.out.println("option3");
						}
					}
					System.out.println();
					System.out.println();
					
					System.out.println("Do You Want To Continue ?.. Y/y OR N/n");
					char c = obj.next().charAt(0);
					if(c == 'y' || c == 'Y')
						continue;
					else
						break;
				}
			}
			else
			{
				System.out.println("Wrong Password.");
			}
			
			System.out.println();
			
			System.out.println("Do You Want To Continue ?.. Y/y OR N/n");
			char c = obj.next().charAt(0);
			if(c == 'y' || c == 'Y')
				continue;
			else
				break;
		}
	}
}
