package creational.Prototype;

public class DatabaseaCon implements ConnectionTemp<DatabaseaCon> 
{
	
	private String url;
	private String pass;
	

	
	
	public DatabaseaCon() {
	
	}

	public DatabaseaCon(String url, String pass) {
		super();
		this.url = url;
		this.pass = pass;
	}

	public DatabaseaCon getConnection(String url,String pass) {
		// TODO Auto-generated method stub
		
		return new DatabaseaCon(url,pass);
	}

	public DatabaseaCon clone() 
	{
	
		DatabaseaCon newDb=new DatabaseaCon();
		newDb.url=this.url;
		newDb.pass=this.pass;		
		return newDb;
	}

	@Override
	public String toString() {
		return "DatabaseaCon [url=" + url + ", pass=" + pass + "]";
	}

	

	
	
	

	
	
	
}
