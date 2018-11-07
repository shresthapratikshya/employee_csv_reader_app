/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.helper;

import com.cibt.entity.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class FileHelper {

    public static List<String> readLines(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        List<String> listEmployees = new ArrayList<>();
        if (file != null) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            int len = 0;
            while ((len = reader.read()) > 0) {
                line = reader.readLine();

                listEmployees.add(line);

            }

        }

        return listEmployees;

    }
}
