package structural.FlyWeight;

import java.util.HashMap;

public class VehicalFactory 
{

	private static HashMap<String, Vehical> map=new HashMap<String, Vehical>();
	
	public static Vehical getVechial(String type,String colour) 
	{
		
		if(map.containsKey(type))return map.get(type);
		
		Vehical v=null;
		
		if(type.equalsIgnoreCase("bike"))
			v=new Bike(colour);
		else 
			v=new Truck(colour);
		
		
		map.put(type, v);
		
		return v;
		
	}
	
}
