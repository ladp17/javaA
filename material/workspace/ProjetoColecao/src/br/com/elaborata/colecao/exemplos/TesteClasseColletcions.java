package br.com.elaborata.colecao.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteClasseColletcions {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List listaCores = new ArrayList();

		listaCores.add("vermelho");
		listaCores.add("verde");
		listaCores.add("azul");
		listaCores.add("amarelo");
		listaCores.add("rosa");
		listaCores.add("lilás");
		listaCores.add("preto");
		listaCores.add("branco");

		//Pega o menor item da coleção (alfabetico ou numerico)
		String menor = (String) Collections.min(listaCores);
		System.out.println("Menor item da coleção: "+ menor);

		//Pega o maior item da coleção (alfabetico ou numerico)
		String maior = (String) Collections.max(listaCores);
		System.out.println("Maior item da coleção: " + maior);

		System.out.println("\n##############Exibindo lista:##################");
		exibeLista(listaCores);

		//Ordenando alfabeticamente
		Collections.sort(listaCores);

		System.out.println("###Exibindo lista após ordenação:######");
		exibeLista(listaCores);

		int indiceEncontrado = Collections.binarySearch(listaCores, "preto");
		System.out.println("Indice da cor preta: " + indiceEncontrado);

		int indiceNaoEncontrado = Collections.binarySearch(listaCores, "marrom");
		System.out.println("Indice da cor marrom: " + indiceNaoEncontrado);

		//Ordenando lista ao contrário
		Collections.reverse(listaCores);
		System.out.println("###Exibindo lista após ordenação reversa: ");
		exibeLista(listaCores);

		//Embaralhando itens
		Collections.shuffle(listaCores);
		System.out.println("###Exibindo lista após embaralhar: ");
		exibeLista(listaCores);

		//Preenchendo todos os elementos com "preto"
		Collections.fill(listaCores, "preto");
		System.out.println("###Exibindo lista após preenchimento de todos" +
		" os elementos com \"preto\"");
		exibeLista(listaCores);
	}		

	@SuppressWarnings("unchecked")
	static void exibeLista(List lista){
		//Recuperando o iterator da coleção
		Iterator cursor = lista.iterator();

		//Enquanto a coleção tiver elementos, repete o loop
		while(cursor.hasNext()){
			//Recuperando próximo elemento da coleção
			String item = (String) cursor.next();
			System.out.println(item);
		}
		System.out.println();
	}

}