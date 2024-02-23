/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosjogo;

/**
 *
 * @author aluno
 */
public class Jogador {
    private String nome;
    Pontuacao pontuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pontuacao getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Pontuacao pontuacaoFinal) {
        this.pontuacao = pontuacaoFinal;
    }
    
    @Override
    public String toString(){
        return String.format("\nJogador: %s | %d pontos\n", this.nome, this.pontuacao.getPontos());
    }
}
