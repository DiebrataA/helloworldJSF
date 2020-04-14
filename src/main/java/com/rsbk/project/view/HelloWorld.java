package com.rsbk.project.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorld {

	private String firstName;
	private String lastName;
	private String address;
	private String postc;
	private String city;
	private String country;
	private String phone;
	private String email;
	private String date;
	private String output;
	public void submit() {
		output = "Hello World! You have typed: " + firstName  + lastName + "<br>" + address + "<br>" + city + "<br>" + postc + "<br>" + country + "<br>" + phone + "<br>" + email + "<br>" + date ;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getpostc() {
		return postc;
	}

	public void setpostc(String postc) {
		this.postc = postc;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getOutput() {
		return output;
	}
}

