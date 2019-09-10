package br.com.elaborata.colecao.split;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String linha = "001,Fulano,Rua 3";
//		String linha = "002,Beltrano,Rua 1";
//		String linha = "003,Ciclano,Rua 8";
//		String linha = "004,Harry Potter,Rua dos alfeneiros 4";
		String[] array = linha.split(",");

		List<Funcionario> listaFunc = new ArrayList<Funcionario>();

		// ler cada linha do arquivo com o metodo realine
		Funcionario f = new Funcionario(Integer.valueOf(array[0]),
				array[1],array[2]);
		listaFunc.add(f);
		
		for(Funcionario f1 : listaFunc) {
		    System.out.println(f1);
		}

	}

}
