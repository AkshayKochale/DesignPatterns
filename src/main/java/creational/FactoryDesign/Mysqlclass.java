package creational.FactoryDesign;

public class Mysqlclass implements DataBaseTemp {

	private String url;
	private String pass;
	private String driver;
	
	
	
	public void details(String url, String pass, String driver) {
		
		this.url=url;
		this.pass=pass;
		this.driver=driver;
		
	}

	@Override
	public String toString() {
		return "Mysqlclass [url=" + url + ", pass=" + pass + ", driver=" + driver + "]";
	}

	public Mysqlclass setUrl(String url) {
		this.url = url;
		return this;
	}

	public Mysqlclass setPass(String pass) {
		this.pass = pass;
		return this;
	}

	public Mysqlclass setDriver(String driver) {
		this.driver = driver;
		return this;
	}
	
	
	

}
