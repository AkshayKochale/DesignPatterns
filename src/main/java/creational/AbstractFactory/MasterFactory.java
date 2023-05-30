package creational.AbstractFactory;

public class MasterFactory implements GenericFactory<MasterFactory, GenericFactory> 
{

	public MasterFactory creatFactory() {
		// TODO Auto-generated method stub
		return new MasterFactory();
	}

	public void setfactoryname() {
		
		System.out.println("Master");
		
	}

	public GenericFactory build(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("animal"))
			return new AnimalFactory();
		
		
		return new FoodFactory();
	}

}
