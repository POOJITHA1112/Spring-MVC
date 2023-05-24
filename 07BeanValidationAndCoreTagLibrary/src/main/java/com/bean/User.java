package com.bean;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Size(min = 2, max = 30, message = "size of the name should be between 2 and 30")
	private String name;

	@Email(message = "Email must follow the format :*****@****")
	@NotBlank(message = "email must have value")
	private String email;

	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate birthday;

	@Min(value = 18, message = "age must be greater than or equal to 18")
	@NotNull(message = "age is required")
	private int age;

	@NotBlank(message = "must have role")
	private String role;

	@Valid
	private Address address;

	public User() {

	}

	public User(String name, String email, LocalDate birthday, int age, String role,Address address) {
		super();
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.age = age;
		this.role = role;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", birthday=" + birthday + ", age=" + age + "]";
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
