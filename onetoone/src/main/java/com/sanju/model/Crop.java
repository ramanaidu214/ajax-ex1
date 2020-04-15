package com.sanju.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Crop {
	
	@Id
	@GenericGenerator( strategy = "increment", name = "gen1")
	@GeneratedValue(generator =  "gen1")
	private int cropId;
	private String cropName;
	
	//@Transient
	//private int blockId;
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
//	public int getBlockId() {
//		return blockId;
//	}
//	public void setBlockId(int blockId) {
//		this.blockId = blockId;
//	}
	
	
}
