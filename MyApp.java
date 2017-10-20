 
/**
 * This has the main class
 * It is responsible for the complete execution
 */
public class MyApp {
	final static String path = "S:\\FFCS\\";
	final static String file = "image";
	public static void main(String args[]){
		for(int i=1;i<4;i++){
			String temp = file + Integer.toString(i) + ".jpg";
			GrayScaleConverter gScaleObj = new GrayScaleConverter(path+temp); //Convert into gray-scale
			ImageFilterer imageFilterer = new ImageFilterer(gScaleObj.getFileName()); //Filter 
			//CharacterRecognizer characterRecognizer = 
			new CharacterRecognizer(imageFilterer.getBinary(), path, i); //Extract characters
		}
	}
}
