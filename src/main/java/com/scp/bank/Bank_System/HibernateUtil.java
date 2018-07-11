package com.scp.bank.Bank_System;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory factory=null;
	public synchronized static SessionFactory sessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
		
	}
	public static void flushNCommit(Session s,Transaction tr)
	{
		if(s!=null)
			s.close();
		if(tr!=null)
		{
			tr.commit();
		}
	}
}
