package com.sutanu.main.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * 
 * POJO class for quotation
 * 
 * */
@Entity
@Table(name = "quotation")
public class Quotation {

	@Id
	@Column(name = "quotation_number")
	private String a_quotation_number;

	@Column(name = "date")
	private String date;

	@ManyToOne
    @JoinColumn(name="supplierCode", nullable=false)
	private Supplier supplier;

	@Column(name = "suppName")
	private String suppName;

	@Column(name = "submission_date")
	private String submission_dateo;
	
	@OneToMany(mappedBy ="quotation", cascade = CascadeType.ALL)
    private Set<QuotationDetail> quotationsDetail;

	public Quotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quotation(String a_quotation_number, String date, Supplier supplier, String suppName,
			String submission_dateo, Set<QuotationDetail> quotationsDetail) {
		super();
		this.a_quotation_number = a_quotation_number;
		this.date = date;
		this.supplier = supplier;
		this.suppName = suppName;
		this.submission_dateo = submission_dateo;
		this.quotationsDetail = quotationsDetail;
	}

	public String getA_quotation_number() {
		return a_quotation_number;
	}

	public void setA_quotation_number(String a_quotation_number) {
		this.a_quotation_number = a_quotation_number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getSubmission_dateo() {
		return submission_dateo;
	}

	public void setSubmission_dateo(String submission_dateo) {
		this.submission_dateo = submission_dateo;
	}

	public Set<QuotationDetail> getQuotationsDetail() {
		return quotationsDetail;
	}

	public void setQuotationsDetail(Set<QuotationDetail> quotationsDetail) {
		this.quotationsDetail = quotationsDetail;
	}

	@Override
	public String toString() {
		return "Quotation [a_quotation_number=" + a_quotation_number + ", date=" + date + ", supplier=" + supplier
				+ ", suppName=" + suppName + ", submission_dateo=" + submission_dateo + ", quotationsDetail="
				+ quotationsDetail + "]";
	}

	
}
