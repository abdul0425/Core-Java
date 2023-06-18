package edu.jspider.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter Password");
		//String password=s.nextLine();
		String password="[0-9]{8-20}";
		Pattern p=Pattern.compile(password);
		Matcher m=p.matcher("13213215153");
		if(m.matches())
			System.out.println("Corrrect Password");
		else
			System.out.println("Invalid Password");
	}

}
