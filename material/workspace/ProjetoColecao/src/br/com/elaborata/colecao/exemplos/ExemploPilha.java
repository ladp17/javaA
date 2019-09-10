package br.com.elaborata.colecao.exemplos;

import java.util.Stack;

public class ExemploPilha {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Stack pilha = new Stack();

		pilha.push("preto");
		pilha.push("branco");
		pilha.push("amarelo");
		pilha.push("verde");
		
		for (int i = 0 ; i < pilha.size() ; i++){
			String topo = (String) pilha.peek();
			System.out.println("Topo: " + topo);
			System.out.println("Retirando elemento do topo: " + pilha.pop());
		}

	}

}
