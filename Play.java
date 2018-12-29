 

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Keyboard;

public class Play extends Play2 { 
//conecta a classe menu à classe basicgamestate, necessário ara criar estados básicos.
    Image barra, score; //imagens tela do play.
    Animation fundoGif2;
    byte opMenu = 1, exibTela = 1;
    
    boolean quit = false; //opção de sair do jogo... a fazer
    public Play (int state){ //metodo constructor.
    }
    
    public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{
    //metodo do slick para iniciar processos necessários.
    Image [] fundoGif = {new Image ("lib/Arte/Backgroud/fundoPlay.png"), new Image ("lib/Arte/Backgroud/fundoPlay1.png")};
    
    fundoGif2 = new Animation (fundoGif, 600, true);  
    barra = new Image("lib/Arte/Backgroud/barra_pontuacao.png");
    score = new Image("lib/Arte/Backgroud/score_board_PT1.png");
    
    
    }
    
    public void render(GameContainer gc, StateBasedGame sgb, Graphics g) throws SlickException{
    //metodo que desenha na tela.
    
    fundoGif2.draw(0, 0, 1024, 768);     
    barra.draw(100, 10, 500, 150); 
    score.draw(650, 350, 350, 350); 
    
    /*switch(exibTela){ // menu durante o jogo
            case 1:
                fundoGif2.draw(0, 0, 1024, 768); 
                g.drawString("Continuar (R)", 250, 250);
                g.drawString("Menu (M)", 250, 150);
                g.drawString("Sair (S)", 250, 200);
                break;
            }*/
    }
    
    public void update(GameContainer gc, StateBasedGame sgb, int delta) throws SlickException{
        /*Input entrada = gc.getInput();
        if(exibTela == 1 && entrada.isKeyPressed(Input.KEY_ENTER)){
            exibTela += 1;
        }*/

    }
    
    public int getID(){ //retorna a identificação do estado atual.
        return 1;
    }
    
}