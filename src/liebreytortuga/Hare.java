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
public class Hare extends Thread implements Animal {
    private ArrayList<BufferedImage> sprites;
    private int speed;
    private boolean sleep;
    
    public Hare(int speed){
        this.speed=speed;
        this.sleep=false;
    }
    @Override
    public void setSpeed(int speed){
        this.speed=speed;
    
    }
    public int getSpeed(){
        return speed;
    }
    public void Spriteloader(int numberSprites) throws IOException{
        sprites=new ArrayList<>();
        for(int i=1; i<=numberSprites;i++){
           String path="/images/hare/sprite"+i+".png";
           loadSprite(path);
        }
        
    }

  private void loadSprite(String path) throws IOException {
    try {
        
        BufferedImage img = ImageIO.read(getClass().getResource(path));
        sprites.add(img);
        //System.out.println("Everything oK");
    } catch (IOException  | IllegalArgumentException e ) {
        System.err.println("Error loading sprite " + path);
    }
}
  public ArrayList<BufferedImage> getImageBuffer(){
      return sprites;
  }
  
    
}
