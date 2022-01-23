package com.example.SearchPincode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SearchPincode.domain.Pincode;
import com.example.SearchPincode.repository.PincodeRepository;

@Service
public class PincodeService {

	@Autowired
	private PincodeRepository repo;
	public List<Pincode> listAll() {
		return repo.findAll();
	}
	
	public Pincode get(long pin) {
		return repo.findById(pin).get();
	}
	
}
