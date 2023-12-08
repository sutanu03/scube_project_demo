package com.sutanu.main.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
 * 
 * POJO class for user
 * 
 * */
@Component
@Entity
public class User {

	@Id
	@Column(name = "email_id")
	private String a_email;
	
	
	@Column(name = "first_name")
	private String b_f_name;
	
	
	@Column(name = "last_name")
	private String c_l_name;
	
	
	@Column(name = "address")
	private String d_address;
	
	
	@Column(name = "mobile_number")
	private String e_mobile_no;
	
	
	@Column(name = "contact_number")
	private String f_contact_no;
	
	
	@Column(name = "password")
	private String g_password1;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String a_email, String b_f_name, String c_l_name, String d_address, String e_mobile_no,
			String f_contact_no, String g_password1) {
		super();
		this.a_email = a_email;
		this.b_f_name = b_f_name;
		this.c_l_name = c_l_name;
		this.d_address = d_address;
		this.e_mobile_no = e_mobile_no;
		this.f_contact_no = f_contact_no;
		this.g_password1 = g_password1;
	}


	public String getA_email() {
		return a_email;
	}


	public void setA_email(String a_email) {
		this.a_email = a_email;
	}


	public String getB_f_name() {
		return b_f_name;
	}


	public void setB_f_name(String b_f_name) {
		this.b_f_name = b_f_name;
	}


	public String getC_l_name() {
		return c_l_name;
	}


	public void setC_l_name(String c_l_name) {
		this.c_l_name = c_l_name;
	}


	public String getD_address() {
		return d_address;
	}


	public void setD_address(String d_address) {
		this.d_address = d_address;
	}


	public String getE_mobile_no() {
		return e_mobile_no;
	}


	public void setE_mobile_no(String e_mobile_no) {
		this.e_mobile_no = e_mobile_no;
	}


	public String getF_contact_no() {
		return f_contact_no;
	}


	public void setF_contact_no(String f_contact_no) {
		this.f_contact_no = f_contact_no;
	}


	public String getG_password1() {
		return g_password1;
	}


	public void setG_password1(String g_password1) {
		this.g_password1 = g_password1;
	}


	@Override
	public String toString() {
		return "User [a_email=" + a_email + ", b_f_name=" + b_f_name + ", c_l_name=" + c_l_name + ", d_address="
				+ d_address + ", e_mobile_no=" + e_mobile_no + ", f_contact_no=" + f_contact_no + ", g_password1="
				+ g_password1 + "]";
	}
	

}
