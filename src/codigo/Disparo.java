/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author fabio
 */
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Disparo {
    
    Image imagen = null;
    public int posX = 0;
    public int posY = 0;
    
    Clip sonidoDisparo = null;
    
    
    public Disparo(){
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
            sonidoDisparo = AudioSystem.getClip();
            sonidoDisparo.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonido/laser.wav")));
        } catch (Exception e) {
        }
    }
    
 
    
    public void mueve(){
        posY-=9;
        
    }
    
    public void posicionaDisparo(Nave _nave){
        posX = _nave.posX+_nave.imagen.getWidth(null)/2 - imagen.getWidth(null)/2;
        
        posY = _nave.posY-_nave.imagen.getHeight(null)/2+6 ;
    }


}

