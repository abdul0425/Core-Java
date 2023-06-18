package edu.jspider.Sep01;

public class Permutation {
	
	static String swap(String s,int i,int j)
	{
		char[] arr=s.toCharArray();
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return new String(arr);
		
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
		String s="abcd";
		permutation(s,0,s.length()-1);
	}

}
