import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class PatternMatcher/**match the pattern of extracted captcha charcter and compare with each charcter and retun no of mismatched*/
{
     BufferedImage image;
     int width, height;
     String f_out;
     int ct=0;
     public float[] matchervertical(String name)
        { 
        String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int data[];int leader=0;
        Captchwidthcalc obj=new Captchwidthcalc();
        PatternGenerator obj1=new PatternGenerator();int min=10000;    float mis[]=new float[35];    
        try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();
                    int[] captchavertical =obj.widthcalcVertical(name);
                    int[] captchaHorizontal=obj.widthcalcHorizontal(name);
                    for(int k=0;k<35;k++)
                    {
                         int miscount=0;
                         int length=0;String g="";String h="";
                         String datachar="S:\\CHARACTERS123\\x"+Integer.toString(k) + ".jpg";
                         data=obj.widthcalcVertical(datachar);
                         int start_c = data[0];
                        /** loop through every element  
                          * in database and check for 
                          * mismatch in pattern
                        */
                        int arrV[]=obj1.genVertical(image);
                        int arrH[]=obj1.genHorizontal(image);
                        BufferedImage imageDataChar = ImageIO.read(new File(datachar));
                        int arr1V[]=obj1.genVertical(imageDataChar);
                        int arr1H[]=obj1.genHorizontal(imageDataChar);
                        for(int i=captchavertical[0];i<captchavertical[1];i++)
                        {
                            if(k==21){
                            //System.out.print("VR " + Integer.toString(arrV[i])+ " ");
                            System.out.println(arr1V[start_c]);
                            }
                            if(i>data[1])
                                break;
                            if(arrV[i]!=arr1V[start_c])
                                miscount+=1;
                               // miscount+=Math.abs(arr1V[start_c]-arrV[i]);
                            start_c++;
                        }                       
                       mis[k]=miscount;
                       //System.out.println(alpha.charAt(k)+"  "+mis[k]);
                    }
                    
              }
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
             System.out.println(e.toString());
        }
        return mis;                
    }
    public float[] matcherhorizontal(String name)
        { 
        String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int data[];int leader=0;
        Captchwidthcalc obj=new Captchwidthcalc();
        PatternGenerator obj1=new PatternGenerator();int min=10000;    float mis[]=new float[35];    
        try
                {
                    File input = new File(name);
                    image = ImageIO.read(input);
                    width = image.getWidth();
                    height = image.getHeight();
                    int[] captchaHorizontal=obj.widthcalcHorizontal(name);
                    System.out.println("DIMENSIONS horizontal: " + Integer.toString(captchaHorizontal[0]) + " " + Integer.toString(captchaHorizontal[1]));
                    for(int k=0;k<35;k++)
                    {
                         int miscount=0;
                         int length=0;String g="";String h="";
                         String datachar="S:\\CHARACTERS123\\x"+Integer.toString(k) + ".jpg";
                         data=obj.widthcalcHorizontal(datachar);
                         int start_c = data[0];
                        /** loop through every element  
                          * in database and check for 
                          * mismatch in pattern
                        */
                        int arrV[]=obj1.genVertical(image);
                        int arrH[]=obj1.genHorizontal(image);
                        BufferedImage imageDataChar = ImageIO.read(new File(datachar));
                        int arr1V[]=obj1.genVertical(imageDataChar);
                        int arr1H[]=obj1.genHorizontal(imageDataChar);
                        for(int i=captchaHorizontal[0];i<captchaHorizontal[1];i++)
                        {
                            if(k==21){
                           // System.out.print("HR " + Integer.toString(arrH[i])+ " ");
                            System.out.println(arr1H[start_c]);
                            }
                            if(i>data[1])
                                break;
                            if(arrH[i]!=arr1H[start_c])
                                miscount+=1;
                                //miscount+=Math.abs(arrH[start_c]-arr1H[i]);
                            start_c++;
                        }                       
                       mis[k]=miscount;
                       //System.out.println(alpha.charAt(k)+"  "+mis[k]);
                    }
                    
              }
        catch(Exception e)
        {                            
            System.out.println("invalid captcha cracker");
             System.out.println(e.toString());
        }
        return mis;                
    }
}