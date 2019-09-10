package br.com.elaborata.colecao.exemplos.horario;

import java.util.Comparator;

public class ComparadorHorarios implements Comparator<Horario> {
	
	public int compare(Horario horario1, Horario horario2){
		//Compara hora
		int comparaHora = horario1.getHora() - horario2.getHora();
		
		//Testa a hora
		if(comparaHora != 0){
			return comparaHora;
		}
		
		int comparaMinuto = horario1.getMinuto() - horario2.getMinuto();
		
		//Testa o minuto
		if(comparaMinuto != 0){
			return comparaMinuto;
		}	
		//Compara segundo
		int comparaSegundo = horario1.getSegundo() - horario2.getSegundo();

		//Retorna o resultado da comparação de segundos
		return comparaSegundo;
		
	}
}
