/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liebreytortuga;

/**
 *
 * @author drayo
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
/*import java.util.Vector;*/
import javax.imageio.ImageIO;
/**
 *
 * @author drayo
 */
public class Turtle extends Animal {
  
    
    public Turtle(int speed){
        
        super(speed);
    }
  
    
    public void Spriteloader(int numberSprites) throws IOException{
        loadSprites(numberSprites,"/images/turtle/sprite");
    }
    
    @Override
    public void run(){
        try{
            while(running){
                canvas.updateTurtlePosition();
                Thread.sleep(150);
            }
        }catch(InterruptedException e){
            System.out.println("turtle Thread has been Interrupted");
        
        }
    }
    

 
    
}
