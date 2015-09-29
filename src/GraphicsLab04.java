/**
 * William Schiesswohl
 * Mr. Kiedes
 * AP Computer Science Period 2
 */

/** g.drawLine
 * g.drawRect
 * g.drawOval(x,y,width,height)
 * g.drawArc(x,y,width,height,start,end)
 */
import java.awt.*;
import java.applet.*;

public class GraphicsLab04 extends Applet
{
    public void paint(Graphics g)
    {
        ///////////////Draw Cube////////////////////
        g.drawRect(25,25,225,225);
        g.drawRect(100,100,250,250);
        g.drawLine(25,25,100,100);
        g.drawLine(250,25,350,100);
        g.drawLine(25,250,100,350);
        g.drawLine(250,250,350,350);
        ////////////////Draw Sphere/////////////////
        //Base Circle
        g.drawOval(65,65,240,240);
        //vertical ovals
        g.drawArc(95,65,180,240,270,360);
        g.drawArc(125,65,120,240,0,360);
        g.drawArc(155,65,60,240,0,360);
        //horizontal ovals
        g.drawArc(65,95,240,180,0,360);
        g.drawArc(65,125,240,120,0,360);
        g.drawArc(65,155,240,60,0,360);
        //////////////Draw Inscribed/circumscribed triangle/////////////
        //large circle
        g.drawOval(600,500,200,200);
        //triangle
        g.drawLine(600,600,777,538);
        g.drawLine(700,700,777,538);
        g.drawLine(600,600,700,700);
        //innermost circle
        g.drawOval(640,574,93,93);
        ////////////////////Draw APCS/////////////////////
        //this is for the 'A'
        g.fillRect(25,500,20,100);
        g.fillRect(25,500,60,20);
        g.fillRect(25,540,60,20);
        g.fillRect(65,500,20,100);
        //this is for the 'P'
        g.fillRect(105,500,20,100);
        g.fillRect(105,500,60,20);
        g.fillRect(105,540,60,20);
        g.fillRect(145,500,20,60);
        //this is for the 'C'
        g.fillRect(185,500,60,20);
        g.fillRect(185,500,20,100);
        g.fillRect(185,580,60,20);
        //this is for the 'S'
        g.fillRect(265,500,60,20);
        g.fillRect(265,500,20,60);
        g.fillRect(265,540,60,20);
        g.fillRect(305,540,20,60);
        g.fillRect(265,580,60,20);        
        ///////////////////Draw pacmen Flower////////////////////
        g.fillArc(650,250,125,125,45,270);//right pacman
        g.fillArc(570,170,125,125,135,270);//top pacman
        g.fillArc(570,330,125,125,315,270);//bottom pacman
        g.fillArc(490,250,125,125,225,270);//left pacman
        
    }
}
