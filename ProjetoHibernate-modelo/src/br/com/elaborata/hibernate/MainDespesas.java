/**
 * 
 */
package br.com.elaborata.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Roque Junior
 *
 */
public class MainDespesas {

	private static DespesasDAO dao = new DespesasDAO();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// if(HibernateUtils.getSessionFactory() != null) {
		// System.out.println("Conexão efetuada com sucesso!!!");
		// } else {
		// System.out.println("Conexão recusada, verifique e tente
		// novamente!!!");
		// }

		// try {
		// DespesaModel despesa = new DespesaModel();
		// despesa.setCategoria("Casa");
		// despesa.setDescricao("Internet");
		// despesa.setValor(26.23);
		// despesa.setDataPagamento("2018-06-25");

		// dao.inserir(despesa);

		// for (DespesaModel model : dao.listar()) {
		// System.out.println(model);
		// }

		// dao.alterar(despesa);

		// dao.excluir(despesa);

		PesquisaModel p = new PesquisaModel();

		EntrevistadoModel e1 = new EntrevistadoModel();
		e1.setIdade(33);
		e1.setGenero("Feminino");
		e1.setTimeCoracao("Parana");
		e1.setPesquisa(p);

		EntrevistadoModel e2 = new EntrevistadoModel();
		e2.setIdade(77);
		e2.setGenero("Masculino");
		e2.setTimeCoracao("Palmeiras");
		e2.setPesquisa(p);
		
		EntrevistadoModel e3 = new EntrevistadoModel();
		e3.setIdade(47);
		e3.setGenero("Masculino");
		e3.setTimeCoracao("Fralmengo");
		e3.setPesquisa(p);


		Set<EntrevistadoModel> entrevistados = new HashSet<>();
		entrevistados.add(e1);
		entrevistados.add(e2);
		entrevistados.add(e3);

		p.setData("2019-09-18");
		p.setEntrevistados(entrevistados);
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction t = null;
		try {
			t = session.beginTransaction();
			//comando insert
//			session.save(p);
			//comando update
//			session.update(p);
			//comando delete
//			session.delete(p);
			//comando select
			PesquisaModel model = session.find(PesquisaModel.class, 3);
			session.flush();
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (t != null)
				t.rollback();
		} finally {
			session.close();
		}

		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
