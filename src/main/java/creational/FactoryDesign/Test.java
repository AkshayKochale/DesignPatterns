package creational.FactoryDesign;

public class Test {

	public static void main(String[] args) {

		
		DataBaseTemp obj = DataBaseFactory.getObj("postgres");
		System.out.println(obj);
	}

}
