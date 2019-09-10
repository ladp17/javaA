/**
 * 
 */
package br.com.elaborata.genericos.impressora;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class ImprimirListagem {

	static Integer cont = 0;

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

		List<Impressora> listagem = new ArrayList<Impressora>();

		impressora1 = new Impressora();
		impressora1.setMarca("HP laserjet");
		impressora1.setModelo("260");
		impressora1.setQtdePaginasMinuto(18);

		System.out.println(impressora1);
		listagem.add(impressora1);

		impressora2 = new Impressora();
		impressora2.setMarca("Samsung laserjet");
		impressora2.setModelo("650");
		impressora2.setQtdePaginasMinuto(58);

		System.out.println(impressora2);
		listagem.add(impressora2);

		impressora3 = new Impressora();
		impressora3.setMarca("Epson laserjet");
		impressora3.setModelo("620");
		impressora3.setQtdePaginasMinuto(28);

		System.out.println(impressora3);
		listagem.add(impressora3);

		impressora4 = new Impressora();
		impressora4.setMarca("XEROX laserjet");
		impressora4.setModelo("209");
		impressora4.setQtdePaginasMinuto(33);

		System.out.println(impressora4);
		listagem.add(impressora4);

		impressora5 = new Impressora();
		impressora5.setMarca("Lexmark laserjet");
		impressora5.setModelo("460");
		impressora5.setQtdePaginasMinuto(39);

		System.out.println(impressora5);
		listagem.add(impressora5);

		impressora6 = new Impressora();
		impressora6.setMarca("HP laserjet");
		impressora6.setModelo("260");
		impressora6.setQtdePaginasMinuto(18);

		System.out.println(impressora6);

		if (listagem.contains(impressora6)) {
			System.out.println("\n\nAchei");
		} else {
			System.out.println("\n\nNão Achei");
		}

		System.out.println("\n\nImprimindo a lista de impressoras depois da remoção\n");

		remove(listagem);

		imprimeImpressora(listagem);

	}

	private static void remove(List<Impressora> listagem) {
		for (int i = 0; i < listagem.size(); i++) {
			if (i == 0 || i == 3) {
				listagem.remove(i);
			}
		}

	}

	private static void imprimeImpressora(List<Impressora> impressoras) {
		for (Impressora impressora : impressoras) {
			System.out.println(impressora);
		}
		System.out.println();
	}
}
