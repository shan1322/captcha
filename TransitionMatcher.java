import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class TransitionMatcher
{
     BufferedImage image;
     int width, height;
     int[] match(String name)
        {//String name = "S:\\FFCS\\21.jpg";
            String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";Transition trans=new Transition();
            int dif[]=new int[36];
            int cap=trans.transition(name);
            try
            {
            File input = new File(name);
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int k=0;k<35;k++)
            {
                
                String chr="S:\\CHARACTERS123\\x"+Integer.toString(k) + ".jpg";
                int dbase=trans.transition(chr);
                int diff=Math.abs(dbase-cap);
                dif[k]=diff;
               // System.out.print(alpha.charAt(k)+" "+dif[k]);
            }
        }
        
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
            System.out.println(e.toString());
        }
        return dif;
    }
     int[] match1(String name)
        {//String name = "S:\\FFCS\\21.jpg";
            String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";Transition trans=new Transition();
            int dif[]=new int[36];
            int cap=trans.transition1(name);
            try
            {
            File input = new File(name);
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int k=0;k<35;k++)
            {
                
                String chr="S:\\CHARACTERS123\\x"+Integer.toString(k) + ".jpg";
                int dbase=trans.transition1(chr);
                int diff=Math.abs(dbase-cap);
                dif[k]=diff;
               // System.out.print(alpha.charAt(k)+" "+dif[k]);
            }
        }
        
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
            System.out.println(e.toString());
        }
    
    return dif;
}
}