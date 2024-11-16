package com.etco.databaseTables;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class ContractTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial_number;
	private String type_of_contract;
	private int number_of_routine_visits;
	private int number_of_emergency_visits;
	private Date billing_period;
	private boolean call_before_visit;
	private String preferred_visit_day;
	private boolean are_parts_included;
	private boolean are_consumables_included;
	private Date expiration_date;
	private boolean is_renewable;
	private boolean is_valid;
	@ManyToMany
    @JoinTable(
    	  name = "contract_customer",
          joinColumns = @JoinColumn(name = "contract_id"),
          inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private List<CustomerTable> customers;
	

	public ContractTable(int serial_number, String type_of_contract, int number_of_routine_visits,
			int number_of_emergency_visits, Date billing_period, boolean call_before_visit, String preferred_visit_day,
			boolean are_parts_included, boolean are_consumables_included, Date expiration_date, boolean is_renewable,
			boolean is_valid) {
		super();
		this.serial_number = serial_number;
		this.type_of_contract = type_of_contract;
		this.number_of_routine_visits = number_of_routine_visits;
		this.number_of_emergency_visits = number_of_emergency_visits;
		this.billing_period = billing_period;
		this.call_before_visit = call_before_visit;
		this.preferred_visit_day = preferred_visit_day;
		this.are_parts_included = are_parts_included;
		this.are_consumables_included = are_consumables_included;
		this.expiration_date = expiration_date;
		this.is_renewable = is_renewable;
		this.is_valid = is_valid;
		customers = new LinkedList<>();
	}

	public int getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}

	public String getType_of_contract() {
		return type_of_contract;
	}

	public void setType_of_contract(String type_of_contract) {
		this.type_of_contract = type_of_contract;
	}

	public int getNumber_of_routine_visits() {
		return number_of_routine_visits;
	}

	public void setNumber_of_routine_visits(int number_of_routine_visits) {
		this.number_of_routine_visits = number_of_routine_visits;
	}

	public int getNumber_of_emergency_visits() {
		return number_of_emergency_visits;
	}

	public void setNumber_of_emergency_visits(int number_of_emergency_visits) {
		this.number_of_emergency_visits = number_of_emergency_visits;
	}

	public Date getBilling_period() {
		return billing_period;
	}

	public void setBilling_period(Date billing_period) {
		this.billing_period = billing_period;
	}

	public boolean isCall_before_visit() {
		return call_before_visit;
	}

	public void setCall_before_visit(boolean call_before_visit) {
		this.call_before_visit = call_before_visit;
	}

	public String getPreferred_visit_day() {
		return preferred_visit_day;
	}

	public void setPreferred_visit_day(String preferred_visit_day) {
		this.preferred_visit_day = preferred_visit_day;
	}

	public boolean getAre_parts_included() {
		return are_parts_included;
	}

	public void setAre_parts_included(boolean are_parts_included) {
		this.are_parts_included = are_parts_included;
	}

	public boolean getAre_consumables_included() {
		return are_consumables_included;
	}

	public void setAre_consumables_included(boolean are_consumables_included) {
		this.are_consumables_included = are_consumables_included;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}

	public boolean isIs_renewable() {
		return is_renewable;
	}

	public void setIs_renewable(boolean is_renewable) {
		this.is_renewable = is_renewable;
	}

	public boolean isIs_valid() {
		return is_valid;
	}

	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}

}
