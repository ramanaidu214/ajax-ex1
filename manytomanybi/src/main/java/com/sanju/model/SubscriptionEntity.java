package com.sanju.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//mapped entity
@Entity(name="SubscriptionEntity")
@Table(name = "subscription",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class SubscriptionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",unique = true,nullable = false)
	private Integer subscriptionId;
	
	@Column(name="sub_name",unique = true,nullable = false,length = 100)
	private String subscriptionName;
	
	@ManyToMany(mappedBy = "subscriptionsList")//owning side column or entity
	private List<ReaderEntity> readerEntity;

	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public List<ReaderEntity> getReaderEntity() {
		return readerEntity;
	}

	public void setReaderEntity(List<ReaderEntity> readerEntity) {
		this.readerEntity = readerEntity;
	}
	
	
}
