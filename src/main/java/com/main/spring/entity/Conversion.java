package com.main.spring.entity;

public class Conversion {
	private double userInput;
	
	
	public double convKiloToPound(double kilogram)
	{
		double pound = kilogram * 2.20462262;
		
		return pound;
	}
	
	public double PoundtoKiloGram(double pound)
	{
		double kilo=pound * 0.454;
		
		return kilo;
	}
	
	public double MiligramToPound(double miligram)
	{
		double pound=miligram * 0.0000022046;
		
		return pound;
	}
	
	
    public double pound2Miligram(double pound)
    
    {
    	double miligram = pound*453592; 
    	 
    	return miligram; 
    }
    
  public double MiligramToKilogram(double mili)
    
    {
    	double kilo =  mili*0.00001; 
    	 
    	return kilo; 
    }
	
  public double KilogramTOMiligram(double kilo)
  
  {
  	double miligram =  kilo* 1000000; 
  	 
  	return miligram; 
  }
  
	public double calculate(String methodFrom,String methodTo,double input)
	{
		methodFrom=methodFrom.toUpperCase();
		methodTo=methodTo.toUpperCase();
		
		if( methodFrom.equalsIgnoreCase("POUND") )
		{
			if(methodTo.equalsIgnoreCase("KILOGRAM"))
			{
				return PoundtoKiloGram(input);
			}
			
			if(methodTo.equalsIgnoreCase("MILIGRAM"))
				
			{
				return pound2Miligram(input); 
			}
	
		}
		
		else if(methodFrom.equalsIgnoreCase("KILOGRAM") )
		{
			if(methodTo.equalsIgnoreCase("POUND"))
				
				
			{
				return convKiloToPound(input);
			}
			
			if(methodTo.equalsIgnoreCase("MILIGRAM"))
			{
				return KilogramTOMiligram(input);
			}
			
			
		}
		else if(methodFrom.equalsIgnoreCase("MILIGRAM"))
		{
			if(methodTo.equalsIgnoreCase("POUND"))
			{
				return MiligramToPound(input);
			}
			
			if(methodTo.equalsIgnoreCase("KILOGRAM"))
					{
					return MiligramToKilogram(input);
					}
		}
		
	
		
	
		return -1;
	}
	
}
