package structural.FlyWeight;

public class Truck implements Vehical 
{

	// Extrinsic prop
	private String colour;
	
	// intrinsic prop
	private final Integer speed;
	
	public Truck(String colour)
	{
		speed=80;
		System.out.println(" truck created");
		this.colour=colour;
	}
	
	
	
	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	@Override
	public void start() {
		System.out.println(colour+"truck started");
	}


	@Override
	public void setcolour(String colour) {
		// TODO Auto-generated method stub
		
	}

	
}
