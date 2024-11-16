package com.etco.databaseTables;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class CustomerTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String customer_name;
	@ManyToMany(mappedBy = "customers")
	private List<ContractTable> contracts;
	@OneToMany(mappedBy = "customer")
	private List<CustomerDetailsTable> customerDetails;

	public CustomerTable(int id, String customer_name) {
		this.id = id;
		this.customer_name = customer_name;
		this.contracts = new LinkedList<>();
		this.customerDetails = new LinkedList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

}
