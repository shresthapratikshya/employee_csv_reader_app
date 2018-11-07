/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.utils;

import com.cibt.entity.Employee;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Utilities {
    
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * (power(base, exp - 1));
        }
        
    }
    
    public static int sumRange(int n) {
        int total = 0;
        if (n == 1) {
            return 1;
        } else {
            return sumRange(n - 1) + n;
        }
    }
    
    public static int multiplyRange(int i, int multiplicationNumber) {
        if (i == 0) {
            return 0;
        }
        
        if (i == 1) {
            return multiplicationNumber;
        } else {
            
            return i * (multiplyRange(i - 1, multiplicationNumber));
        }
    }
    
    public static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " " + i + " = " + n * i);
        }
    }
    
    public static int arraySum() {
        int[] sum = {5, 3, 8, 10, 15, 20};
        int total = 0;
        
        for (int i = 0; i < sum.length; i++) {
            total += sum[i];
            
        }
        return total;
    }
    
    public static int[] sort() {
        
        int[] sum = {5, 3, 8, 10, 15, 20};
        
        int temp = 0;
        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] > sum[i + 1]) {
                temp = sum[i];
                sum[i] = sum[i + 1];
                sum[i + 1] = temp;
            }
        }
        return sum;
    }
    
    public static void vowelConsonant(String statement) {
        int vCount = 0;
        int cCount = 0;
        
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == 'a' || statement.charAt(i) == 'e'
                    || statement.charAt(i) == 'i' | statement.charAt(i) == 'o'
                    || statement.charAt(i) == 'u') {
                vCount++;
            } else {
                cCount++;
            }
            
        }
        System.out.println("The number of vowel is " + vCount + " The number of consonant is" + cCount);
    }
    
    public static void saveDataIntoFile(String path, String data) throws
            FileNotFoundException, IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        if (file != null) {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes());
            
        }
        
        fileOutputStream.close();
        
    }
    
    public static Employee splitData(String data) {
        String[] splits = data.split(",");
//        Employee employee = new Employee();
//        employee.setId(Integer.parseInt(splits[0]));
//        employee.setFirstName(splits[1]);
//        return employee;
        return new Employee(Integer.parseInt(splits[0]), splits[1], splits[2],
                splits[3], splits[4], splits[5]);
        
    }
    
    
}
