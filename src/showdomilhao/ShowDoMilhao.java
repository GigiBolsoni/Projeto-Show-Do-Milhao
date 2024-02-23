/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showdomilhao;

import Interface.TelaInicial;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.swing.SwingUtilities;

import dadosjogo.Pergunta;
//import interface.TelaInicial;
import logica.ShowMilhaoIO;

/**
 *
 * @author barbara
 */
public class ShowDoMilhao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<Pergunta> perguntas1 = ShowMilhaoIO.lerPerguntasEtapa1();
        List<Pergunta> perguntas2 = ShowMilhaoIO.lerPerguntasEtapa2();
        List<Pergunta> perguntas3 = ShowMilhaoIO.lerPerguntasEtapa3();
        
        try {
			SwingUtilities.invokeAndWait(TelaInicial::new);
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
        
        /*for(Pergunta p : perguntas){
            System.out.println(p);
        }
        
        
        try {
			SwingUtilities.invokeAndWait(JanelaPrincipal::new);
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}*/
       
    }
    
}
