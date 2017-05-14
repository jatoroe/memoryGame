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
    boolean ec2 = false;
    boolean gg2 = false;
    int gg = 0;
    int counter = 0;
    // comprobar respuestas
    boolean pr = false;
    boolean pr2 = false;
    boolean pr3 = false;
    boolean pr4 = false;
    boolean pr5 = false;
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
    //Booleans para el cambio de carta.
    boolean fc = false;
    boolean sc = false;
    boolean tc = false;
    boolean frc = false;
    boolean fvc = false;
    
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
        if (t < 25) {
            l.drawImage(fond, 0, 0, null);
        }else{
        
        Image warning = loadImage("Warning.png");
        
        l.clearRect(0, 0, 1100, 600);
        Image end = loadImage("final.png");
            if (gg2) {
                 l.clearRect(0, 0, 1100, 600);
                l.drawImage(end, 0, 0, null);
            }
        if (ec) {
            l.drawImage(warning, 10, 10, null);
        } else if (gg < 25) {
                l.clearRect(10, 10, 200, 200);
            }
        //Reverso Cartas.        
        l.setColor(Color.BLUE);
        l.fillRect(50, 100, 150, 200);
        l.setColor(Color.yellow);
        l.fillRect(250, 100, 150, 200);
        l.setColor(Color.RED);
        l.fillRect(450, 100, 150, 200);
        l.setColor(Color.GREEN);
        l.fillRect(650, 100, 150, 200);
        l.setColor(Color.CYAN);
        l.fillRect(850, 100, 150, 200);
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
        if (sc) 
        {
            l.drawImage(cbb, 250,100, null);
        }
        if (tc)
        {
            l.drawImage(sbb, 450, 100, null);
        }
        if (frc)
        {
            l.drawImage(tvv, 650, 100, null);
        }
        if (fvc ) {
            l.drawImage(cgg, 850, 100, null);
        }}
        
        
    }
    //for override.
    @Override
    public Rectangle getBounds()
    {
        return new Rectangle(50, 100, 150, 200);
    }
    
    public Rectangle getBoundsobject()
    {
        return new Rectangle(250, 100, 150, 200);
    }    
     public Rectangle square_blue()
    {
        return new Rectangle(450, 100, 150, 200);
    }
    public Rectangle triangle_violet()
    {
        return new Rectangle(650, 100, 150, 200);
    }
    public Rectangle circle_green()
    {
        return new Rectangle(850, 100, 150, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
         if (t < 25) {
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
        if (cb == true) {
            sc = true;
        }
        if (sb== true) {
            tc = true;
        }
        if (tv == true) {
            frc = true;
        }
        if (cg == true) {
            fvc = true;
        }
        if (counter == 5) {
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
            pr3 = true;
            counter++;
        } else if(!pr3 && !pr4 && !pr5 && pr && pr2){
            ec2 = true;
        }
        
        if (pr3== true && getBoundsobject().contains(mo)) {
            cb = true;
            pr4 = true;
            counter++;
        } else if(!pr4 && !pr5 && pr && pr2 && pr3){
            ec2 = true;            
        }
        
        if(square_blue().contains(mo)){
            sb = true;
            pr = true;
            counter++;
        } else if(!pr3 && !pr && !pr2 && !pr4 && !pr5){
            ec = true;
        }
        
        if(pr4 && triangle_violet().contains(mo)){
            tv = true;
            pr5= true;
            counter++;
        } else if (!pr5 && pr && pr2 && pr3 && pr4) {
           ec2 = true;
        }
        
        if (pr && circle_green().contains(mo)) {
            cg = true;
            pr2 = true;
            counter++;
        } else if (!pr5 && !pr2 && !pr3 && !pr4 && pr ) {
            ec2 = true;
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
