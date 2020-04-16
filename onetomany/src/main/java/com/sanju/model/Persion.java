package com.sanju.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Persion {
	
	@Id
	@GenericGenerator(name = "gen1",strategy = "increment")
	@GeneratedValue(generator = "gen1")
	private int psersionId;
	
	private String persionName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "persion_id")
	private List<Account> account;
	
	public int getPsersionId() {
		return psersionId;
	}
	public void setPsersionId(int psersionId) {
		this.psersionId = psersionId;
	}
	public String getPersionName() {
		return persionName;
	}
	public void setPersionName(String persionName) {
		this.persionName = persionName;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
}
