/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosjogo;

/**
 *
 * @author barba
 */
public class Resposta {
    private String enunciado;
    private boolean correta;

    public Resposta(String enunciado, boolean correta) {
        this.enunciado = enunciado;
        this.correta = correta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean isCorreta() {
        return correta;
    }
    
}
