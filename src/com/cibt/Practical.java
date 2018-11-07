/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt;

import com.cibt.employeedao.EmployeeDAO;
import com.cibt.employeedaoimpl.EmployeeDAOImpl;
import com.cibt.entity.Employee;
import com.cibt.helper.FileHelper;
import com.cibt.utils.EmployeeDataLoader;
import com.cibt.utils.Utilities;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Practical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        System.out.println(Utilities.power(2, 5));
//        System.out.println(Utilities.sumRange(10));
//        System.out.println(Utilities.multiplyRange(2, 4));
//        Utilities.multiplication(2);
//        System.out.println(Utilities.arraySum());
//        int[] array=Utilities.sort();
//        for(int n:array){
//            System.out.print(n+" ");
//        }
//        
//        Utilities.vowelConsonant("This is a sample line.");

//        Employee employee= Utilities.splitData("1,Ramesh, Smith, Kathmandu,"
//                + " 9841533698, ramesh@gmail.com");
//        System.out.println(employee.saveFormat());
//        String path="E:\\employees.txt";
//        try {
//            Utilities.saveDataIntoFile(path, employee.saveFormat());
//        } catch (IOException ex) {
//            Logger.getLogger(Practical.class.getName()).log(Level.SEVERE, null, ex);
//        }
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        String path = "E:\\Employee.csv";
        new EmployeeDataLoader(employeeDAO).load(path);

        List<Employee> list=employeeDAO.getAll();
        
        for(Employee e:list){
            System.out.println(e);
        }
        
    
    }

}
