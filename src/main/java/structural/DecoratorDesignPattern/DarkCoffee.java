package structural.DecoratorDesignPattern;

public class DarkCoffee extends CoffeeDecorator
{
	
	

	public DarkCoffee(int price)
	{
		super(price);
		// TODO Auto-generated constructor stub
	}

	public DarkCoffee(CoffeeDecorator coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public DarkCoffee(int price ,CoffeeDecorator coffee) {
		super(price+coffee.getPrice());
	
	}
	
	void print() 
	{
		System.out.println(this.getPrice());
	}
	


}

