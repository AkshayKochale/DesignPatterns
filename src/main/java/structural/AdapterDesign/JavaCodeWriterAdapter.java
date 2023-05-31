package structural.AdapterDesign;

public class JavaCodeWriterAdapter implements CodeWriter
{
	private JavaWriter jw=null;
	
	public JavaCodeWriterAdapter() 
	{
		jw=new JavaWriter();
	}
		
	public void write() 
	{
	
			jw.write();
	}

	
}
