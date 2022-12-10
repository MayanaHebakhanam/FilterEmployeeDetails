package com.example.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FilterServiceImp implements FilterService {

	@Autowired
	FilterRepository repo;

	public Iterable<FilterEmployee> getByPosition(String position) {
		if (position != null) {
			return repo.getByPosition(position);
		} else
			return repo.findAll();
	}

	public FilterEmployee save(FilterEmployee emp) {
		return repo.save(emp);
	}

	public Iterable<FilterEmployee> getAll() {
		return repo.findAll();

	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public FilterEmployee update(FilterEmployee e) {
		return repo.save(e);
	}

	public List<FilterEmployee> listAll(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<FilterEmployee> pagedResult = repo.findAll(pageable);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {
			return new ArrayList<FilterEmployee>();
		}
	}

	public Iterable<FilterEmployee> getByDepartment(String department) {
		if (department != null) {
			return repo.getByDepartment(department);
		} else
			return repo.findAll();
	}
}