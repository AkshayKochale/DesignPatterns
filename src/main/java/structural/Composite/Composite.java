package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements component
{
	
	private String name;
	 List<component> compo;
	
	

	public Composite(String name) {
		super();
		compo=new ArrayList<component>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
	
	
	public int price() 
	{
		int totalPrice=0;
		
		for(component c:compo) 
		{
			if(c.getClass().getName().equals(leaf.class.getName()))
			{
				totalPrice+=((leaf)c).getPrice();
			}
			else 
			{
				totalPrice+= ((Composite)c).price();
			}
		}
		System.out.println("Price for "+name+" total : "+totalPrice);
		return totalPrice;
	}

	public void name() 
	{
		
		
	}

	
	
	
}


 class leaf implements component
{
	 private int price;
	 private String name;

	 
	 
	 
	public leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int price() {
		// TODO Auto-generated method stub
		return price;
		
	}

	public void name() {
		// TODO Auto-generated method stub
		System.out.println(name);
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

	 
	
	
	 
}
 
 interface component
 {
	 int price();
	 void name();
 }