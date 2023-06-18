package edu.jspider.FileHandling;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) throws IOException{
		File f=new File("C:\\Users\\arsha\\Desktop\\Xyz.txt");
//		try
//		{
//			if(f.createNewFile())
//				System.out.println("File successfully created.");
//			else
//				System.out.println("File exist with same name.");
//		}
//		catch(IOException e)
//		{
//			System.out.println(e.getMessage());
//		}
		//System.out.println(f.exists());
		
		if(f.createNewFile())
			System.out.println("file created.");
		else
			System.out.println("file already exist.");
	}
}
