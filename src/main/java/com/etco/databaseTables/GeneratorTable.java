package com.etco.databaseTables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeneratorTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serial_number;
	private String manufacturer;
	private double power_rate;
	private String model_number;
	private long engine_serial_number;
	private String engine_model;
	private long alternator_serial_number;
	private String alternator_model;
	private long controller_serial_number;
	private String controller_model;
	private float running_hours;
	private String battery;

	public GeneratorTable(int serial_number, String manufacturer, double power_rate, String model_number,
			long engine_serial_number, String engine_model, long alternator_serial_number, String alternator_model,
			long controller_serial_number, String controller_model, float running_hours, String battery) {
		this.serial_number = serial_number;
		this.manufacturer = manufacturer;
		this.power_rate = power_rate;
		this.model_number = model_number;
		this.engine_serial_number = engine_serial_number;
		this.engine_model = engine_model;
		this.alternator_serial_number = alternator_serial_number;
		this.alternator_model = alternator_model;
		this.controller_serial_number = controller_serial_number;
		this.controller_model = controller_model;
		this.running_hours = running_hours;
		this.battery = battery;
	}

	public int getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPower_rate() {
		return power_rate;
	}

	public void setPower_rate(double power_rate) {
		this.power_rate = power_rate;
	}

	public String getModel_number() {
		return model_number;
	}

	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}

	public long getEngine_serial_number() {
		return engine_serial_number;
	}

	public void setEngine_serial_number(long engine_serial_number) {
		this.engine_serial_number = engine_serial_number;
	}

	public String getEngine_model() {
		return engine_model;
	}

	public void setEngine_model(String engine_model) {
		this.engine_model = engine_model;
	}

	public long getAlternator_serial_number() {
		return alternator_serial_number;
	}

	public void setAlternator_serial_number(long alternator_serial_number) {
		this.alternator_serial_number = alternator_serial_number;
	}

	public String getAlternator_model() {
		return alternator_model;
	}

	public void setAlternator_model(String alternator_model) {
		this.alternator_model = alternator_model;
	}

	public long getController_serial_number() {
		return controller_serial_number;
	}

	public void setController_serial_number(long controller_serial_number) {
		this.controller_serial_number = controller_serial_number;
	}

	public String getController_model() {
		return controller_model;
	}

	public void setController_model(String controller_model) {
		this.controller_model = controller_model;
	}

	public float getRunning_hours() {
		return running_hours;
	}

	public void setRunning_hours(float running_hours) {
		this.running_hours = running_hours;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

}
