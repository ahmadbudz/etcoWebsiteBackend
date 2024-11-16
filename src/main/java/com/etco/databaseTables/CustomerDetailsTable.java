package com.etco.databaseTables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerDetailsTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private CustomerTable customer;
	private String phoneNumber;
	private String email;
	private String city;
	private String neighborhood;
	
	public CustomerDetailsTable(Integer id, CustomerTable customer, String phoneNumber, String email, String city,
			String neighborhood) {
		this.id = id;
		this.customer = customer;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.city = city;
		this.neighborhood = neighborhood;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerTable getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

}
