package br.com.elaborata.hibernate;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
			Query query = session.createQuery("SELECT d FROM " + " DespesaModel d");
			List<DespesaModel> resultado = query.list();
			return resultado;
		} catch (Exception e) {
			throw new SQLException(e);
		} finally {
			session.close();
		}
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
			throw new SQLException(e);
		} finally {
			session.close();
		}
	}

	public void atualizar(DespesaModel entidade) throws SQLException {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(entidade);
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

}
