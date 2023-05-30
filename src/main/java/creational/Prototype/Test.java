package creational.Prototype;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseaCon db=new DatabaseaCon("akshay","pass");
		
		DatabaseaCon clone = db.clone();
		
		System.out.println(db.hashCode());
		System.out.println(clone.hashCode());
	}

}
