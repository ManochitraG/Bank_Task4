package com.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@Autowired
	private BankService bs;
	
	@PostMapping(value="/postBankDetails")
	public String postBankDetails(@RequestBody List<Bank> list) {		
		return bs.postBankDetails(list);
	}
	
	@GetMapping("/getAllBankDetails")
	public List<Bank> getAllBankDetails() {
		return bs.getAllBankDetails();
	}
	
}
