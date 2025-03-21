/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liebreytortuga;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
/*import java.util.Vector;*/
import javax.imageio.ImageIO;
/**
 *
 * @author drayo
 */
public class Hare extends Animal {
    
    
    public Hare(int speed){
        super(speed);
    }
  
    
    public void Spriteloader(int numberSprites) throws IOException{
       
        loadSprites(numberSprites,"/images/hare/sprite");
    }

    @Override
    public void run() {
        try{
            while(running){
                if(Math.random()<0.50){
                    System.out.print("Hare sleeping");
                    Thread.sleep(1000);
                }
                canvas.updateHarePosition();
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
             System.out.println("todo bien");
        }
    }
    
    

 
 
}
