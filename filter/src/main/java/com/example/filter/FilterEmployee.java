package com.example.filter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FilterEmployee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String department;
	private String position;
	private String firstName;
	private String lastName;
	private long salary;
	private String email;
	private String contactNumber;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "FilterEmployee [id=" + id + ", department=" + department + ", position=" + position + ", firstName="
				+ firstName + ", lastName=" + lastName + ", salary=" + salary + ", email=" + email + ", contactNumber="
				+ contactNumber  + "]";
	}

	public FilterEmployee(Integer id, String department, String position, String firstName, String lastName,
			long salary, String email, String contactNumber) {
		super();
		this.id = id;
		this.department = department;
		this.position = position;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
		this.contactNumber = contactNumber;

	}

	public FilterEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
