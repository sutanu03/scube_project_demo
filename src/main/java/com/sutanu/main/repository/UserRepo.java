package com.sutanu.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

	//for checking login details
	@Query("from User where a_email = ?1 AND g_password1 = ?2")
	List<User> findEmailAndPass(String a_email, String g_password1);

}
