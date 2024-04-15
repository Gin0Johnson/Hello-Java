package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pcontroller {
	@Autowired
	private Prepo repo;
	 @PostMapping("/api/bank")
	    public String addBank(@RequestBody Bank bank) {
	        repo.save(bank);
	        return "Bank added successfully";
	    }

	    // update
	    @PutMapping("/api/bank")
	    public String updateBank(@RequestBody Bank bank) {
        repo.save(bank);
	        return "Bank updated successfully";
	    }

	    

	    // delete by id
	    @DeleteMapping("/api/bank/{id}")
	    public String deleteBankById(@PathVariable int id) {
	        repo.deleteById(id);
	        return "Bank deleted successfully";
	    }

	    // get by id
	    @GetMapping("/api/bank/{id}")
	    public Bank getBankById(@PathVariable int id) {
	        return repo.findById(id).orElse(null);
	    }

	    // get all
	    @GetMapping("/bank")
	    public List<Bank> getAllBanks() {
	        return repo.findAll();
	    }
	
}
