/**
 * 
 */
package br.com.elaborata.hibernate;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Roque Junior
 *
 */
public class DespesasDAO {

	public void inserir(DespesaModel entidade) throws SQLException {

		Session session = HibernateUtils.getSessionFactory().openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(entidade);
			tx.commit();

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new SQLException(e);
		} finally {
			session.close();
		}
	}

	public List<DespesaModel> listar() throws SQLException {
		Session session = HibernateUtils.getSessionFactory().openSession();

		try {
			Query query = session.createQuery("SELECT d FROM DespesaModel d");
			// Query query = session.createQuery("FROM DespesaModel");

			List<DespesaModel> despesaModels = query.list();

			return despesaModels;

		} catch (Exception e) {
			new SQLException(e);
		} finally {
			if (session != null) {
				session.close();
			}

		}

		return null;
	}

	public void excluir(DespesaModel entidade) throws SQLException {
		Session session = HibernateUtils.getSessionFactory().openSession();

		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.delete(entidade);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void alterar(DespesaModel entidade) throws SQLException {
		Session session = HibernateUtils.getSessionFactory().openSession();

		Transaction tx = null;

		try {
			tx = session.getTransaction();
			session.update(entidade);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
