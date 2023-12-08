package com.sutanu.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
 * 
 * POJO class for AssignUser
 * 
 * */

@Entity
public class AssignUser {
	
	@Id
	@Column(name = "email")
	private String a_userEmail;
	
	@Column(name = "name")
	private String b_userName;
	
	@Column(name = "supplierCode")
	private String c_supplierCode;
	
	@Column(name = "supplierName")
	private String d_supplierName;
	
	@Column(name = "userType")
	private String e_userType;

	public AssignUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignUser(String a_userEmail, String b_userName, String c_supplierCode, String d_supplierName,
			String e_userType) {
		super();
		this.a_userEmail = a_userEmail;
		this.b_userName = b_userName;
		this.c_supplierCode = c_supplierCode;
		this.d_supplierName = d_supplierName;
		this.e_userType = e_userType;
	}

	public String getA_userEmail() {
		return a_userEmail;
	}

	public void setA_userEmail(String a_userEmail) {
		this.a_userEmail = a_userEmail;
	}

	public String getB_userName() {
		return b_userName;
	}

	public void setB_userName(String b_userName) {
		this.b_userName = b_userName;
	}

	public String getC_supplierCode() {
		return c_supplierCode;
	}

	public void setC_supplierCode(String c_supplierCode) {
		this.c_supplierCode = c_supplierCode;
	}

	public String getD_supplierName() {
		return d_supplierName;
	}

	public void setD_supplierName(String d_supplierName) {
		this.d_supplierName = d_supplierName;
	}

	public String getE_userType() {
		return e_userType;
	}

	public void setE_userType(String e_userType) {
		this.e_userType = e_userType;
	}

	@Override
	public String toString() {
		return "AssignUser [a_userEmail=" + a_userEmail + ", b_userName=" + b_userName + ", c_supplierCode="
				+ c_supplierCode + ", d_supplierName=" + d_supplierName + ", e_userType=" + e_userType + "]";
	}


}
