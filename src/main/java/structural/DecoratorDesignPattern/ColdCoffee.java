package structural.DecoratorDesignPattern;

public class ColdCoffee extends CoffeeDecorator
{

	public ColdCoffee(int price ,CoffeeDecorator coffee) {
		super(price+coffee.getPrice());
		// TODO Auto-generated constructor stub
	}
	
	public ColdCoffee(int price) 
	{
		super(price);
	}
	
	void print() 
	{
		System.out.println(this.getPrice());
	}
	
}
