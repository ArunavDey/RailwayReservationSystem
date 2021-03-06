package com.railway.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.railway.entities.Ticket;
import com.railway.entities.User;

public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String mobileNumber;
	private String role = "USER";
	private List<Ticket> listOfTickets = new ArrayList<>();

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Ticket> getListOfTickets() {
		return listOfTickets;
	}

	public void setListOfTickets(List<Ticket> listOfTickets) {
		this.listOfTickets = listOfTickets;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public User converToEntity() {
		User user = new User();
		user.setEmail(this.email);
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		user.setPassword(this.password);
		user.setRole(this.role);
		user.setMobileNumber(this.mobileNumber);
		user.setListOfTickets(this.listOfTickets);
		return user;
	}

}
