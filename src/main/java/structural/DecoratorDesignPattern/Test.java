package structural.DecoratorDesignPattern;

public class Test {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		CoffeeDecorator hotCoffee = new HotCoffee(10,new DarkCoffee(5));
		System.out.println(hotCoffee.getPrice());
		
		CoffeeDecorator coldDarkC=new ColdCoffee(55, new DarkCoffee(3,new HotCoffee(55)));
		System.out.println(coldDarkC.getPrice());
	}

}
