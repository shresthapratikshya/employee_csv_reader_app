/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.utils;

import com.cibt.employeedao.EmployeeDAO;
import com.cibt.entity.Employee;
import com.cibt.helper.FileHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EmployeeDataLoader {

    private EmployeeDAO employeeDAO;

    public EmployeeDataLoader(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public  void load(String path) throws IOException,NumberFormatException {
        List<String> listInfo = FileHelper.readLines(path);
        for (String s : listInfo) {
            String[] tokens = s.split(",");
            if (tokens.length >= 5) {
                Employee employee=new Employee(Integer.parseInt(tokens[1]),
                        tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                employeeDAO.insert(employee);

            }
        }
    }

}
