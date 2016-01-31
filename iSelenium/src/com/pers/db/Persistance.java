package com.pers.db;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Persistance {

	public static void main(String[] args) {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Result e1 = new Result();
		e1.setId(1);
		e1.setName("ONE");
		e1.setResult("PASS");
		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}
}