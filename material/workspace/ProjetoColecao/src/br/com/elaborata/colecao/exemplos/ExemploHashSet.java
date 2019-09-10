package br.com.elaborata.colecao.exemplos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
//		Criando HashSet
		Set conjuntoCores = new HashSet();
//		Adicionando elementos
		conjuntoCores.add("amarelo");
		conjuntoCores.add("verde");
		conjuntoCores.add("azul");
//		este item não será adicionado, pois é repetido
		conjuntoCores.add("amarelo");
		conjuntoCores.add("rosa");
//		este item não será adicionado, pois é repetido
		conjuntoCores.add("verde");
//		este item não será adicionado, pois é repetido
		conjuntoCores.add("amarelo");
//		este item não será adicionado, pois é repetido
		conjuntoCores.add("verde");
		conjuntoCores.add("preto");
		
//		Recuperando o iterador do conjunto
		Iterator cursor = conjuntoCores.iterator();
		
		while(cursor.hasNext()) {
//			recuperando próximo elemento da coleção
			String item = (String) cursor.next();
			System.out.println(item);
		}
	}

}
