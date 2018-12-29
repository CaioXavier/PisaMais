 
 
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class ThreadSom extends Thread {
    
    private String som; // nome thread
    private Music musica_menu;
 
    public ThreadSom (String som){
        this.som = som;
    }
    public void run(){ try {
        //defini o que a thread fará
        musica_menu = new Music ("lib/Arte/Backgroud/musica_menu.ogg");
        } catch (SlickException ex) {
            Logger.getLogger(ThreadSom.class.getName()).log(Level.SEVERE, null, ex);
        }
        musica_menu.play();
        musica_menu.setVolume(0.5f);
    }
}

    