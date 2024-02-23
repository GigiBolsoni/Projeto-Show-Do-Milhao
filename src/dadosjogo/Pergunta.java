/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosjogo;

import java.util.List;

/**
 *
 * @author barba
 */
public class Pergunta {
    
    private List<Resposta> respostas;
    private String enunciado;
    private CategoriaPergunta categoria;
    
    public Pergunta(CategoriaPergunta categoria, String enunciado, List<Resposta> respostas){
        this.categoria = categoria;
        this.respostas =  respostas;
        this.enunciado = enunciado;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public CategoriaPergunta getCategoria() {
        return categoria;
    }
    
    @Override
    public String toString(){
       
        return String.format("Pergunta: %s", this.enunciado);
    }
}
