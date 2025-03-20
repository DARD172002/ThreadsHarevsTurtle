/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liebreytortuga;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author drayo
 */
public class LiebreyTortuga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic herep
     
     final int HEIGH=700;
     final int WIDTH=1500;
     //charge the vector sprites of hare
     Hare hare=new Hare(50);
     
    
     //hare.Spriteloader(12);
     
     JFrame frame=new JFrame("Hare vs Turtle Race");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(WIDTH,HEIGH);
     
     
     Canvas canvas = new Canvas("background.png");
     frame.add(canvas);
     frame.setVisible(true);
    
}
}
