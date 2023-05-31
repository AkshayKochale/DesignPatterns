package structural.DecoratorDesignPattern;

public class HotCoffee  extends CoffeeDecorator
{
	
	

	public HotCoffee(int price)
	{
		super(price);
	}

	public HotCoffee(int price,CoffeeDecorator coffee) {
		super(price+coffee.getPrice());
			
		// TODO Auto-generated constructor stub
	}
	
	void print() 
	{
		System.out.println(this.getPrice());
	}
	
	
}

