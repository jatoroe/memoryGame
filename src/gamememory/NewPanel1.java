/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamememory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JAVIER
 */
public class NewPanel1 extends JPanel implements ActionListener, MouseListener
{
    //error o acierto
    boolean ec = false;
    boolean gg2 = false;
    int gg = 0;
    int counter = 0;
    // comprobar respuestas
    boolean pr = false;
    boolean pr2 = false;
    boolean pr3 = false;
    boolean pr4 = false;
    boolean pr5 = false;
    boolean pr6 = false;
    boolean pr7 = false;
    boolean pr8 = false;
    boolean pr9 = false;
    boolean pr10 = false;
    // pagina principal.
    int t = 0;
    //inicializador del juego.
    private final Timer timer;
    // Variable para reconocer el mouse.
    boolean mg = false;
    boolean cb = false;
    boolean sb = false;
    boolean tv = false;
    boolean cg = false;
    boolean mg2 = false;
    boolean cb2 = false;
    boolean sb2 = false;
    boolean tv2 = false;
    boolean cg2 = false;
    //Booleans para el cambio de carta.
    boolean fc = false;
    boolean sc = false;
    boolean tc = false;
    boolean frc = false;
    boolean fvc = false;
    boolean fc2 = false;
    boolean sc2 = false;
    boolean tc2 = false;
    boolean frc2 = false;
    boolean fvc2 = false;
    
    public NewPanel1()
    {
        timer = new Timer(25, this);
        timer.start();
        this.addMouseListener(this);
    }
    
