package structural.ProxyDesign;

public class ImageLoader implements image
{

	private String imagePath;

	public ImageLoader(String imagePath) {
		super();
		this.imagePath = imagePath;
		loadImage();
	}
	
	public void loadImage() 
	{
		System.out.println("Image Loaded for path"+imagePath);
		
	}
	
	public void display() 
	{
		System.out.println("iamges displayed "+imagePath);
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	

}
