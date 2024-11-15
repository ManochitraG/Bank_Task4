package com.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDAO {
	@Autowired
	private BankRepository br;

	public String postBankDetails(List<Bank> list) {
		br.saveAll(list);
		return "Posted!";
	}

	public List<Bank> getAllBankDetails() {
		return br.findAll();
	}

	
}
