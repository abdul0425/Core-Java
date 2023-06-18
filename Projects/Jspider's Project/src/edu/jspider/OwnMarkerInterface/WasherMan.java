package edu.jspider.OwnMarkerInterface;

public class WasherMan {

	public void wash(Object arg)
	{
		if(!(arg instanceof Car))throw new ClassCastException();
		System.out.println("Vehicle is being washed.");
	}
}
