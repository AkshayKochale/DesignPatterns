package structural.AdapterDesign;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WriteProgram wp=new WriteProgram();
		wp.setCw(new JavaCodeWriterAdapter());
		wp.writeCode();
	}

}
