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
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Explosion {
    Image imagen1 = null;
    Image imagen2 = null;
    Image imagen3 = null;
    
    public int posX = 0;
    public int posY = 0;
    
    public int tiempoDeVida = 50;
    
    Clip sonidoExplosion = null;
    
    public  Explosion(){
        try {
            sonidoExplosion = AudioSystem.getClip();
            sonidoExplosion.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonido/explosion.wav")));
        } catch (Exception ex) {
        }
        
        
    }
    
}
