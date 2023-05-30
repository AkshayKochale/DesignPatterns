package creational.AbstractFactory;

public interface GenericFactory<T,E> {

	public T creatFactory();
	public void setfactoryname();
	public E build(String name);
	
}
