package br.com.elaborata.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public HibernateUtils() {
	}

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

			registryBuilder.loadProperties("hibernate.properties");

			StandardServiceRegistry registry = registryBuilder.build();
			try {
				MetadataSources metadataSources = new MetadataSources(registry);
				metadataSources.addAnnotatedClass(DespesaModel.class);
				metadataSources.addAnnotatedClass(PesquisaModel.class);
				metadataSources.addAnnotatedClass(EntrevistadoModel.class);

				sessionFactory = metadataSources.buildMetadata().buildSessionFactory();

			} catch (Exception e) {
				e.printStackTrace();
				StandardServiceRegistryBuilder.destroy(registry);
			}
			
		}
		return sessionFactory;

	}
	
	public static void shutdown(){
		sessionFactory.close();
	}

}
