package edu.jspider.FileHandling;
import java.io.*;
public class Writer {

	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("D:\\Abc.txt");
			try
			{
				f.write("Java Is Very Beautiful Language !");
			}
			finally
			{
				f.close();
			}
			System.out.println("Data Written !");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
}
