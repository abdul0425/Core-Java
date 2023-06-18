package edu.jspider.Sep15;

import java.util.Scanner;

public class BrowserApp {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		BrowserFactory bf=new BrowserFactory();
		System.out.println("Available Browser's");
		System.out.println("=====================");
		System.out.println("1.Chrome 2.Uc Browser 3.Safari 4.Firefox 5.Opera");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1 :
			bf.createBrowser("Chrome");
			break;
		case 2 :
			bf.createBrowser("UcBrowser");
			break;
		case 3 :
			bf.createBrowser("Safari");
			break;
		case 4 :
			bf.createBrowser("MozillaFirefox");
			break;
		case 5 :
			bf.createBrowser("Opera");
			break;
		}
	}

}
