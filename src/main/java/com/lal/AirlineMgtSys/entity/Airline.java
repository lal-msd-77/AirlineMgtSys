package com.lal.AirlineMgtSys.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	private int id;
	private String name;
	private double fare;
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airline(int id, String name, double fare) {
		super();
		this.id = id;
		this.name = name;
		this.fare = fare;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Airline [id=" + id + ", name=" + name + ", fare=" + fare + "]";
	}
	
}