 

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Keyboard;

public class Tutorial extends BasicGameState { 

    Image telatuto1PT, telatuto2PT, telatuto3PT, telatuto4PT;
    Image right, left;
    Animation fundoGif1;


    public Tutorial (int state){ //metodo constructor.

    }
    
    public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{
        
        Image [] fundoGif = {new Image ("lib/Arte/Backgroud/inicio1.png"), new Image ("lib/Arte/Backgroud/inicio2.png")};
        fundoGif1 = new Animation (fundoGif, 600, true); 
        
        telatuto1PT = new Image ("lib/Arte/tutorial/tela_tutorial_1_PT.png");
        telatuto2PT = new Image ("lib/Arte/tutorial/tela_tutorial_2_PT.png");
        telatuto3PT = new Image ("lib/Arte/tutorial/tela_tutorial_3_PT.png");
        telatuto4PT = new Image ("lib/Arte/tutorial/tela_tutorial_4_PT.png");
        right = new Image ("lib/Arte/Backgroud/right.png");
        left = new Image ("lib/Arte/Backgroud/left.png");
    }

    public void render(GameContainer gc, StateBasedGame sgb, Graphics g) throws SlickException{
        
        fundoGif1.draw(0, 0, 1024, 768);
        telatuto1PT.draw(50, 20, 920, 730);
        /*telatuto2PT.draw(50, 20, 920, 730);
        telatuto3PT.draw(50, 20, 920, 730);
        telatuto4PT.draw(50, 20, 920, 730);*/
        left.draw(80, 620, 150, 100);
        right.draw(780, 620, 150, 100);
    }

    public void update(GameContainer gc, StateBasedGame sgb, int delta) throws SlickException{
    //atualiza a posiação das imagens.
    }
    
    public int getID(){ //retorna a identificação do estado atual.
        return 3;

    }
    
}