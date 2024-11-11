package com.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	private BankDAO bd;

	public String postBankDetails(List<Bank> list) {
		return bd.postBankDetails(list);
	}

	public List<Bank> getAllBankDetails() {
		return bd.getAllBankDetails();
	}
}
