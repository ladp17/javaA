/**
 * 
 */
package br.com.elaborata.hibernate;

import java.sql.SQLException;
import java.util.List;

/**
 * @author aluno
 *
 */
public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DespesaModel despesaModel = new DespesaModel();
		despesaModel.setCategoria("a");
		despesaModel.setDescricao("b");
		despesaModel.setDataPagamento("2019-01-05");
		despesaModel.setValor(0);
		
		DespesasDAO dao = new DespesasDAO();
		
		try {
			dao.inserir(despesaModel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			List<DespesaModel> list = dao.listar();
			for (DespesaModel despesaModel2 : list) {
				
				System.out.println(despesaModel2);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
