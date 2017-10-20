import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class MinPix/**minimum diff of data base image with captcha image*/
{
     BufferedImage image;
     int width, height;
     String f_out;
     int ct=0;
     public float[] count(String name)
     {
         /**computes the minimum difference*/
         String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         Blackpixel obj=new Blackpixel();
        // String name = "S:\\FFCS\\13.jpg";
         int count =0;
         int captcha=obj.counter(name);
         int data=0;int min=10000;float mini[]=new float[35];
          try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();int leader=0;
                    for(int k=0;k<35;k++)
                        {
                         data= obj.counter("S:\\CHARACTERS123\\x"+Integer.toString(k) + ".jpg");
                         
                            
                                mini[k]=Math.abs(data-captcha);
                             
                             //System.out.println("current leader"+leader);
                 
                            System.out.println("minimum value of"+" "+(alpha.charAt(k))+mini[k]);
                        }
                   // System.out.println(alpha.charAt(leader));
                }
          catch(Exception e)
                {
                    System.out.println("invalid captcha2");
                    System.out.println(e.toString());
                }
                
                return mini;
            }
        }
        