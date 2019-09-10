/**
 * 
 */
package br.com.elaborata.genericos.listagem;

/**
 * @author Roque Junior
 *
 */
public class ImprimirListagemGenerica {

	private static Integer cont = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Impressora impressora1;
		Impressora impressora2;
		Impressora impressora3;
		Impressora impressora4;
		Impressora impressora5;
		Impressora impressora6;

		ListagemGenerica<Impressora> listagem = new ListagemGenerica<Impressora>();

		impressora1 = new Impressora();
		impressora1.setMarca("HP-Series");
		impressora1.setModelo("Laserjet");
		impressora1.setQtdePaginasMinuto(150);

		System.out.println(impressora1);
		listagem.adicionar(impressora1);

		impressora2 = new Impressora();
		impressora2.setMarca("HP-Series");
		impressora2.setModelo("Deskjet");
		impressora2.setQtdePaginasMinuto(80);

		System.out.println(impressora2);
		listagem.adicionar(impressora2);

		impressora3 = new Impressora();
		impressora3.setMarca("Epson-Series");
		impressora3.setModelo("Laserjet");
		impressora3.setQtdePaginasMinuto(250);

		System.out.println(impressora3);
		listagem.adicionar(impressora3);

		impressora4 = new Impressora();
		impressora4.setMarca("Epson-Series");
		impressora4.setModelo("Deskjet");
		impressora4.setQtdePaginasMinuto(110);

		System.out.println(impressora4);
		listagem.adicionar(impressora4);

		impressora5 = new Impressora();
		impressora5.setMarca("Lexmark");
		impressora5.setModelo("Laserjet");
		impressora5.setQtdePaginasMinuto(350);

		System.out.println(impressora5);
		listagem.adicionar(impressora5);
		
		
		impressora6 = new Impressora();
		impressora6.setMarca("HP-Series");
		impressora6.setModelo("Laserjet");
		impressora6.setQtdePaginasMinuto(150);

		
		if(listagem.getLista().contains(impressora6)) {
			System.out.println("\n\nAchei a impressora");
		} else {
			System.out.println("\n\nNão achei a impressora");
		}
		System.out.println("\n\n");
		
		listagem.remover(4);
		listagem.remover(0);
		
		imprime(listagem);
	}

	private static void imprime(ListagemGenerica<Impressora> listagem) {

		for (Impressora impressora : listagem.getLista()) {
//			cont++;
//			if (cont == 1 || cont == 5) {
//				continue;
//			} else {
				System.out.println(impressora);
//			}
		}
	}

}
