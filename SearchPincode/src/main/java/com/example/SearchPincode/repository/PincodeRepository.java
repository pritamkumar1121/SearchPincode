package com.example.SearchPincode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SearchPincode.domain.Pincode;

@Repository
public interface PincodeRepository extends JpaRepository<Pincode, Long> {

}
