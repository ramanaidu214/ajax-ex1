package com.sanju.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	public static Session session = null;

	public static Session getSession() {
		
		if (session == null) {
			Configuration configuration = new AnnotationConfiguration();
			SessionFactory sessionFactory = configuration.configure("com/sanju/resources/hibernate.cfg.xml")
					.buildSessionFactory();
			session = sessionFactory.openSession();
			//System.out.println("session>>>>" + session);
		}
		return session;
		// Configuration configuration = new Configuration().configure("");
			/*
			 * StandardServiceRegistryBuilder builder = new
			 * StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
			 * ; SessionFactory sessionFactory = configuration
			 * .buildSessionFactory(builder.build()); return sessionFactory;
			 */
	}
	
	public static void  closeSession() {
		if(session!=null) {
			session.clear();
			session.close();
		}
	}

}
