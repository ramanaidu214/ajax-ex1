package com.sanju.test;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanju.model.Block;
import com.sanju.model.Crop;
import com.sanju.util.HibernateUtil;

public class BlockDAO {
	
	public int saveBlock() {
		
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
	}
	
	private int saveBlockAndCrop() {
		
		Crop crop=new Crop();
		crop.setCropName("crop 1");
		
		Block block=new Block();
		block.setBlockName("block 1");
		block.setCrop(crop);
		
		Session session = HibernateUtil.getSession();
		Transaction txn =  session.beginTransaction();
		Integer blockId = (Integer) session.save(block);
		System.out.println(blockId);
		txn.commit();
		HibernateUtil.closeSession();
		
		return blockId;
	}
	public static void main(String[] args) {
		BlockDAO dao=new BlockDAO();
		//dao.saveBlock();
		//dao.saveCrop();
		dao.saveBlockAndCrop();
	}
}	
