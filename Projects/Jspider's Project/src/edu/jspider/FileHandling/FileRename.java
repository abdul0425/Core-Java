package edu.jspider.FileHandling;
import java.io.File;
public class FileRename {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\arsha\\Desktop\\Abc.txt");
		File rename=new File("C:\\Users\\arsha\\Desktop\\Mehmed.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(rename));
		}
		else
			System.out.println("File Doesn't exists");
	}
}
