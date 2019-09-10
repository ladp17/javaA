/**
 * 
 */
package br.com.elaborata.colecao.festa;

/**
 * @author aluno
 *
 */
public class OrganizaFesta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListaFesta festa = new ListaFesta();
		
		Funcionario func = new Funcionario("jose", "3333-2222");
		festa.addConvidado(func);
		
		func = new Funcionario("joao", "4444-3333");
		festa.addConvidado(func);
		
		Cliente cli = new Cliente("sla", "3333-2222");
		festa.addConvidado(cli);
		
		cli = new Cliente("vksj", "4444-3333");
		festa.addConvidado(cli);
		
		for (Object obj : festa.getListaConvidados()) {
			
			if (obj instanceof Cliente) {
				
				System.out.println(((Cliente) obj));
				
			} else if (obj instanceof Funcionario) {
				
				System.out.println(((Funcionario) obj));
				
			}
			System.out.println();
		}
		
	}

}
