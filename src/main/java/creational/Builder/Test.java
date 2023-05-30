package creational.Builder;

import creational.Builder.DatabaseCon.databaseConBuilder;

public class Test {

	public static void main(String[] args)
	{
		
		DatabaseCon db=new databaseConBuilder().setUrl("Url").setPass("Pass").build();
		System.out.println(db);
		
	}

}
