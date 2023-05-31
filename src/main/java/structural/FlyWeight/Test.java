package structural.FlyWeight;

public class Test 
{

	
	public static void main(String[] args) {
		

		VehicalFactory vf=new VehicalFactory();
		Vehical vechial = vf.getVechial("Bike", "Black");
		vechial.start();
		
		Vehical vechial1 = vf.getVechial("Bike", "red");
		vechial1.start();
		
		Vehical vechial2 = vf.getVechial("truck", "Black");
		vechial2.start();
		
		Vehical vechial12 = vf.getVechial("truck", "red");
		vechial12.start();
				
	}
	
}
