/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.employeedao;

import com.cibt.entity.Employee;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface EmployeeDAO {

    void insert(Employee employee);

    List<Employee> getAll();

    Employee getById(int id);

    boolean delete(int id);

}
