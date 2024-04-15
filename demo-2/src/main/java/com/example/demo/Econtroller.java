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
public class Econtroller {
	   @Autowired
	    private Erepo repoo;

	    // insert
	   @PostMapping("/api/people")
	   public String addPeople(@RequestBody People people) {
	       repoo.save(people);
	        return "People added successfully";
	    }

	    // update
	    @PutMapping("/api/people")
	    public String updatePeople(@RequestBody People people) {
	    	 repoo.save(people);
	        return "People updated successfully";
	    }

	    

	    // delete by id
	    @DeleteMapping("/api/people")
	    public String deletePeopleById(@PathVariable int id) {
	    	 repoo.deleteById(id);
	        return "People deleted successfully";
	    }

	    // get by id
	    @GetMapping("/api/people")
	    public People getPeopleById(@PathVariable int id) {
	        return  repoo.findById(id).orElse(null);
	    }

	    // get all
	    @GetMapping("/people")
	    public List<People> getAllPeople() {
	        return  repoo.findAll();
	    }

}
