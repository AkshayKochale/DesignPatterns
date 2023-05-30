package creational.ObjectPool;

public class DatabaseCon extends ObjectPoolGeneric<DatabaseCon>{

	private  int i=1;
	
	public DatabaseCon() 
	{
	}
	
	public DatabaseCon(int size) {
		super(size);
		
	}



	@Override
	public DatabaseCon create() 
	{
		DatabaseConImpl obj=new DatabaseConImpl();
		obj.setPass("pass"+i);
		obj.setUrl("url"+i);
		obj.setInstanceId(obj.hashCode());
		 i++;
		return obj;
	}

	
}
