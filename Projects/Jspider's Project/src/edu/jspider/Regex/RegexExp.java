package edu.jspider.Regex;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class RegexExp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		String phon=sc.nextLine();
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher(phon);
		if(m.matches())
			System.out.println("Valid Number");
		else
			System.out.println("invalid");
	}

}
