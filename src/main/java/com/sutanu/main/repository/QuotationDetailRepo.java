package com.sutanu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.QuotationDetail;

@Repository
public interface QuotationDetailRepo extends JpaRepository<QuotationDetail, Long>{

}
