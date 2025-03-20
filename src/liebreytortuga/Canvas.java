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
    private int hareY=500;
    private int currentSpriteIndex=0;
    public Canvas(String imagePath){
    this.image=new ImageIcon(getClass().getResource(imagePath)).getImage();
    
  
    this.hare=new Hare(5);
    
    //loadSprites
    try{
     hare.Spriteloader(12);
    }
    catch(IOException e){
        Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE,null,e);
    }
    
    startAnimation();
    
    

    }
    
    
   private void startAnimation(){
    Timer timer=new Timer(100,e->{
       moveHare();//upate here is position
       repaint(); //Redraw the Canvas
    });
    timer.start();
  
    }
   
   
   private void moveHare(){
       //this move hare to the right
       hareX+=hare.getSpeed();
       //sprites
       currentSpriteIndex=(currentSpriteIndex+1)%hare.getImageBuffer().size();
   
   }
    @Override 
    
    
    
    protected void paintComponent(Graphics g){
    
    super.paintComponent(g);
   

    g.drawImage(image,0,0,getWidth(),getHeight(), this);
    
    //draw hare
    if(!hare.getImageBuffer().isEmpty()){
        BufferedImage currentSprite=hare.getImageBuffer().get(currentSpriteIndex);
        g.drawImage(currentSprite,hareX,hareY,this);
    
    }
       
    
    
    
 }
}