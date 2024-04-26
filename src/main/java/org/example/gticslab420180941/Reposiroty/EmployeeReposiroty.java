package org.example.gticslab420180941.Reposiroty;

import org.example.gticslab420180941.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface EmployeeReposiroty extends JpaRepository<Employees, Integer> {
}
