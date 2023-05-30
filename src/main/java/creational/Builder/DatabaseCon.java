package creational.Builder;

public class DatabaseCon 
{

	private String url;
	private String pass;
	
	
	
	private DatabaseCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public String getPass() {
		return pass;
	}

	static class databaseConBuilder
	{
		private String url;
		private String pass;
		private DatabaseCon obj;
		
		
		public databaseConBuilder()
		{
			obj=new DatabaseCon();
		}
		
		public databaseConBuilder setUrl(String url) {
			this.url = url;
			return this;
		}
		public databaseConBuilder setPass(String pass) {
			this.pass = pass;
			return this;
		}
		
		public DatabaseCon build() 
		{
			obj.url=this.url;
			obj.pass=this.pass;
			return obj;
		}
		
		
	}

	@Override
	public String toString() {
		return "DatabaseCon [url=" + url + ", pass=" + pass + "]";
	}
	
	
	
	
}
