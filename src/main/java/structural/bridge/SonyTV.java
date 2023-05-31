package structural.bridge;

public class SonyTV implements Tv
{
	
	private remote remote;
	
	
	
	
	public SonyTV(structural.bridge.remote remote) {
		super();
		this.remote = remote;
	}

	public void type() {
		
		System.out.println("Sony Tv");
		
	}

	public void model() {
		// TODO Auto-generated method stub
		System.out.println("Model1");
	}

	public void func(String action) {
		// TODO Auto-generated method stub
		if(action.equalsIgnoreCase("on"))
		remote.on();
		else 
			remote.off();
	}

}
