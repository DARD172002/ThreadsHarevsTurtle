/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liebreytortuga;

/**
 *
 * @author drayo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Canvas extends JPanel {
    private Image image;
    private Hare hare ;
    private int hareX=0;
    private int hareY=380;
    private Turtle turtle;
    private int currentSpriteIndexHare=0;
    private int currentSpriteIndexTurtle=0;
    private int turtleX=0;
    private int turtleY=450;
    public Canvas(String imagePath){
    this.image=new ImageIcon(getClass().getResource(imagePath)).getImage();
    this.turtle=new Turtle(2);
    this.hare=new Hare(5);
    
    //loadSprites
    try{
     hare.Spriteloader(12);
     turtle.Spriteloader(11);
    }
    catch(IOException e){
        Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE,null,e);
    }
    
     startRace();
     
    

    }
    
    public void startRace(){
        hare.setCanvas(this);
        turtle.setCanvas(this);
        hare.start();
        turtle.start();
        
    }
    


        
    public synchronized void updateHarePosition(){
     hareX+= hare.getSpeed();
     currentSpriteIndexHare=(currentSpriteIndexHare+1)%hare.getImageBuffer().size();
     repaint();
    }
     public synchronized void updateTurtlePosition(){
     turtleX+= turtle.getSpeed();
     currentSpriteIndexTurtle=(currentSpriteIndexTurtle+1)%turtle.getImageBuffer().size();
     repaint();
    }
    
    
    @Override
    protected void paintComponent(Graphics g){
    
    super.paintComponent(g);
   

    g.drawImage(image,0,0,getWidth(),getHeight(), this);
    
    //draw hare
    if(!hare.getImageBuffer().isEmpty()){
        BufferedImage currentSpriteHare=hare.getImageBuffer().get(currentSpriteIndexHare);
        g.drawImage(currentSpriteHare,hareX,hareY,this);
    
    }
    
   
    if(!turtle.getImageBuffer().isEmpty()){
        BufferedImage currentSpriteTurtle=turtle.getImageBuffer().get(currentSpriteIndexTurtle);
        g.drawImage(currentSpriteTurtle,turtleX,turtleY,this);
    
    }

       
    
    
    
 }
}