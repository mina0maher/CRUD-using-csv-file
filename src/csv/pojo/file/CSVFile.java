/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.pojo.file;

import csv.UI.forms.CompanyForm;
import csv.UI.forms.LoginFrame;
import csv.pojo.CSVFile.CSVservices;
import csv.pojo.Company.Employee;

/**
 *
 * @author maher
 */
public class CSVFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       CSVservices reader = new CSVservices();
       for(Employee employee :reader.csvReader());
LoginFrame f = new LoginFrame ();
f.pack();
f.setLocationRelativeTo(null);
f.setVisible(true);
    }
    
}
