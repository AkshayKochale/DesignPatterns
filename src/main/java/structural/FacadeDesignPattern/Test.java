package structural.FacadeDesignPattern;

public class Test 
{
	
		public static void main(String[] args) 
		{
		
			FoodFacadeClass foodmaster=new FoodFacadeClass();
			Food pizza = foodmaster.getFood("Pizza");
			Food burger = foodmaster.getFood("burger");
			
			
		}
			
}
