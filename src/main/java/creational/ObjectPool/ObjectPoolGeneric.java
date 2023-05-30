package creational.ObjectPool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ObjectPoolGeneric <T> 
{

	private int size;
	private List<T> unusedObjects;
	private List<T> usedObjects;
	
	public abstract T create();
	
	public ObjectPoolGeneric() {}
	public ObjectPoolGeneric(int size) 
	{
		this.size=size;
		unusedObjects=new LinkedList<T>();
		usedObjects=new LinkedList<T>();
		for(int i=0;i<size;i++)
		{
			unusedObjects.add(create());
		}
	}
	 
	
	public T getObject() 
	{
		if(!unusedObjects.isEmpty() && unusedObjects.size()<=size)
		{
			T obj = unusedObjects.remove(0);
			usedObjects.add(obj);
			return obj;
		}
		
		return null;
	}
	
	
	public void give(T obj) 
	{
		if(obj!=null)
		{
			unusedObjects.add(obj);
			usedObjects.remove(obj);
		}
		
	}
	
	
	public void printunUsed() 
	{
		System.out.println(unusedObjects);
	}
	
	public void printUsed() 
	{
		System.out.println(usedObjects);
	}
	
	public int getsize() {return unusedObjects.size();}
	
	
}
