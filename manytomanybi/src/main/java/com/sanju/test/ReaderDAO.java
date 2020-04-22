package com.sanju.test;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanju.model.ReaderEntity;
import com.sanju.model.SubscriptionEntity;
import com.sanju.util.HibernateUtil;

public class ReaderDAO {
	
	private int saveReaderAndSubscription() {
		
		SubscriptionEntity subscriptionEntity1=new SubscriptionEntity();
		subscriptionEntity1.setSubscriptionName("Entertainment");
		
		SubscriptionEntity subscriptionEntity2=new SubscriptionEntity();
		subscriptionEntity2.setSubscriptionName("Horror");
		
		List<SubscriptionEntity> subscriptionEntitiesList=new  ArrayList<>();
		subscriptionEntitiesList.add(subscriptionEntity1);
		subscriptionEntitiesList.add(subscriptionEntity2);
		
		
		ReaderEntity readerEntity1=new ReaderEntity();
		readerEntity1.setFirstName("sanju");
		readerEntity1.setLastName("sanjay");
		readerEntity1.setEmail("sanju123@gmail.com");
		
		ReaderEntity readerEntity2=new ReaderEntity();
		readerEntity2.setFirstName("ram");
		readerEntity2.setLastName("venkat");
		readerEntity2.setEmail("venkat123@gmail.com");
		
		readerEntity1.setSubscriptionsList(subscriptionEntitiesList);
		readerEntity2.setSubscriptionsList(subscriptionEntitiesList);

		//mapping side
		/*List<ReaderEntity> readerEntitiesList=new ArrayList<>();
		readerEntitiesList.add(readerEntity1);
		readerEntitiesList.add(readerEntity2);
		
		subscriptionEntity1.setReaderEntity(readerEntitiesList);
		subscriptionEntity2.setReaderEntity(readerEntitiesList);*/
		
		
		Session session = HibernateUtil.getSession();
		Transaction txn =  session.beginTransaction();
		session.save(readerEntity1);
		session.save(readerEntity2);
		//System.out.println(blockId);
		txn.commit();
		HibernateUtil.closeSession();
		
		return 1;
	}
	public static void main(String[] args) {
		ReaderDAO dao=new ReaderDAO();
		dao.saveReaderAndSubscription();
	}
}	
