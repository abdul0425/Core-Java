package edu.jspider.FileHandling;
import java.io.File;
import java.io.IOException;

public class FileInformation {

	public static void main(String[] args) throws IOException{
		File f=new File("D:\\Abc.txt");
		f.createNewFile();
		if(f.exists())
		{
			System.out.println("File Name  :  "+f.getName());
			System.out.println("Path  :  "+f.getAbsolutePath());
			System.out.println("Write  :  "+f.canWrite());
			System.out.println("Readable  :  "+f.canRead());
			System.out.println("Length  :  "+f.length());
			//System.out.println("Remove  :  "+f.delete());
		}
		else
			System.out.println("File Does't exist !");
	}

}
