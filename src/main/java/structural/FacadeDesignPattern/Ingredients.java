package structural.FacadeDesignPattern;

public class Ingredients 
{

	public String getIngredients(String type) 
	{
		switch(type) 
		{
			case "pizza": return "A,B,C";
			case "burger": return "x,y,z";
		
		}
		
		return null;
	}
	
	
}
