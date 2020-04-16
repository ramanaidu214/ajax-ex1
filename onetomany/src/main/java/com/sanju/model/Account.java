package com.sanju.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Account {
	
	@Id
	@GenericGenerator(name = "gen1",strategy = "increment")
	@GeneratedValue(generator = "gen1")
	private int accountId;
	
	private String branchName;
	
	//private int persionId;
	

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/*
	 * public int getPersionId() { return persionId; }
	 * 
	 * public void setPersionId(int persionId) { this.persionId = persionId; }
	 */
	
	
}
