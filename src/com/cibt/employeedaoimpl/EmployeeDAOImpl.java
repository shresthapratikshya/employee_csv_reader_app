/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.employeedaoimpl;

import com.cibt.employeedao.EmployeeDAO;
import com.cibt.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private List<Employee> listEmployee = new ArrayList<>();

    @Override
    public void insert(Employee employee) {
        listEmployee.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return listEmployee;
    }

    @Override
    public Employee getById(int id) {

        for (Employee e : listEmployee) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        for (Employee e : listEmployee) {
            if (e.getId() == id) {
                return listEmployee.remove(e);
            }
        }
        return false;
    }

}
