package edu.jspider.Sep15;

public class BrowserFactory {

	void createBrowser(String s)
	{
		Browser b;
		if(s.equalsIgnoreCase("Chrome"))
		{
			b=new Chrome();
			b.start();
		}
		else if(s.equalsIgnoreCase("MozillaFirefox"))
		{
			b=new MozillaFirefox();
			b.start();
		}
		else if(s.equalsIgnoreCase("Opera"))
		{
			b=new Opera();
			b.start();
		}
		else if(s.equalsIgnoreCase("Safari"))
		{
			b=new Safari();
			b.start();
		}
		else if(s.equalsIgnoreCase("UcBrowser"))
		{
			b=new UcBrowser();
			b.start();
		}
	}
}
