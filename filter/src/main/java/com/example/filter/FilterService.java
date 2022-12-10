package com.example.filter;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface FilterService {

	FilterEmployee save(FilterEmployee emp);

	Iterable<FilterEmployee> getAll();

	void deleteById(Integer id);

	FilterEmployee update(FilterEmployee e);

	Iterable<FilterEmployee> getByDepartment(String department);

	Iterable<FilterEmployee> getByPosition(String position);

	public List<FilterEmployee> listAll(int parameter, int pageSize);

}
