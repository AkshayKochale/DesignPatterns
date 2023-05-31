package structural.bridge;

public class LGTv implements Tv
{
		
	private remote remote;
	
	
	public LGTv(structural.bridge.remote remote) {
		super();
		this.remote = remote;
	}

	public void type() {
		
		System.out.println("LG Tv");
		
	}

	public void model() {
		// TODO Auto-generated method stub
		System.out.println("LGM1");
	}

	
	public void func(String action) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(action.equalsIgnoreCase("on"))
				remote.on();
				else 
					remote.off();
		
	}

}

