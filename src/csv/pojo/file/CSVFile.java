/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.pojo.file;

import csv.UI.forms.LoginFrame;
import csv.pojo.CSVFile.CSVservices;
import csv.pojo.Company.Employee;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

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
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\maher\\Documents\\NetBeansProjects\\CSV file\\src\\csv\\UI\\team.png");
f.setIconImage(icon);
f.setIconImage(new ImageIcon("C:\\Users\\maher\\Documents\\NetBeansProjects\\CSV file\\src\\csv\\UI\\team.png").getImage());
f.setVisible(true);
    }
    
}
