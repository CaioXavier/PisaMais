 

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Keyboard;

public class Score extends BasicGameState { 
    Image fundo, logo, pressPT, telatuto1PT; //imagens boas vindas.
    Animation fundoGif1;  


    public Score (int state){ //metodo constructor.

    }
    
    public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{
    Image [] fundoGif = {new Image ("lib/Arte/Backgroud/inicio1.png"), new Image ("lib/Arte/Backgroud/inicio2.png")};
       
    fundoGif1 = new Animation (fundoGif, 600, true);
    }
public void render(GameContainer gc, StateBasedGame sgb, Graphics g) throws SlickException{

    }

    public void update(GameContainer gc, StateBasedGame sgb, int delta) throws SlickException{
    //atualiza a posiação das imagens.
    }
    
    public int getID(){ //retorna a identificação do estado atual.
        return 5;

    }
    
}