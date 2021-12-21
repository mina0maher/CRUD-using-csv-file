/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.pojo.CSVFile;

import csv.pojo.Company.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.filechooser.FileSystemView;
/**
 *
 * @author maher
 */
public class CSVservices {
    public static LinkedList <Employee> employeeList = new LinkedList<>();
    /////////////////////////////////////

 private final File home = FileSystemView.getFileSystemView().getHomeDirectory(); 
private static String desktopPath ;

    public CSVservices() {
        desktopPath = home.getAbsolutePath();
        desktopPath += "\\Document.csv\\";
    }

///////////////////////////////
    public LinkedList<Employee> csvReader() throws Exception{
        BufferedReader br;
        String line ;
        try {
          br = new BufferedReader(new FileReader(new File(desktopPath ))); 
          while((line=br.readLine())!=null){
              fullEmployeeObject(line);
          }
        }catch(Exception e ){
        }
        return employeeList;
    }
    
    
    public void fullEmployeeObject(String line) throws Exception {
        String [] strArray = line.split(",");
        Employee employee = new Employee();
        employee.setEmployeeId(Integer.parseInt(strArray[0]));
        employee.setEmployeeName(strArray[1]);
        employee.setEmployeeBirthDate(strArray[2]);
        employee.setEmployeeMobilePhone(strArray[3]);
        employee.setEmployeeDepartment(strArray[4]);
        employee.setEmployeeJopTitle(strArray[5]);
        employeeList.add(employee);
    }
    
    public static Employee searchById(int id ){
        for(Employee emp:employeeList ){
            if (emp.getEmployeeId()== id)
               return emp; 
        }
       return null; 
    }
    public static Employee searchByName(String name ){
        for(Employee emp:employeeList ){
            if (name.equals(emp.getEmployeeName()))
               return emp; 
        }
       return null; 
    }
    
    
    public static void removeById(int id){
        employeeList.remove( searchById(id));
        buildCsv();
    }
    public static void update (int id,String name,String date,String mobile,String department,String jop)throws Exception{
        Employee emp = searchById(id);
        int counter = 0 ; 
        for(Employee empl:employeeList ){
            
            if (empl.getEmployeeId()== emp.getEmployeeId()){
               break; 
            }
            counter++;
        }
      
        emp.setEmployeeName(name);
        emp.setEmployeeBirthDate(date);
        emp.setEmployeeMobilePhone(mobile);
        emp.setEmployeeDepartment(department);
        emp.setEmployeeJopTitle(jop);
        employeeList.set(counter, emp);
        buildCsv();
    }
    public static void buildCsv(){
        try{
        PrintWriter pw  = new PrintWriter(new File(desktopPath));
        StringBuilder sb = new StringBuilder();
        for(Employee emp:employeeList ){
            sb.append(emp.getEmployeeId());
            sb.append(",");
            sb.append(emp.getEmployeeName());
            sb.append(",");
            sb.append(emp.getEmployeeBirthDate());
            sb.append(",");
            sb.append(emp.getEmployeeMobilePhone());
            sb.append(",");
            sb.append(emp.getEmployeeDepartment());
            sb.append(",");
            sb.append(emp.getEmployeeJopTitle());
            sb.append("\r\n");
             
        }
        pw.append(sb);
        pw.close();
        }catch(FileNotFoundException e){
          e.printStackTrace();
        }
  }
}
