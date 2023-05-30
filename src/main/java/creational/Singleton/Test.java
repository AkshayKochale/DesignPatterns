package creational.Singleton;

public class Test
{

		public static void main(String[] args) 
		{
//			
//			DatabaseCon instance = DatabaseCon.getInstance();
//			DatabaseCon instance1 = DatabaseCon.getInstance();
			
		/*
		 * System.out.println(instance.hashCode()+" : "+instance1.hashCode());
		 * 
		 * System.out.println(instance.getUrl() +" : "+instance.getPass());
		 * 
		 * System.out.println(instance1.getUrl() +" : "+instance1.getPass());
		 */
			
			Test t=new Test();
			
			Thread t1=new Thread(t.new mythread());
			Thread t2=new Thread(t.new mythread());
			
			t1.start();t2.start();
		}
		

		public class mythread extends Thread
		{
		
			public void run() 
			{
				DatabaseCon instance = DatabaseCon.getInstance();
				System.out.println( this.getName()+" :"+instance.hashCode());
				
			}
			
		}
	
}
