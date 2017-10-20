import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class Transition
{
    BufferedImage image;
     int width, height;
     String f_out;
    int transition(String name){
         //String name = "S:\\FFCS\\13.jpg";
         int count=0;
        try
        {
            File input = new File(name);
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0;i<width;i++)
            {
                
                for(int j=1;j<height;j++)
                {
                    Color c = new Color(image.getRGB(i,j-1));
                    Color d = new Color(image.getRGB(i,j)); 
                    if((c.getRed()==0 && d.getRed()==1 && (j!=height-1))||(c.getRed()==1 && d.getRed()==0 &&(j!=height-1))) 
                    {
                        count++;
                    }
                    
                }
            }
           // System.out.println(count);
        }
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
            System.out.println(e.toString());
        }
        return count;
                
    }
    int transition1(String name){
         //String name = "S:\\FFCS\\21.jpg";
         int count=0;
        try
        {
            File input = new File(name);
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0;i<height;i++)
            {
                
                for(int j=1;j<width;j++)
                {
                    Color c = new Color(image.getRGB(i,j-1));
                    Color d = new Color(image.getRGB(i,j)); 
                    if((c.getRed()==0 && d.getRed()==1 && (j!=height-1))||(c.getRed()==1 && d.getRed()==0 &&(j!=height-1))) 
                    {
                        count++;
                    }
                    
                }
            }
           // System.out.println(count);
        }
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
            System.out.println(e.toString());
        }
        return count;
                
    }
}
        