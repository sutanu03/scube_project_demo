package com.sutanu.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name = "prod_code", nullable = false)
	private String a_prod_code;
	
	
	@Column(name = "prod_name")
	private String b_prod_name;
	
	@Column(name = "description")
	private String c_description;
	
	@Column(name = "unit_price")
	private String d_unit_price;
	
	@Column(name = "category")
	private String e_category;
	
	@Column(name = "designation")
	private String f_designation;
	
	@Column(name = "amount")
	private String g_amount;
	
	@Column(name = "gst_number")
	private String h_gst_number;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String a_prod_code, String b_prod_name, String c_description, String d_unit_price, String e_category,
			String f_designation, String g_amount, String h_gst_number) {
		super();
		this.a_prod_code = a_prod_code;
		this.b_prod_name = b_prod_name;
		this.c_description = c_description;
		this.d_unit_price = d_unit_price;
		this.e_category = e_category;
		this.f_designation = f_designation;
		this.g_amount = g_amount;
		this.h_gst_number = h_gst_number;
	}

	public String getA_prod_code() {
		return a_prod_code;
	}

	public void setA_prod_code(String a_prod_code) {
		this.a_prod_code = a_prod_code;
	}

	public String getB_prod_name() {
		return b_prod_name;
	}

	public void setB_prod_name(String b_prod_name) {
		this.b_prod_name = b_prod_name;
	}

	public String getC_description() {
		return c_description;
	}

	public void setC_description(String c_description) {
		this.c_description = c_description;
	}

	public String getD_unit_price() {
		return d_unit_price;
	}

	public void setD_unit_price(String d_unit_price) {
		this.d_unit_price = d_unit_price;
	}

	public String getE_category() {
		return e_category;
	}

	public void setE_category(String e_category) {
		this.e_category = e_category;
	}

	public String getF_designation() {
		return f_designation;
	}

	public void setF_designation(String f_designation) {
		this.f_designation = f_designation;
	}

	public String getG_amount() {
		return g_amount;
	}

	public void setG_amount(String g_amount) {
		this.g_amount = g_amount;
	}

	public String getH_gst_number() {
		return h_gst_number;
	}

	public void setH_gst_number(String h_gst_number) {
		this.h_gst_number = h_gst_number;
	}

	@Override
	public String toString() {
		return "Product [a_prod_code=" + a_prod_code + ", b_prod_name=" + b_prod_name + ", c_description="
				+ c_description + ", d_unit_price=" + d_unit_price + ", e_category=" + e_category + ", f_designation="
				+ f_designation + ", g_amount=" + g_amount + ", h_gst_number=" + h_gst_number + "]";
	}
	
	
	
}
