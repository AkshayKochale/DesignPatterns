package creational.ObjectPool;

public class DatabaseConImpl extends DatabaseCon 
{

	

	private Integer instanceId;
	private String url;
	private String pass;
		
	public DatabaseConImpl(int size) {
		super(size);
	}

	public DatabaseConImpl() 
	{
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
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

	@Override
	public String toString() {
		return "DatabaseConImpl [instanceId=" + instanceId + ", url=" + url + ", pass=" + pass + "]";
	}

	
	
	
	
	
}
