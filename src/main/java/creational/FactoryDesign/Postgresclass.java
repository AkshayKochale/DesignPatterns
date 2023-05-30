package creational.FactoryDesign;



public class Postgresclass implements DataBaseTemp {

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
		return "Postgresclass [url=" + url + ", pass=" + pass + ", driver=" + driver + "]";
	}

	public Postgresclass setUrl(String url) {
		this.url = url;
		return this;
	}

	public Postgresclass setPass(String pass) {
		this.pass = pass;
		return this;
	}

	public Postgresclass setDriver(String driver) {
		this.driver = driver;
		return this;
	}
	
	
	

}

