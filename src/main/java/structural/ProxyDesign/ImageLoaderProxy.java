package structural.ProxyDesign;


public class ImageLoaderProxy implements image
{
	private ImageLoader imgLoad;
	private String path;
	
	public  ImageLoaderProxy(String path) 
	{
		this.path=path;
	}
	
	
	public void display()
	{
		if(imgLoad==null)
		{
			imgLoad=new ImageLoader(path);
		}
		
		imgLoad.display();
	}
	
}
