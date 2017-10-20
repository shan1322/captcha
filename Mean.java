import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class Mean
{

void  mean()
    {
        
        MinPix minpix=new MinPix();
        PatternMatcher patternmatcher=new PatternMatcher();
        TransitionMatcher obj=new TransitionMatcher();
         float min[]=new float[36]; float hw[]=new float[36]; float vw[]=new float[36]; float ht[]=new float[36];
          float vt[]=new float[36];float m1=0;float m2=0;float m3=0; float m4=0;float m5=0;
          for(int i=0;i<21;i++)
            { String chr="S:\\FFCS\\"+Integer.toString(i) + ".jpg";
                 float a[]=minpix.count(chr);
                 int b[]=obj.match(chr);
                 int c[]=obj.match1(chr);
                 float d[]=patternmatcher.matchervertical(chr);
                 float e[]=patternmatcher.matcherhorizontal(chr);
               
                for(int j=0;j<35;j++)
                    {
                        String name="S:\\CHARACTERS123\\x"+Integer.toString(j) + ".jpg";
                         float f[]=minpix.count(name);
                         int g[]=obj.match(name);
                         int h[]=obj.match1(name);
                         float x[]=patternmatcher.matchervertical(name);
                         float y[]=patternmatcher.matcherhorizontal(name);
                            if(i==j)
                            {
                                min[i]=Math.abs(a[i]-f[i]);
                                 hw[i]=Math.abs(b[i]-g[i]);
                                  vw[i]=Math.abs(c[i]-h[i]);
                                   ht[i]=Math.abs(d[i]-x[i]);
                                    vt[i]=Math.abs(e[i]-y[i]);
                            }
                     }
                          
               
               for(int m=0;m<21;m++)
               {
                   m1=m1+min[m];
                   m2=m2+hw[m];
                   m3=m3+vw[m];
                   m4=m4+ht[m];
                   m5=m5+vt[m];
                        }
                        System.out.println("min"+m1/21);
                        System.out.println("hw"+m2/21);
                        System.out.println("vw"+m3/21);
                        System.out.println("ht"+m4/21);
                        System.out.println("vt"+m5/21);
             }
            }
        }
                        
 

            
         