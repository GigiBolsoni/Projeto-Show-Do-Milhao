/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosjogo;

/**
 *
 * @author aluno
 */
public class Pontuacao {
    private int pontos;
    
    public Pontuacao() {
        this.pontos = 0;
    }
    
    public void adicionarPontos(int quantidade) {
        pontos += quantidade;
    }
    
    public int getPontos() {
        return pontos;
    }
}