package edu.jspider.Aug05;

public class StringPermutation {

	static String swap(String s,int i,int j)
	{
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		return new String(a);
	}
	
	
	static void permutation(String s,int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		
		for(int i=start;i<=end;i++)
		{
			String s1=swap(s,start,i);
			permutation(s1,start+1,end);
		}
	}
	
	public static void main(String[] args) {
		String s="abc";
		permutation(s,0,s.length()-1);
	}
}
