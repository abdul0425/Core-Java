import java.util.Scanner;

class Pattern
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



class Pattern1
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Pattern2
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Pattern3
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int k=2; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Pattern4
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space= n-1; int star = 1;
		
		for(int i=1; i<=n; i++)
		{
			
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<n/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		}
	}
}

class Pattern5
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space = n-1; int star = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2)
				star++;
			else
				star--;
		}
	}
}

class Pattern6
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space = n-1; int star = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star+=2;
		}
	}
}

class Pattern7
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space = 1; int star = n;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=2; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star-=2;
		}
	}
}

class Pattern8
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space = n-1; int star = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			
		}
	}
}

class Pattern9
{
	public static void main(String[] main)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if(i==j || i+j==n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class Pattern10
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int space = n-1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			int star= 2*i-1;
			for(int k=1; k<=star; k++)
			{
				if(k==1 || k==star || i==n)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}

class Pattern11
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int limit=n;
		for(int i=1; i<=n; i++)
		{
			
			for(int j=1; j<=limit; j++)
			{
				if(j==limit)
					System.out.print(j);
				else
				{
					System.out.print(j);
					System.out.print("*");
				}
			}
			System.out.println();
			limit--;
		}
	}
}

class Pattern12
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int limit=n;
		for(int i=1; i<=n; i++)
		{
			
			for(int j=n; j>=i; j--)
			{
				if(i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(j);
					System.out.print("*");
				}
			}
			System.out.println();
			limit--;
		}
	}
}
