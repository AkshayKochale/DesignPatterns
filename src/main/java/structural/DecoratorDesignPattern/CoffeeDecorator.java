package structural.DecoratorDesignPattern;

public class CoffeeDecorator 
{

	private int price;
	private String name;
	
	public CoffeeDecorator(CoffeeDecorator coffee) 
	{
		price+=coffee.getPrice();
	}
	
	
	public CoffeeDecorator(int price) 
	{
		this.price=price;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int price() {
		// TODO Auto-generated method stub
		return price;
	}

	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	
	
}
