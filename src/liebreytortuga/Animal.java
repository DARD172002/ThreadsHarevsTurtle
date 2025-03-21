/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package liebreytortuga;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author drayo
 */
public abstract class Animal extends Thread{
    protected int speed;
    protected boolean running=true; // handller the moving
    protected Canvas canvas; //this is de address of posicion
    protected ArrayList<BufferedImage> sprites;
    public Animal(int speed){
        this.speed=speed;
        this.sprites=new ArrayList<>();
    }
    
    public void setCanvas(Canvas canvas){
        this.canvas=canvas;  
    }
    
    public void setSpeed(int speed){
        this.speed=speed;
        
    
    }
    public int getSpeed(){
        return speed;
    }
    public void stopRunning(){
        running=false;
    }
    
    public void loadSprites(int numberSprites, String pathPrefix) throws IOException {
    
    for(int i=1; i<=numberSprites;i++){
           String path=pathPrefix+i+".png";

        try {    
            BufferedImage img = ImageIO.read(getClass().getResource(path));
            sprites.add(img);
         //System.out.println("Everything oK");
            } catch (IOException  | IllegalArgumentException e ) {
            System.err.println("Error loading sprite " + path);
            }
        }
        } 
    
    public ArrayList<BufferedImage>getImageBuffer(){
        //
        return sprites;
    }
    @Override
    public abstract void run();
}
