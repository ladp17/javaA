/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author ladp17
 *
 */
public class ExercicioExtra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Integer nImpressoras = 5;

		ListaGenerica<Impressora> impressoras = new ListaGenerica<Impressora>();
		
		for (int i = 0; i++ < nImpressoras;) {
			
			Impressora impressora = new Impressora("marca" + i, "modelo" + i, 500);
			impressoras.adiciona(impressora);
					
		}
		
//		impressoras.imprimeLista();
//		
//		System.out.println();
//		System.out.println("---------------------------------------------------------");
//		System.out.println();
		
		impressoras.getLista().remove(0);
		
		//era pra remover o marca2, mas nao esta
		impressoras.remover(0);
		
		impressoras.imprimeLista();
	}

}
