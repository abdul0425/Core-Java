package edu.jspider.FileHandling;
import java.io.*;
public class ReadFIle {

	public static void main(String[] args) {
		try
		{
			FileReader r=new FileReader("D:\\Abc.txt");
			try
			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.print((char)i);
				}
				
			}
			finally
			{
				r.close();
				System.out.println();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
