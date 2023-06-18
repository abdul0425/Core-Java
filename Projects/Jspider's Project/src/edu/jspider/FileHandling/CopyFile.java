package edu.jspider.FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class CopyFile {

	public static void main(String[] args) throws IOException{
		FileInputStream read=new FileInputStream("C:\\Users\\arsha\\Desktop\\Arshad.txt");
		FileOutputStream write=new FileOutputStream("C:\\Users\\arsha\\Desktop\\Mehmed.txt");
		int i;
		while((i=read.read())!=-1)
		{
			write.write((char)i);
		}
		System.out.println("Data Copied !");
	}
}
