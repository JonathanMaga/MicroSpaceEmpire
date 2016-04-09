/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author jonat
 */
import java.util.List;
import logicaJogo.Estados.IEstados;
import logicaJogo.Cartas.*;
import logicaJogo.Tecnologias.*;


public class Jogo {
    
    String nomeJogador;
    IEstados estado;
    int Pontuação;
    int Ano;
    
    
    //stock
    int Metal;
    int Riqueza;
    
    //produção
    int nivelPMetal;
    int nivelPRiquesa;
    
    //força militar
    int forçaMilitar;
    
    //tecnologias
    List<Tecnologia> listaTecnologias;
    List<Tecnologia> tecnologias;
    
    //cartas de jogo
    Starting_System homeWorld;
    List<NearSystem> nearSystem;
    List<DistantSystem> distantSystem;
    
    //planetas descobertos
    List<Planeta> alinhados;
    List<Planeta> naoAlinhados;
    
    //Eventos
    List<Evento> eventos;
    
    public Jogo(){
        
    }
    
    
   
    
    
    
}
