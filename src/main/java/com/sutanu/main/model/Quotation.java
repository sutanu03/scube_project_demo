package com.sutanu.main.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
 * 
 * POJO class for quotation
 * 
 * */
@Entity
public class Quotation {

	@Id
	@Column(name = "quotation_number", nullable = false)
	private String a_quotation_number;

	@Column(name = "date")
	private String b_date;

	@Column(name = "supplierCode")
	private String c_supplierCode;

	@Column(name = "suppName")
	private String d_suppName;

	@Column(name = "submission_date")
	private String e_submission_dateo;

	@Column(name = "productCode")
	private String f_productCode;

	@Column(name = "description")
	private String g_description;

	@Column(name = "rate")
	private String h_rate;

	@Column(name = "qnty")
	private String i_qnty;

	@Column(name = "misc")
	private String j_misc;

	@Column(name = "price")
	private String k_price;

	public Quotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quotation(String a_quotation_number, String b_date, String c_supplierCode, String d_suppName,
			String e_submission_dateo, String f_productCode, String g_description, String h_rate, String i_qnty,
			String j_misc, String k_price) {
		super();
		this.a_quotation_number = a_quotation_number;
		this.b_date = b_date;
		this.c_supplierCode = c_supplierCode;
		this.d_suppName = d_suppName;
		this.e_submission_dateo = e_submission_dateo;
		this.f_productCode = f_productCode;
		this.g_description = g_description;
		this.h_rate = h_rate;
		this.i_qnty = i_qnty;
		this.j_misc = j_misc;
		this.k_price = k_price;
	}

	public String getA_quotation_number() {
		return a_quotation_number;
	}

	public void setA_quotation_number(String a_quotation_number) {
		this.a_quotation_number = a_quotation_number;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getC_supplierCode() {
		return c_supplierCode;
	}

	public void setC_supplierCode(String c_supplierCode) {
		this.c_supplierCode = c_supplierCode;
	}

	public String getD_suppName() {
		return d_suppName;
	}

	public void setD_suppName(String d_suppName) {
		this.d_suppName = d_suppName;
	}

	public String getE_submission_dateo() {
		return e_submission_dateo;
	}

	public void setE_submission_dateo(String e_submission_dateo) {
		this.e_submission_dateo = e_submission_dateo;
	}

	public String getF_productCode() {
		return f_productCode;
	}

	public void setF_productCode(String f_productCode) {
		this.f_productCode = f_productCode;
	}

	public String getG_description() {
		return g_description;
	}

	public void setG_description(String g_description) {
		this.g_description = g_description;
	}

	public String getH_rate() {
		return h_rate;
	}

	public void setH_rate(String h_rate) {
		this.h_rate = h_rate;
	}

	public String getI_qnty() {
		return i_qnty;
	}

	public void setI_qnty(String i_qnty) {
		this.i_qnty = i_qnty;
	}

	public String getJ_misc() {
		return j_misc;
	}

	public void setJ_misc(String j_misc) {
		this.j_misc = j_misc;
	}

	public String getK_price() {
		return k_price;
	}

	public void setK_price(String k_price) {
		this.k_price = k_price;
	}

	@Override
	public String toString() {
		return "Quotation [a_quotation_number=" + a_quotation_number + ", b_date=" + b_date + ", c_supplierCode="
				+ c_supplierCode + ", d_suppName=" + d_suppName + ", e_submission_dateo=" + e_submission_dateo
				+ ", f_productCode=" + f_productCode + ", g_description=" + g_description + ", h_rate=" + h_rate
				+ ", i_qnty=" + i_qnty + ", j_misc=" + j_misc + ", k_price=" + k_price + "]";
	}

	
	
}
