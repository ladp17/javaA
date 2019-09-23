package br.com.elaborata.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.elaborata.controle.HibernateUtils;
import br.com.elaborata.modelo.Usuario;

public class UsuarioDAO {

	public void inserir(Usuario usuario) throws SQLException {
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Transaction tx = null;
		
			try {
				
				tx = session.beginTransaction();
				session.save(usuario);
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
	
	public List<Usuario> pesquisar(String nome) throws SQLException {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			
			Query query = (nome.isEmpty()) ? session.createQuery("FROM Usuario") : session.createQuery("FROM Usuario WHERE nome LIKE " + "\'%" + nome + "%\'");
			
			List<Usuario> resultado = query.list();
			
			return resultado;
			
		} catch (Exception e) {
			throw new SQLException(e);
		} finally {
			session.close();
		}
	}
	
	public void excluir(Usuario entidade) throws SQLException {
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
	
	public void atualizar(Usuario entidade) throws SQLException {
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
