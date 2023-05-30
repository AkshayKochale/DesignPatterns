package creational.AbstractFactory;

public class Test {

	public static void main(String[] args)
	
	{
		MasterFactory master=new MasterFactory();
		GenericFactory animalFact = (GenericFactory) master.build("animal");
		
		Dog build = (Dog)animalFact.build("dog");
		build.makesound();
		GenericFactory foodFa = master.build("food");
		NonVeg build2 = (NonVeg)foodFa.build("NonVeg");
		build2.settype();
		build2.setfoodfor();
		
		
	}

}
