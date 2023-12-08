package com.sutanu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.AssignUser;

@Repository
public interface AssignUserRepo extends JpaRepository<AssignUser, String> {

}
