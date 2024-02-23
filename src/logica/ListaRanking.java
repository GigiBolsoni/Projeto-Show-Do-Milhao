/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dadosjogo.Jogador;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Milen
 */
public class ListaRanking {
    
    private static ListaRanking instance;
    
    private final List<Jogador> historico;
    
    private ListaRanking(){
        this.historico = new ArrayList<>();
    }
    
    public void addRanking(Jogador rank){
        this.historico.add(rank);
    }
    
    public List<Jogador> getHistorico(){
        return this.historico;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Jogador j : this.historico){
            builder.append(j.toString());
        }
        return builder.toString();
    }
    
    public static synchronized ListaRanking getInstance(){
        if(instance==null){
            instance = new ListaRanking();
        }
        return instance;
    }
}
