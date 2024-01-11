package com.sutanu.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "quotation_detail")
public class QuotationDetail {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quote_details_id;
	
	@ManyToOne
    @JoinColumn(name="quotation_number", nullable=false)
	private Quotation quotation;
	
	@ManyToOne
    @JoinColumn(name="product_code", nullable=false)
	private Product product;

	@Column(name = "description")
	private String description;

	@Column(name = "rate")
	private String rate;

	@Column(name = "qnty")
	private String qnty;

	@Column(name = "misc")
	private String misc;

	@Column(name = "price")
	private String price;

	public QuotationDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuotationDetail(Long quote_details_id, Quotation quotation, Product product, String description, String rate,
			String qnty, String misc, String price) {
		super();
		this.quote_details_id = quote_details_id;
		this.quotation = quotation;
		this.product = product;
		this.description = description;
		this.rate = rate;
		this.qnty = qnty;
		this.misc = misc;
		this.price = price;
	}

	public Long getQuote_details_id() {
		return quote_details_id;
	}

	public void setQuote_details_id(Long quote_details_id) {
		this.quote_details_id = quote_details_id;
	}

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getQnty() {
		return qnty;
	}

	public void setQnty(String qnty) {
		this.qnty = qnty;
	}

	public String getMisc() {
		return misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "QuotationDetail [quote_details_id=" + quote_details_id + ", quotation=" + quotation + ", product="
				+ product + ", description=" + description + ", rate=" + rate + ", qnty=" + qnty + ", misc=" + misc
				+ ", price=" + price + "]";
	}
	
	
}
