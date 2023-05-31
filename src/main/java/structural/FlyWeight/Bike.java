package structural.FlyWeight;

public class Bike implements Vehical 
{

	// Extrinsic prop
	private String colour;
	
	// intrinsic prop
	private final Integer speed;
	
	public Bike(String colour)
	{
		speed=150;
		System.out.println("Bike Created");
		this.colour=colour;
	}
	
	
	@Override
	public void start() {
		System.out.println(colour+" bike started");
	}


	@Override
	public void setcolour(String colour) {
		// TODO Auto-generated method stub
		
	}
	

	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}


	
}
