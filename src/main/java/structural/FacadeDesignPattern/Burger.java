package structural.FacadeDesignPattern;

public class Burger implements Food 
{

	private String items;	
	
	
	
	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	
	public void prepare(String items) {
		// TODO Auto-generated method stub
		this.items=items;
		
	}

	public void delivary(String food) {
		// TODO Auto-generated method stub
		System.out.println("item req for burger : "+items);

	}

}
