package structural.AdapterDesign;

public class WriteProgram 
{
	private CodeWriter cw;
	
	public void writeCode() 
	{
		cw.write();
	}

	public CodeWriter getCw() {
		return cw;
	}

	public void setCw(CodeWriter cw) {
		this.cw = cw;
	}
	
	
	
}
