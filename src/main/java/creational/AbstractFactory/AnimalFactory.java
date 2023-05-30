package creational.AbstractFactory;

public class AnimalFactory implements GenericFactory<AnimalFactory,Animal>{

	private String name; 
	
	public AnimalFactory creatFactory() {
		// TODO Auto-generated method stub
		
		return new AnimalFactory();
	}

	public void setfactoryname() {
		// TODO Auto-generated method stub
		this.name="animalfactory";
	}
	
	public Animal build(String name) 
	{
		if(name.equalsIgnoreCase("dog"))
			return new Dog();
		else if(name.equalsIgnoreCase("cat"))
			return new Cat();
		
		return null;
	}

}
