/**
 * 
 */
package br.com.elaborata.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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
		
		SessionFactory sessionFactory = new Configuration().configure("br/com/elaborata/hibernate/hibernate.cfg.xml").buildSessionFactory();
		
		
		return sessionFactory;
		
	}
	
	public static void shutdown() {
		
		sessionFactory.close();
		
	}
	
}
