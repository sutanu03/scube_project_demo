package com.sutanu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, String>{

//	@Query("from Supplier where f_supplier_email_id = ?1 AND h_supplier_password = ?2")
//	List<Supplier> findEmailAndPass(String f_supplier_email_id, String h_supplier_password);
	
}
