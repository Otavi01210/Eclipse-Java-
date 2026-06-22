package br.com.escola.service;

import java.util.ArrayList;

public class EscolaService {

	private List<Turmas> turmas = new ArrayList<>();



    public void adicionarTurmas(Turma turma) {
    	turmas.add(turmas);
}
    
    public List<Turmas> listarTurmas() {
    	return turmas;
}
    
    public Turma buscarTurma (int indice) {
    	if (indice >= 0 && indice < turmas.size()) {
    		return turmas.get(indice);
    	}
    	return null;
    
    }
    
    public boolean estaVazia() {
    	return turmas.isEmpty();
    }
    }