    @Override
    protected void paintComponent(Graphics l)
    {   
        //imagen principal 
        int w = t;
        Image fond = loadImage("Start.png");
        if (t < 100) {
            l.drawImage(fond, 0, 0, null);
        }else{
        
        Image warning = loadImage("Warning.png");
        
        l.clearRect(0, 0, 1100, 1200);
        Image end = loadImage("final.png");
        
        if (ec) {
            l.drawImage(warning, 10, 10, null);
        } else if (gg < 25) {
                l.clearRect(10, 10, 200, 200);
            }
        // Instrucciones.
        Image ins = loadImage("Instrucciones.png");
        l.drawImage(ins, 200, 15, null);
        //Reverso Cartas.        
        l.setColor(Color.BLUE);
        l.fillRect(50, 100, 150, 200);
        l.fillRect(50, 400, 150, 200);
        
        l.fillRect(250, 100, 150, 200);
        l.fillRect(250, 400, 150, 200);
        
        l.fillRect(450, 100, 150, 200);
        l.fillRect(450, 400, 150, 200);
        
        l.fillRect(650, 100, 150, 200);
        l.fillRect(650, 400, 150, 200);
        
        l.fillRect(850, 100, 150, 200);
        l.fillRect(850, 400, 150, 200);
        //cargar las imagenes.
        Image tr = loadImage("triangle_red.png");
        Image cbb = loadImage("circle_blue.png");
        Image sbb = loadImage("squeare_blue.png");
        Image tvv = loadImage("triangle_violet.png");
        Image cgg = loadImage("circle_green.png");
        if(fc)
        {
            l.drawImage(tr, 50, 100, null);
        }
        if(fc2)
        {
            l.drawImage(tr, 850, 400, null);
        }   
        
        if (sc) 
        {
            l.drawImage(cbb, 250,100, null);
        }
         if (sc2) 
        {
            l.drawImage(cbb, 650,400, null);
        }
        
        if (tc)
        {
            l.drawImage(sbb, 450, 100, null);
        }
        if (tc2)
        {
            l.drawImage(sbb, 50, 400, null);
        }
        
        if (frc)
        {
            l.drawImage(tvv, 650, 100, null);
        }
         if (frc2)
        {
            l.drawImage(tvv, 250, 400, null);
        }
        
        if (fvc) {
            l.drawImage(cgg, 850, 100, null);
        }
        if (fvc2) {
            l.drawImage(cgg, 450, 400, null);
        }
        
        if (gg2) {
                l.clearRect(0, 0, 1100, 1200);
                l.drawImage(end, 0, 0, null);
            }
        }
        
        
    }
    //for override.
    @Override
    public Rectangle getBounds()
    {
        return new Rectangle(50, 100, 150, 200);
    }
    public Rectangle getBounds2()
    {
        return new Rectangle(850, 400, 150, 200);
    }
    public Rectangle getBoundsobject()
    {
        return new Rectangle(250, 100, 150, 200);
    }    
      public Rectangle getBoundsobject2()
    {
        return new Rectangle(650, 400, 150, 200);
    }    
     public Rectangle square_blue()
    {
        return new Rectangle(450, 100, 150, 200);
    }
     public Rectangle square_blue2()
    {
        return new Rectangle(50, 400, 150, 200);
    }
    public Rectangle triangle_violet()
    {
        return new Rectangle(650, 100, 150, 200);
    }
    public Rectangle triangle_violet2()
    {
        return new Rectangle(250, 400, 150, 200);
    }
    public Rectangle circle_green()
    {
        return new Rectangle(850, 100, 150, 200);
    }
     public Rectangle circle_green2()
    {
        return new Rectangle(450, 400, 150, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
         if (t < 100) {
            t++;
        }
         
         if (ec == true) {
            ec = true;
            if (gg < 25) {
            gg++;
        }
        }
        if (mg==true) {
           fc = true;
        }
         if (mg2==true) {
           fc2 = true;
        }
        if (cb == true) {
            sc = true;
        }
        if (cb2 == true) {
            sc2 = true;
        }
        if (sb== true) {
            tc = true;
        }
        if (sb2== true) {
            tc2 = true;
        }
        if (tv == true) {
            frc = true;
        }
        if (tv2 == true) {
            frc2 = true;
        }
        if (cg == true) {
            fvc = true;
        }
        if (cg2 == true) {
            fvc2 = true;
        }
        if (counter == 9) {
            gg2 = true;
            timer.stop();
        }
                       
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent me) 
    {
       Point mo = me.getPoint();
        if (pr2 && getBounds().contains(mo)) 
        {
            mg = true;
            pr8 = true;
            counter++;
        } else if(!pr3 && !pr4 && !pr5 && pr && pr2 && pr6 && pr7 && !pr8
                && !pr9 && !pr10){
            ec = true;
        }
        if (pr8 && getBounds2().contains(mo)) 
        {
            mg2 = true;
            pr3 = true;
            counter++;
        } else if(!pr3 && !pr4 && !pr5 && pr && pr2 && pr6 && pr7 && !pr8
                && !pr9 && !pr10){
            ec = true;
        }
        
        if (pr3== true && getBoundsobject().contains(mo)) {
            cb = true;
            pr9 = true;
            counter++;
        } else if(!pr4 && !pr5 && pr && pr2 && pr3 && pr6 && pr7 && pr8 && !pr9
                && !pr10){
            ec = true;            
        }
           if (pr9== true && getBoundsobject2().contains(mo)) {
            cb2 = true;
            pr4 = true;
            counter++;
        } else if(!pr4 && !pr5 && pr && pr2 && pr3 && pr6 && pr7 && pr8 && !pr9
                && !pr10){
            ec = true;            
        }
        
        if(square_blue().contains(mo)){
            sb = true;
            pr6 = true;                          
        } else if(!pr3 && !pr && !pr2 && !pr4 && !pr5 && !pr6 && !pr7 && !pr8
                && !pr9 && !pr10){
            ec = true;
        }
           if(square_blue2().contains(mo)&& pr6){
            sb2 = true;
            pr = true;                          
        } else if(!pr3 && !pr && !pr2 && !pr4 && !pr5 && pr6 && !pr7 && !pr8
                && !pr9 && !pr10){
            ec = true;
        }
        
        if(pr4 && triangle_violet().contains(mo)){
            tv = true;
            pr10= true;
            counter++;
        } else if (!pr5 && pr && pr2 && pr3 && pr4 && pr6 && pr7 && pr8 &&
                pr9 && !pr10) {
           ec = true;
        }
        if(pr10 && triangle_violet2().contains(mo)){
            tv2 = true;
            pr5= true;
            counter++;
        } else if (!pr5 && pr && pr2 && pr3 && pr4 && pr6 && pr7 && pr8 &&
                pr9 && !pr10) {
           ec = true;
        }
        
        if (pr && circle_green().contains(mo)) {
            cg = true;
            pr7 = true;
            counter++;
        } else if (!pr5 && !pr2 && !pr3 && !pr4 && pr && pr6 && !pr7 && !pr8
                && !pr9 && !pr10) {
            ec = true;
        }
        if (pr7 && circle_green2().contains(mo)) {
            cg2 = true;
            pr2 = true;
            counter++;
        } else if (!pr5 && !pr2 && !pr3 && !pr4 && pr && pr6 && !pr7 && !pr8 
                && !pr9 && !pr10) {
            ec = true;
        }
        
         
    }

    @Override
    public void mousePressed(MouseEvent me) {
       }

    @Override
    public void mouseReleased(MouseEvent me) {
        }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
       public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    
}
