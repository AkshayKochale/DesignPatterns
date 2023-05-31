package structural.FacadeDesignPattern;

public class FoodFacadeClass 
{

	
	public Food getFood(String type) 
	{
		
		if(type.equalsIgnoreCase("pizza")) 
		{
		
			Pizza pizza= new Pizza();
			pizza.prepare(new Ingredients().getIngredients("pizza"));
			pizza.delivary(pizza.getItems());
		
			return pizza;
		}
		else 
		{
	
			Burger burger=new Burger();
			burger.prepare(new Ingredients().getIngredients("burger"));
			burger.delivary(burger.getItems());
			
			return burger;
		}
		
	}
	
	
}
