package logica;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import dadosjogo.CategoriaPergunta;
import dadosjogo.Pergunta;
import dadosjogo.Resposta;

public class LogicaJogo {

        public boolean verificaPerdeuPartida(Resposta resposta) {
		
		return !resposta.isCorreta();
	}
	
}
