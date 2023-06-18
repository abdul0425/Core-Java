package edu.jspider.Sep09;

public class Engine {
	String engineNo;
	String engineModel;
	String engineType;
	
	
	public Engine(String engineNo, String engineModel, String engineType) {
		this.engineNo = engineNo;
		this.engineModel = engineModel;
		this.engineType = engineType;
	}


	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Engine))return false;
		Engine en=(Engine)obj;
		return engineModel.equals(en.engineModel) && engineNo.equals(en.engineNo) && engineType.equals(en.engineType);
	}
	
	
}
