package edu.jspider.Sep10;

public class SecondSmallestElementWithoutPositionChange {

	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		
		int s1=a[0];
		int s2=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]!=s1  &&  s1==s2 || a[i]<s2)
				s2=a[i];
		}
		System.out.println("Second Smallest : "+s2);
	}

}
