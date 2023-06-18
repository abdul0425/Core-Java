package edu.jspider.Sep11;

public class ReverseSpiralNumber {

	
	static int[][] getArray(int size)
	{
		int[][] a=new int[size][size];
		int r=0,c=-1;
		char m='r';
		for(int i=size*size;i>=1;i--)
		{
			switch(m)
			{
			case 'r' :
				a[r][++c]=i;
				if(c==size-1 || a[r][c+1]!=0)
					m='d';
				break;
			case 'd' :
				a[++r][c]=i;
				if(r==size-1 || a[r+1][c]!=0)
					m='l';
				break;
			case 'l' :
				a[r][--c]=i;
				if(c==0 || a[r][c-1]!=0)
					m='u';
				break;
			case 'u' :
				a[--r][c]=i;
				if(a[r-1][c]!=0)
					m='r';
				break;
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		int[][] a=getArray(6);
		System.out.println("Reverse Spiral Number  :  ");
		for(int []t:a)
		{
			for(int n:t)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
