package com.sanju.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//owner entity

@Entity(name = "ReaderEntity")
@Table(name = "reader", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "EMAIL") })
public class ReaderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer readerId;

	@Column(name = "email", unique = false, nullable = false, length = 100)
	private String email;
	@Column(name = "first_name", unique = false, nullable = false, length = 100)
	private String firstName;
	@Column(name = "last_name", unique = false, nullable = false, length = 100)
	private String lastName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "reader_subscription", joinColumns = {
			@JoinColumn(referencedColumnName = "ID") }, inverseJoinColumns = @JoinColumn(referencedColumnName = "ID"))
	private List<SubscriptionEntity> subscriptionsList;

	public Integer getReaderId() {
		return readerId;
	}

	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<SubscriptionEntity> getSubscriptionsList() {
		return subscriptionsList;
	}

	public void setSubscriptionsList(List<SubscriptionEntity> subscriptionsList) {
		this.subscriptionsList = subscriptionsList;
	}

	
	
	
}
