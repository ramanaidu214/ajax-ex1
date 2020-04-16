package com.sanju.test;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanju.model.Account;
import com.sanju.model.Persion;
import com.sanju.util.HibernateUtil;

public class PersionDAO {
	
	/*public int saveBlock() {
		
		Block block =new Block();
		block.setBlockName("103");
		//block.setCropId(1);
		Session session = HibernateUtil.getSession();
		Transaction txn =  session.beginTransaction();
		Integer blockId = (Integer) session.save(block);
		System.out.println(blockId);
		txn.commit();
		HibernateUtil.closeSession();
		return blockId;
	}
	public int saveCrop() {
		
		Crop crop=new Crop();
		//crop.setCropId(102);
		crop.setCropName("tomota");
		Session session = HibernateUtil.getSession();
		Transaction txn =  session.beginTransaction();
		Integer cropId = (Integer) session.save(crop);
		System.out.println(cropId);
		txn.commit();
		HibernateUtil.closeSession();
		return cropId;
	}*/
	
	private int savePersionAndAccount() {
		
		Account acc1=new Account();
		acc1.setBranchName("acc 1");
		Account acc2=new Account();
		acc2.setBranchName("acc 2");
		
		Persion persion=new Persion();
		persion.setPersionName("persion 1");
		List<Account> accList=new ArrayList<>();
		accList.add(acc1);
		accList.add(acc2);
		persion.setAccount(accList);
		
		Session session = HibernateUtil.getSession();
		Transaction txn =  session.beginTransaction();
		Integer blockId = (Integer) session.save(persion);
		System.out.println(blockId);
		txn.commit();
		HibernateUtil.closeSession();
		
		return blockId;
	}
	public static void main(String[] args) {
		PersionDAO dao=new PersionDAO();
		//dao.saveBlock();
		//dao.saveCrop();
		dao.savePersionAndAccount();
	}
}	
