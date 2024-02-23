/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dadosjogo.CategoriaPergunta;
import dadosjogo.Pergunta;
import dadosjogo.Resposta;

/**
 *
 * @author barbara
 */
public class ShowMilhaoIO {
    
    private static final String SEPARADOR = ";";
    public static final String ROOT = "C:\\Users\\barba\\Downloads\\showMilhao_projeto_final (5)\\showMilhao_projeto_final\\showMilhao_projeto_final\\src\\";
    
    private static List<Pergunta> lerPerguntas(String caminho){
        List<Pergunta> perguntas = new ArrayList<>();
        try{
            File arquivo = new File(caminho);
            Scanner leitor = new Scanner(arquivo, "UTF-8");
            
            leitor.nextLine();
            while(leitor.hasNext()){
                String linha = leitor.nextLine();
                String dados[] = linha.split(SEPARADOR);
                
                List<Resposta> respostas = new ArrayList<>();
                for(int i = 2; i <= dados.length-2; i+=2){
                    respostas.add(new Resposta(dados[i], dados[i+1].equals("true")));
                }
                
                Pergunta p = new Pergunta(
                    CategoriaPergunta.valueOf(dados[0]),
                    dados[1],
                    respostas
                );
                
                perguntas.add(p);
            }
            
            leitor.close();
                    
        }catch(FileNotFoundException error){
            System.out.println(error);
        }
        return perguntas;
        
        
    }
    
    public static List<Pergunta> lerPerguntasEtapa1(){
        return lerPerguntas(ROOT+"perguntas.csv");
    }
    public static List<Pergunta> lerPerguntasEtapa2(){
        return lerPerguntas(ROOT+"perguntasEtapa2.csv");
    }
    public static List<Pergunta> lerPerguntasEtapa3(){
        return lerPerguntas(ROOT+"perguntasEtapa3.csv");
    }
}
