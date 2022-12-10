package com.example.filter;

import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface FilterRepository extends JpaRepository<FilterEmployee, Integer> {

	@Query("SELECT e FROM FilterEmployee e WHERE e.position LIKE %?1%")
	Iterable<FilterEmployee> getByPosition(String position);

	@Query("SELECT e FROM FilterEmployee e WHERE e.department LIKE %?1%")
	Iterable<FilterEmployee> getByDepartment(String department);

	@Query("SELECT e FROM FilterEmployee e WHERE "
			+ "CONCAT(e.id,e.department,e.position,e.firstName,e.lastName,e.email,e.contactNumber,e.salary )"
			+ "LIKE %?1%")
	public Page<FilterEmployee> getByPagination(int pageSize, Pageable pageable);

}
