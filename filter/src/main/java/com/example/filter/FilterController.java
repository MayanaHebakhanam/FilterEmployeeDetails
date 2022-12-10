package com.example.filter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/employee")
public class FilterController {

	@Autowired
	FilterService service;

	@PostMapping("/create")
	FilterEmployee create(@RequestBody FilterEmployee emp) {
		return service.save(emp);
	}

	@GetMapping("/read")
	Iterable<FilterEmployee> getAll() {
		return service.getAll();
	}

	@DeleteMapping("/del/{id}")
	void delete(@PathVariable Integer id) {
		service.deleteById(id);

	}

	@PutMapping("/update")
	FilterEmployee update(@RequestBody FilterEmployee e) {
		return service.save(e);
	}

	
	@GetMapping("/department")
	public List<FilterEmployee> getByDepartment(@RequestBody FilterEmployee e){
		String department=e.getDepartment();
		return (List<FilterEmployee>) service.getByDepartment(department);
	}
	
	@GetMapping("/position")
	public List<FilterEmployee> getByPosition(@RequestBody FilterEmployee e){
		String position=e.getPosition();
		return (List<FilterEmployee>) service.getByPosition(position);
	}
	
	@GetMapping("/pagination")
	public List<FilterEmployee> listByPage(@RequestBody ObjectNode on){
		int pageNo=on.get("pageNo").asInt();
		int pageSize=on.get("pageSize").asInt();
		return service.listAll(pageNo, pageSize);
	}
	

}