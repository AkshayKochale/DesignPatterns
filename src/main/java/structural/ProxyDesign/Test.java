package structural.ProxyDesign;public class Test 
{

		public static void main(String[] args) {
			
			
		/*
		 * ImageLoader imgLoader=new ImageLoader("/abc/abc"); imgLoader.loadImage();
		 * imgLoader.loadImage();
		 */
		
			image imgProxy=new ImageLoaderProxy("/abc/abc");
		
			imgProxy.display();
			
			
			
		}
	
}
