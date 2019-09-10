package br.com.elaborata.colecao.exemplos.horario;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario(int h, int m, int s){
		alteraHorario(h, m, s);
	}
	
	public void alteraHorario(int h, int m, int s){
		setHora(h);
		setMinuto(m);
		setSegundo(s);
	}
	
	//Valida e configura as horas
	public void setHora(int h){
		hora = ((h >= 0 && h < 24) ? h : 0);
	}
	
	//Valida e configura os minutos
	public void setMinuto(int m){
		minuto = ((m >= 0 && m < 60) ? m : 0);
	}
	
	//Valida e configura os segundos
	public void setSegundo(int s){
		segundo = ((s >= 0 && s < 60) ? s : 0);
	}
	
	//Obtem valor das horas
	public int getHora(){
		return hora;
	}
	
	//Obtem valor dos minutos
	public int getMinuto(){
		return minuto;
	}
	
	//Obtem valor dos segundos
	public int getSegundo(){
		return segundo;
	}
	
	@Override
	public String toString(){
		
		return getHora() + ":" + getMinuto() + ":" + getSegundo();
	}
}