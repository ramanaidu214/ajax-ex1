package com.sanju.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="block")
public class Block {
	
	@Id
	@GenericGenerator( strategy = "increment", name = "gen1")
	@GeneratedValue(generator =  "gen1")
	private int blockId;
	private String blockName;
	//private int cropId;
	
	@OneToOne(cascade = CascadeType.ALL )
	private Crop crop;
	
	
	
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public Crop getCrop() {
		return crop;
	}
	public void setCrop(Crop crop) {
		this.crop = crop;
	}
	
	
	
}
