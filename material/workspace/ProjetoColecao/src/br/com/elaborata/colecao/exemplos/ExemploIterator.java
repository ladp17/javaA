package br.com.elaborata.colecao.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//criando lista
		List cores = new ArrayList();
		
		//Adicionando cores
		cores.add("preto");
		cores.add("branco");
		cores.add("amarelo");
		cores.add("vermelho");
		cores.add("azul");
		
		//Recuperando o iterator da coleção
		Iterator cursor = cores.iterator();
		
		//Enquanto a coleção tiver elementos, repete loop
		
		while(cursor.hasNext()){
			
			//Recuperando proximo elemento da coleção
			String item = (String) cursor.next();
			System.out.println(item);
			//Removendo cada elemento
			cursor.remove();
		}
		
		//Verifica se a lista está vazia
		if(cores.isEmpty()){
			
			//A coleção está vazia
			System.out.println("\nColeção Vazia");
		} else {
			//A coleção não está vazia
			System.out.println("\nColeção não Vazia");
		}
		

	}

}
