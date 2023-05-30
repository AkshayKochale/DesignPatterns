package creational.ObjectPool;

public class Test {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseCon dataBasePool=new DatabaseCon(5);
		
		dataBasePool.printunUsed();
		dataBasePool.printUsed();
		
		DatabaseCon object = dataBasePool.getObject();
		System.out.println(object);
		
		DatabaseCon object1 = dataBasePool.getObject();
		System.out.println(object1);
		
		DatabaseCon object2 = dataBasePool.getObject();
		System.out.println(object2);
		
		DatabaseCon object3 = dataBasePool.getObject();
		System.out.println(object3);
		
		DatabaseCon object4 = dataBasePool.getObject();
		System.out.println(object4);
		
		DatabaseCon final1 = dataBasePool.getObject();
		System.out.println(final1);
		
		dataBasePool.give(final1);
		
		DatabaseCon final11 = dataBasePool.getObject();
		System.out.println(final11);
		
		dataBasePool.give(object4);
		
		DatabaseCon final111 = dataBasePool.getObject();
		System.out.println(final111);
		
		dataBasePool.give(object3);
		dataBasePool.printunUsed();
		
	}

}
