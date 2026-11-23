package com.austin.employ_manager.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.austin.employ_manager.model.Employee;
import java.util.Optional;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
