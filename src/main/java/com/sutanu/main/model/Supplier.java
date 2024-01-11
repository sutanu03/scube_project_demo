package com.sutanu.main.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * 
 * POJO class for supplier
 * 
 * */
@Entity
@Table(name = "supplier")
public class Supplier {
	
	@Id
	@Column(name = "supp_code")
	private String a_supplierCode;
	
	
	@Column(name = "first_name")
	private String b_supplierName;
	
	
	@Column(name = "address")
	private String c_address;
	
	
	@Column(name = "contact_number")
	private String d_contact_no;
	
	
	@Column(name = "contact_person")
	private String e_contact_person;
	
	
	@Column(name = "designation")
	private String f_designation;
	
	
	@Column(name = "mobile_no")
	private String g_mobile_no;
	
	@Column(name = "gst_number")
	private String h_gst_number;
	
	@OneToMany(mappedBy ="supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Quotation> quotation;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(String a_supplierCode, String b_supplierName, String c_address, String d_contact_no,
			String e_contact_person, String f_designation, String g_mobile_no, String h_gst_number,
			Set<Quotation> quotation) {
		super();
		this.a_supplierCode = a_supplierCode;
		this.b_supplierName = b_supplierName;
		this.c_address = c_address;
		this.d_contact_no = d_contact_no;
		this.e_contact_person = e_contact_person;
		this.f_designation = f_designation;
		this.g_mobile_no = g_mobile_no;
		this.h_gst_number = h_gst_number;
		this.quotation = quotation;
	}

	public String getA_supplierCode() {
		return a_supplierCode;
	}

	public void setA_supplierCode(String a_supplierCode) {
		this.a_supplierCode = a_supplierCode;
	}

	public String getB_supplierName() {
		return b_supplierName;
	}

	public void setB_supplierName(String b_supplierName) {
		this.b_supplierName = b_supplierName;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public String getD_contact_no() {
		return d_contact_no;
	}

	public void setD_contact_no(String d_contact_no) {
		this.d_contact_no = d_contact_no;
	}

	public String getE_contact_person() {
		return e_contact_person;
	}

	public void setE_contact_person(String e_contact_person) {
		this.e_contact_person = e_contact_person;
	}

	public String getF_designation() {
		return f_designation;
	}

	public void setF_designation(String f_designation) {
		this.f_designation = f_designation;
	}

	public String getG_mobile_no() {
		return g_mobile_no;
	}

	public void setG_mobile_no(String g_mobile_no) {
		this.g_mobile_no = g_mobile_no;
	}

	public String getH_gst_number() {
		return h_gst_number;
	}

	public void setH_gst_number(String h_gst_number) {
		this.h_gst_number = h_gst_number;
	}

	public Set<Quotation> getQuotation() {
		return quotation;
	}

	public void setQuotation(Set<Quotation> quotation) {
		this.quotation = quotation;
	}

	@Override
	public String toString() {
		return "Supplier [a_supplierCode=" + a_supplierCode + ", b_supplierName=" + b_supplierName + ", c_address="
				+ c_address + ", d_contact_no=" + d_contact_no + ", e_contact_person=" + e_contact_person
				+ ", f_designation=" + f_designation + ", g_mobile_no=" + g_mobile_no + ", h_gst_number=" + h_gst_number
				+ ", quotation=" + quotation + "]";
	}

			
}
