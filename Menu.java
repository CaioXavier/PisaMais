  

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Keyboard;


public class Menu extends BasicGameState { //conecta a classe menu à classe basicgamestate, necessário para criar estados básicos.
    
    Image fundo, logo, pressPT, telatuto1PT; //imagens boas vindas.
    Image jogar, tutorial, config, score_menu, creditos, sair; //imagens menu principal.
    Animation fundoGif1, pressPTGif1;  
    public Input entrada; //input com teclado
    private Music musica_menu;
    byte opMenu = 1, exibTela = 1;
    int menuState = 0;
    final int MENU = 0, PLAY = 1, TUTORIAL = 2;
          
    public Menu(int state){ //metodo constructor.
        ThreadSom thread = new ThreadSom ("Thread #1"); // chama thread musica
        thread.start(); // inicia thread musica
    }
    
    public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{ //metodo do slick para iniciar processos necessários.
    
        Image [] fundoGif = {new Image ("lib/Arte/Backgroud/inicio1.png"), new Image ("lib/Arte/Backgroud/inicio2.png")};
        Image [] pressPTGif = {new Image ("lib/Arte/Backgroud/press_01.png"), new Image ("lib/Arte/Backgroud/press_02.png")};
        /*Image [] batRobinGif = {new Image ("lib/Arte/batmanerobin/1.png"), new Image ("lib/Arte/batmanerobin/6.png"), 
                                new Image ("lib/Arte/batmanerobin/3.png"), new Image ("lib/Arte/batmanerobin/4.png"), 
                                new Image ("lib/Arte/batmanerobin/5.png"), new Image ("lib/Arte/batmanerobin/6.png"), 
                                new Image ("lib/Arte/batmanerobin/7.png")};*/
        
        
        pressPTGif1 = new Animation (pressPTGif, 1000, true);
        fundoGif1 = new Animation (fundoGif, 600, true);  
        //batRobinGif1 = new Animation (batRobinGif, 1000, true);
        
        logo = new Image("lib/Arte/Backgroud/Logo.png");
        jogar = new Image ("lib/Arte/Backgroud/play.png");
        tutorial = new Image("lib/Arte/Backgroud/tutorial.png");
        config = new Image("lib/Arte/Backgroud/configuracoes.png");
        score_menu = new Image ("lib/Arte/Backgroud/score.png");
        creditos = new Image ("lib/Arte/Backgroud/creditos.png");
        sair = new Image ("lib/Arte/Backgroud/sair.png");
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{ //metodo que desenha na tela.
                         
        fundoGif1.draw(0, 0, 1024, 768);   
        switch(exibTela){
            case 1:
                logo.draw(200, 130, 650, 450); // (X, Y, Largura, Altura)
                pressPTGif1.draw(100, 600, 850, 85); 
                break;
            case 2:
                logo.draw(30, 40, 350, 250);
                SelecionarMenu();
                break;
            case 3:
                 //batRobinGif1.draw(100, 600, 850, 85);
                break;   
            case 4:
                //telatuto1PT = new Image ("lib/Arte/tutorial/tela_turotial_1_PT.png");
                //telatuto1PT.draw(100, 600, 850, 85);
                break; 
        } 
    }
    
    public void update(GameContainer gc, StateBasedGame sgb, int delta) throws SlickException{ //atualiza imagens.
        
        Input entrada = gc.getInput();
        if(exibTela == 1 && entrada.isKeyPressed(Input.KEY_ENTER)){
            exibTela += 1;
        } //Se clicar Enter abre o Menu 2 Play, Tutorial...
        
        /*Clicando em Down ou Up altera a variavel opMenu e assim alterar a imagem, pois cada 
        imagem equivale a um valor do opMenu*/
        if(entrada.isKeyPressed(Input.KEY_DOWN)){ 
            opMenu += 1;
            if (opMenu >= 7){
                opMenu = 1;
            }
        }
        if(entrada.isKeyPressed(Input.KEY_UP)){
            opMenu -= 1;
            if (opMenu <= 0){
                opMenu = 6;
            }            
        }
        /*Se tiver no exibTela e clicar no Enter, vai executar a ação de cada menu no metodo
        InserirComando*/
         /*if(exibTela == 3 && entrada.isKeyPressed(Input.KEY_ENTER)){
            InserirComando();
         }*/
         
        if(exibTela == 2 && entrada.isKeyPressed(Input.KEY_ENTER)){
            sgb.enterState(1);
        }
             
        if(exibTela == 3 && entrada.isKeyPressed(Input.KEY_ENTER)){
            sgb.enterState(3);
        }
                
        if(exibTela == 4 && entrada.isKeyPressed(Input.KEY_ENTER)){
            sgb.enterState(4);
        }
        
        if(exibTela == 5 && entrada.isKeyPressed(Input.KEY_ENTER)){
            sgb.enterState(5);
        }
        
        if(exibTela == 5 && entrada.isKeyPressed(Input.KEY_ENTER)){
            sgb.enterState(6);
        }
        
    }
    
    public int getID(){ //retorna a identificação do estado atual.
        return 0;
    }
    
    public void SelecionarMenu(){ //Metodo para exibir opções do Jogo
        switch (opMenu)
            {
                case 1:                
                    jogar.draw(440, 100, 200, 100);
                    tutorial.draw(430, 200, 180, 50);
                    config.draw(380, 300, 300, 50);
                    score_menu.draw(450, 400, 140, 50);
                    creditos.draw(440, 500, 150, 50);
                    sair.draw(460, 600, 100, 40);
                    break;
                case 2:
                    jogar.draw(470, 100, 100, 50);
                    tutorial.draw(390, 180, 280, 100);
                    config.draw(380, 300, 300, 50);
                    score_menu.draw(450, 400, 140, 50);
                    creditos.draw(440, 500, 150, 50);
                    sair.draw(460, 600, 100, 40);
                    break;
                case 3:
                    jogar.draw(470, 100, 100, 50);
                    tutorial.draw(430, 200, 180, 50);
                    config.draw(320, 300, 400, 100);
                    score_menu.draw(450, 400, 140, 50);
                    creditos.draw(440, 500, 150, 50);
                    sair.draw(460, 600, 100, 40);
                    break;
                case 4:
                    jogar.draw(470, 100, 100, 50);
                    tutorial.draw(430, 200, 180, 50);
                    config.draw(380, 300, 300, 50);
                    score_menu.draw(400, 370, 240, 100);
                    creditos.draw(440, 500, 150, 50);
                    sair.draw(460, 600, 100, 40);
                    break;
                case 5:
                    jogar.draw(470, 100, 100, 50);
                    tutorial.draw(430, 200, 180, 50);
                    config.draw(380, 300, 300, 50);
                    score_menu.draw(450, 400, 140, 50);
                    creditos.draw(390, 470, 250, 100);
                    sair.draw(460, 600, 100, 40);
                    break;
                case 6:
                    jogar.draw(470, 100, 100, 50);
                    tutorial.draw(430, 200, 180, 50);
                    config.draw(380, 300, 300, 50);
                    score_menu.draw(450, 400, 140, 50);
                    creditos.draw(440, 500, 150, 50);
                    sair.draw(400, 600, 200, 90);
                    break;
            }
    }
    
    /*public void InserirComando()throws SlickException{
        switch(opMenu){
            case 1:
                //Iniciando o Jogo
                //exibTela += 3;
                
                break;
            case 2:
                //iniciando tela de configurações
                //sgb.enterState(1);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                //Saindo do Jogo
                System.exit(0);
                break;
        }            
    }*/
} 