package com.sj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}
	
	

	public HibernateUtil() {
		// TODO Auto-generated constructor stub
		
		
	}

}
