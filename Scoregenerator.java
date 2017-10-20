import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.*;
import javax.imageio.ImageIO;
class Scoregenerator
{
    void gen()
    {
        MinPix minpix=new MinPix();
        PatternMatcher patternmatcher=new PatternMatcher();
        TransitionMatcher obj=new TransitionMatcher();
        String alpha="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String name = "S:\\FFCS\\14.jpg";
        BufferedImage br ;
       // br=ImageIO.read(new File(name));
        float a[]=minpix.count(name);
        int b[]=obj.match(name);
        int c[]=obj.match1(name);
        float d[]=patternmatcher.matchervertical(name);
        float e[]=patternmatcher.matcherhorizontal(name);
        double score[]=new double[35];
        double Score=0.0;
        for(int i=0;i<35;i++)
        {
            
            Score=(143*a[i]+47.9*b[i]+37.1*c[i]+80.9*d[i]+96.2*e[i])/405.1;
            score[i]=Score;System.out.println("SCORE " + score[i] + " " + alpha.charAt(i));
        }}
   }

            
        
       