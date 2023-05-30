package creational.AbstractFactory;

public class FoodFactory implements GenericFactory<FoodFactory, Food>{

	
	public FoodFactory creatFactory() {
		// TODO Auto-generated method stub
		return new FoodFactory();
	}

	public void setfactoryname() {
		// TODO Auto-generated method stub
		System.out.println("FoodFactory");
		
	}

	public Food build(String name) {
		// TODO Auto-generated method stub
		if(name.equals("veg"))
			return new VegFood();
		else 
			return new NonVeg();
		
	}

}
