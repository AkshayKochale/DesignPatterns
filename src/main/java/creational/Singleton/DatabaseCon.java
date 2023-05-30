package creational.Singleton;

public class DatabaseCon extends Thread
{

	private static DatabaseCon instance=null;
	private String url;
	private String pass;
	private int numberOfCalls;
	
	
	
	private DatabaseCon() 
	{
		System.out.println("total number of calls" + numberOfCalls);
	}
	
	public static  DatabaseCon getInstance() 
	{
		
		synchronized(DatabaseCon.class)
		{
					if(instance==null)
				{
					instance=new DatabaseCon();
					instance.url="www.myWeb.com";
					instance.pass="Akshay123";
				}
		}
		return instance;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
