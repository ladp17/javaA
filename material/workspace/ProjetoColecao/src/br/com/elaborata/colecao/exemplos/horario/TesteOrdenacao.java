package br.com.elaborata.colecao.exemplos.horario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacao {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List lista = new ArrayList();
		
		lista.add(new Horario(7, 58, 44));
		lista.add(new Horario(19, 19, 52));
		lista.add(new Horario(21, 10, 44));
		lista.add(new Horario(12, 15, 50));
		lista.add(new Horario(7, 55, 12));

		//Exibe conteudo original da lista
		System.out.printf("Lista de horários:\n%s\n", lista);
		
		//Classifica em ordem utilizando um comparador
		Collections.sort(lista, new ComparadorHorarios());
		
		//Exibe a lista ordenada
		System.out.printf("Lista de horários após ordenação:\n%s\n", lista);
	}

}
