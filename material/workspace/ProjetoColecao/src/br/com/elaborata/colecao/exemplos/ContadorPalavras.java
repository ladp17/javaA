package br.com.elaborata.colecao.exemplos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ContadorPalavras {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Criando mapa
		Map map = new LinkedHashMap();
		String[] palavrasChave = {"as", "os", "o", "é", "um"};
		
		//Colocando palavras no mapa - estas serão as chaves
		for(String palavra : palavrasChave){
			map.put(palavra, new Integer(0));
		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um texto qualquer: ");
		String texto = entrada.nextLine().toLowerCase();
		System.out.println();
		
		StringTokenizer token = new StringTokenizer(texto, " ");
		
		while(token.hasMoreTokens()){
			String proximoToken = token.nextToken();
			if(map.containsKey(proximoToken)){
				//Para cada chave, terá a qtde de ocorrências de cada palavra
				Integer qtde = (Integer) map.get(proximoToken);
				
				//Pega a qtde de ocorrências e soma 1
				map.put(proximoToken, qtde.intValue()+1);
			}
		}
		for(String palavra : palavrasChave){
			System.out.println(palavra + ": "+ map.get(palavra));
		}
		System.out.println("Tamanho: " + map.size());
	}
}
