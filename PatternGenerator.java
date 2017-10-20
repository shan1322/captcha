import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class PatternGenerator /**generate pattern of each and every alphabet*/
{
     BufferedImage image;
     int width, height;
     String f_out;
     int ct=0;
     int[] genVertical(BufferedImage br) //to generate pattern of captcha extracted doc
     {
           //String name = "S:\\FFCS\\13.jpg";
            int pat[] = new int[br.getWidth()+br.getHeight()];
            int match=0;int patc=0;
            int index = 0;
            try
            {
                image = br;
                width = image.getWidth();
                height = image.getHeight();
                for(int i=0;i<width;i++)
                {   int count=0;
                    for(int j=0;j<height;j++)
                    {
                        Color c = new Color(image.getRGB(i, j));
                        if(c.getRed()==0)
                        {
                            count++;
                        }
                       
                    }
                    pat[index]=count;
                    index++;
                   // System.out.println(pat[i]);
                   
                }
            }catch(Exception e)
            {
                 System.out.println("invalid captcha21");
                 System.out.println(e.toString());
            }
            return pat;
     }
     int[] genHorizontal(BufferedImage br)//to genrate pattern of captcha exatracted doc
     {
           //String name = "S:\\FFCS\\13.jpg";
            int pat[] = new int[br.getWidth()+br.getHeight()];
            int match=0;int patc=0;
            int index = 0;
            try
            {
                image = br;
                width = image.getWidth();
                height = image.getHeight();
                for(int i=0;i<height;i++)
                {   int count=0;
                    for(int j=0;j<width;j++)
                    {
                        Color c = new Color(image.getRGB(j, i));
                        if(c.getRed()==0)
                        {
                            count++;
                        }
                       
                    }
                    pat[index]=count;
                    index++;
                   // System.out.println(pat[i]);
                   
                }
            }catch(Exception e)
            {
                 System.out.println("invalid captcha21");
                 System.out.println(e.toString());
            }
            return pat;
     }
}