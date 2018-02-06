package com.phone;

public class FactoryDesignPatternClass {
	
	
	public OS getInstance(String str)
	{
		
		
		
		if(str.equals("open"))
			return new Android();
			
		else if(str.equals("secured"))
		return new IOS();	
		
		else
			return new Windows();
		
	}

}
