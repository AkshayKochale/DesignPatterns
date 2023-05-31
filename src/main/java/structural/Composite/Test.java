package structural.Composite;

public class Test 
{

	
		public static void main(String[] args) 
		{
			Composite pc=new Composite("Pc");
			leaf monitor = new leaf(10000, "monitor");
			Composite cpu = new Composite("Cpu");
			
			leaf mb = new leaf(7000, "mb");
			leaf gc = new leaf(5000, "gc");
			leaf ram = new leaf(10000, "ram");
			leaf hdd = new leaf(4000, "hdd");
			
			cpu.compo.add(hdd);
			cpu.compo.add(mb);
			cpu.compo.add(ram);
			cpu.compo.add(gc);
			
			pc.compo.add(monitor);
			pc.compo.add(cpu);
			
			pc.price();
				
		}
	
}
