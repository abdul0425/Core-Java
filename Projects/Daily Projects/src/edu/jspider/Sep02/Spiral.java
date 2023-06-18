package edu.jspider.Sep02;
import edu.jspider.Resources.SpiralNumber;
public class Spiral {

	public static void main(String[] args) {
		int[][] a=SpiralNumber.spiral(5);
		for(int[] t:a)
		{
			for(int n:t)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
