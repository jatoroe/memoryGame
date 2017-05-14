/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamememory;

import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author JAVIER
 */

public class GameMemory extends JFrame
{
public GameMemory ()
    {
         add(new NewPanel1());
         setResizable(false);
         pack();
    }

    public static void main(String[] args)
    {
        GameMemory frame = new GameMemory();
        frame.setTitle("Game Memory");
        frame.setSize(1100, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
