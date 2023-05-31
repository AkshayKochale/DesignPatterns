package structural.bridge;

public class Test 
{

	
	public static void main(String[] args) {
		
		remote old= new OldRemote();
		remote neww= new NewRemote();
		
		
		 Tv sony=new SonyTV(old);
		 sony.func("on");
		 System.out.println();
		 
		 Tv LG=new LGTv(neww);
		 
		 LG.func("on");
		 LG.func("off");
		 sony.func("off");
		
	}
}
