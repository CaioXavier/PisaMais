 

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Pisamais extends Configuracoes{ //StateBasedGame - classe própria do slick para jogos com multiplas telas, estados.
    
    public static final String nomejogo = "Pisa+"; //nome do jogo.
    public static final int menu = 0; //ordenando tela menu.
    public static final int play = 1; //ordenando tela jogo.
    public static final int play2 = 2; //ordenando tela jogo.
    public static final int tutorial = 3; //ordenando tela jogo.
    public static final int configuracoes = 4; //ordenando tela jogo.
    public static final int score = 5; //ordenando tela jogo.
    public static final int creditos = 6; //ordenando tela jogo.
    
    
    public Pisamais(String nomejogo){
        super(nomejogo); //Exibe o nome do jogo na janela.
        this.addState(new Menu(menu)); //adiciona o "state" afim do prog saber quantas telas tem.
        this.addState(new Play(play));
        this.addState(new Play2(play2));
        this.addState(new Tutorial(tutorial));
        this.addState(new Configuracoes(configuracoes));
        this.addState(new Score(score));
        this.addState(new Creditos(creditos));
                }
    
    public void initStatesList(GameContainer gc) throws SlickException{
    //GameContainer objeto responsável pelos frames, loop, imput, entre outros.
    //initStateList define os states do jogo.
    this.getState(menu).init(gc, this); //this está se referindo a este objeto/classe.
    this.getState(play).init(gc, this);
    this.getState(play2).init(gc, this);
    this.getState(tutorial).init(gc, this);
    this.getState(configuracoes).init(gc, this);
    this.getState(score).init(gc, this);
    this.getState(creditos).init(gc, this);
    this.enterState(menu); //Define qual tela será mostrada ao usuário no início.
        }
    
    public static void main (String[] args){
        
    
        AppGameContainer appgc; //objeto o qual é a janela em que o jogo rodará. Janela sempre no objeto principal.
         
        try{
            appgc = new AppGameContainer(new Pisamais (nomejogo));
            appgc.setDisplayMode(1024,768,false); //Tamanho da dela. true/false para tela cheia.
            appgc.start(); //inicia a tela.           
            
            
        }catch(SlickException e){
        e.printStackTrace();
        }
        
      
    }
    
}
