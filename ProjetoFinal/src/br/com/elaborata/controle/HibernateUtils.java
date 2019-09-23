/**
 * 
 */
package br.com.elaborata.controle;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author aluno
 *
 */
public class HibernateUtils {

	private static SessionFactory sessionFactory = null;
	
	public HibernateUtils() {

		
	
	}
	
	public static SessionFactory getSessionFactory() {
		
		SessionFactory sessionFactory = new Configuration().configure("br/com/elaborata/controle/hibernate.cfg.xml").buildSessionFactory();
		
		
		return sessionFactory;
		
	}
	
	public static void shutdown() {
		
		sessionFactory.close();
		
	}
	
}
