package br.com.elaborata.colecao.festa;

public class OrganizaFesta {
	
	public static void main(String[] args) {
		
		ListaFesta festa = new ListaFesta();
		
		Funcionario func1 = new Funcionario("José", "3333-2222");
		festa.addConvidado(func1);
		
		Funcionario func2 = new Funcionario("João", "4444-3333");
		festa.addConvidado(func2);
		
		Cliente cli1 = new Cliente("Apolinário", "8888-7777");
		festa.addConvidado(cli1);
		
		Cliente cli2 = new Cliente("Astrogildo", "9999-8888");
		festa.addConvidado(cli2);
		
		for (Object obj : festa.getListaConvidados()) {
			if(obj instanceof Cliente) {
				System.out.println((Cliente) obj);
			} else if( obj instanceof Funcionario) {
				System.out.println((Funcionario)obj);
			}
			System.out.println();
		}
		
	}

}
