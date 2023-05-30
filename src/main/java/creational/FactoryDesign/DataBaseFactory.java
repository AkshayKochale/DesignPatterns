package creational.FactoryDesign;

public class DataBaseFactory 
{

	private DataBaseFactory() {}
	
	public DataBaseFactory(String databaseName) 
	{
		
	}
	
	 static DataBaseTemp getObj(String str) 
	{
		DataBaseTemp obj=null;
		
		if(str.equalsIgnoreCase("mysql"))
		{
			obj=new Mysqlclass().setUrl("mysql.com").setPass("mypass").setDriver("mydriver");
			
		}
		else if(str.equalsIgnoreCase("postgres")) 
		{
			obj=new Postgresclass().setUrl("post.com").setPass("passpost").setDriver("postdriver");
		}
		
		return obj;
	}
	
	
}
