import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class Captchwidthcalc
{
     BufferedImage image;
     int width, height;
     String f_out;
     int ct=0;
     int[] widthcalcVertical(String name)
     {     
                int match=0;
                int first_r=-1;int last_r=-1;
                int first_l=-1;int last_l=-1;
                int[] data = {0,0}; // first, last
                try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();
                    for(int i=0;i<width;i++)
                    {
                        int count =0;
                        for(int j=0;j<height;j++)
                        {
                            Color c = new Color(image.getRGB(i, j));
                            if(c.getRed()==0)
                            {
                                count++;
                            }
                        }
                        if(count!=0&&first_l==-1)
                            first_l = i;
                        else if(count!=0) 
                            last_l = i;
                    }   
                    for(int i=width-1;i>=0;i--)
                    {
                        int count =0;
                        for(int j=0;j<height;j++)
                        {
                            Color c = new Color(image.getRGB(i, j));
                            if(c.getRed()==0)
                            {
                                count++;                       
                            }
                        }
                        if(count!=0&&first_r==-1)
                            first_r = i;
                        else if(count!=0)
                            last_r = i;
                        //System.out.println(count);
                    }
                }
                  catch(Exception e)
                {
                    System.out.println("invalid captcha2");
                    System.out.println(e.toString());
                }
                data[0] = first_l;
                data[1] = last_l;
                if((last_l-first_l)>(last_r-first_r)){
                    data[0] = last_r;
                    data[1] = first_r;
                }
                return data;
     }
     int[] widthcalcHorizontal(String name){     
                int match=0;
                int first_r=-1;int last_r=-1;
                int first_l=-1;int last_l=-1;
                int[] data = {0,0}; // first, last
                try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();
                    for(int i=0;i<height;i++)
                    {
                        int count =0;
                        for(int j=0;j<width;j++)
                        {
                            Color c = new Color(image.getRGB(j, i));
                            if(c.getRed()==0)
                            {
                                count++;
                            }
                        }
                        if(count!=0&&first_l==-1)
                            first_l = i;
                        else if(count!=0) 
                            last_l = i;
                    }   
                    for(int i=height-1;i>=0;i--)
                    {
                        int count =0;
                        for(int j=width-1;j>=0;j--)
                        {
                            Color c = new Color(image.getRGB(j, i));
                            if(c.getRed()==0)
                            {
                                count++;                       
                            }
                        }
                        if(count!=0&&first_r==-1)
                            first_r = i;
                        else if(count!=0)
                            last_r = i;
                        //System.out.println(count);
                    }
                }
                  catch(Exception e)
                {
                    System.out.println("invalid captcha2");
                    System.out.println(e.toString());
                }
                data[0] = first_l;
                data[1] = last_l;
                if((last_l-first_l)>(last_r-first_r)){
                    data[0] = last_r;
                    data[1] = first_r;
                }
                return data;
     
     }
}