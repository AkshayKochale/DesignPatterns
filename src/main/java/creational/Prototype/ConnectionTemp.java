package creational.Prototype;

public interface ConnectionTemp<T> extends Cloneable 
{

		public T getConnection(String v,String v1);
		public T clone();
	
}
