package br.com.elaborata.colecao.exemplos;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection conjunto = new LinkedHashSet();
		
		conjunto.add("A");
		conjunto.add("B");
		conjunto.add("C");
		conjunto.add("1");
		conjunto.add("E");
		conjunto.add("2");
		
		//Tentando adicionar "C" novamente
		if(!conjunto.add("C")){
			System.err.println("Valor \"C\" já existe.");
		}

		Iterator cursor = conjunto.iterator();
		
		//Enquanto a coleção tiver elementos, repete o loop
		while(cursor.hasNext()){
			//Recuperando próximo elemento da coleção
			String item = (String) cursor.next();
			System.out.println(item);
		}

	}

}
