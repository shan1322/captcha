import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class Blackpixel
{
     BufferedImage image;
     int width, height;
     String f_out;
     int ct=0;
     public int counter(String name)
     {//String name = "S:\\FFCS\\13.jpg";
         int count =0;
          try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();
                   
                        
                            for(int i=0;i<width;i++)
                            {
                                for(int j=0;j<height;j++)
                                    {
                                        Color c = new Color(image.getRGB(i, j));
                                        if(c.getRed()==0)
                                        {
                                            count++;
                                        }
                           
                                    }                               
                                }
                            }
                         catch(Exception e)
                         {
                             System.out.println("invalid captcha2");
                             System.out.println(e.toString());
                            }
                   
                      return count;
       
                }
            }
        