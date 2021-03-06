/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.UI.forms;

import csv.pojo.CSVFile.CSVservices;
import static csv.pojo.CSVFile.CSVservices.searchById;
import static csv.pojo.CSVFile.CSVservices.searchByName;
import csv.pojo.Company.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maher
 */
public class CompanyForm extends javax.swing.JFrame {

    private Object csv;

    /**
     * Creates new form CompanyForm
     */
    public CompanyForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mainID = new csv.UI.controls.JTextBox(15);
        mainName = new csv.UI.controls.JTextBox(15);
        mainPhone = new csv.UI.controls.JTextBox(15);
        mainAddButton = new csv.UI.controls.JButtonBox();
        mainDepartment = new csv.UI.controls.JMyCombo();
        mainJopTitle = new csv.UI.controls.JMyCombo();
        mainUpdateButton = new csv.UI.controls.JButtonBox();
        mainDeleteButton = new csv.UI.controls.JButtonBox();
        mainClearButton = new csv.UI.controls.JButtonBox();
        mainExitButton = new csv.UI.controls.JButtonBox();
        jLabel8 = new javax.swing.JLabel();
        mainNameRadio = new javax.swing.JRadioButton();
        mainIdRadio = new javax.swing.JRadioButton();
        mainSearch = new csv.UI.controls.JTextBox(15);
        mainSearchButton = new csv.UI.controls.JButtonBox();
        mainBirthDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("programming company");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "BirthDate", "Phone", "Department", "Jop Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTable.getTableHeader().setResizingAllowed(false);
        mainTable.getTableHeader().setReorderingAllowed(false);
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("programming company");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Employee Birth Date :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Employee Phone :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Employee Department :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Employee Jop Title :");

        mainID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIDActionPerformed(evt);
            }
        });

        mainName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainNameActionPerformed(evt);
            }
        });

        mainPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPhoneActionPerformed(evt);
            }
        });

        mainAddButton.setText("Add");
        mainAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainAddButtonActionPerformed(evt);
            }
        });

        mainDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainDepartmentActionPerformed(evt);
            }
        });

        mainUpdateButton.setText("Update");
        mainUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainUpdateButtonActionPerformed(evt);
            }
        });

        mainDeleteButton.setText("Delete");
        mainDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainDeleteButtonActionPerformed(evt);
            }
        });

        mainClearButton.setText("Clear");
        mainClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainClearButtonActionPerformed(evt);
            }
        });

        mainExitButton.setBackground(new java.awt.Color(255, 51, 51));
        mainExitButton.setForeground(new java.awt.Color(255, 92, 92));
        mainExitButton.setText("Exit");
        mainExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainExitButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("search By :");

        mainNameRadio.setSelected(true);
        mainNameRadio.setText("Name");
        mainNameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainNameRadioActionPerformed(evt);
            }
        });

        mainIdRadio.setText("ID");

        mainSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSearchActionPerformed(evt);
            }
        });

        mainSearchButton.setText("Search");
        mainSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel7))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(mainAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mainUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mainDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mainClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(mainName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mainID, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(mainBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(8, 8, 8)))))
                            .addComponent(mainExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainJopTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainNameRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainIdRadio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mainNameRadio)
                            .addComponent(mainIdRadio))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mainName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(mainBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mainPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mainDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mainJopTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainIDActionPerformed

    private void mainNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainNameActionPerformed

    private void mainPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPhoneActionPerformed

    private void mainNameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainNameRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainNameRadioActionPerformed

    private void mainSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainSearchActionPerformed

    private void mainAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainAddButtonActionPerformed

        Employee emp = new Employee();
         emp.setEmployeeId(Integer.parseInt(mainID.getText()));
         emp.setEmployeeName(mainName.getText());
         SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
         if (mainName.getText().equals("")||mainPhone.getText().equals("")){
             JOptionPane.showMessageDialog(null, "please enter all employee data");
         }else{
         try{
         String d = f.format(mainBirthDate.getDate());
         
         emp.setEmployeeBirthDate(d);
         emp.setEmployeeMobilePhone(mainPhone.getText());
         emp.setEmployeeDepartment((String) mainDepartment.getSelectedItem());
         emp.setEmployeeJopTitle((String) mainJopTitle.getSelectedItem());
         CSVservices.employeeList.add(emp);
         CSVservices.buildCsv();
         
         updateTable();
         Clear();
         }catch(NullPointerException ex){
             JOptionPane.showMessageDialog(null, "please enter all employee data");
         }
         }
    }//GEN-LAST:event_mainAddButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        radioGroup.add(mainIdRadio);
        radioGroup.add(mainNameRadio);
        String [] dept = {"programming","economy","it","testing","other"};
        mainDepartment.setModel(new DefaultComboBoxModel(dept));
        if (mainDepartment.getSelectedItem().equals("programming")){
            String [] title = {"Java Programmer","Python Programmer","C++ programmer","Kotlin Programmer"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("economy")){
            String [] title = {"financial consultant","Data analyst","statistician"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("it")){
            String [] title = {"Network Architect","IT Analyst","Network Engineer","Cloud Consultant"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("testing")){
            String [] title = {"Quality Assurance ENG","Manual Tester","Automation Tester"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("other")){
            String [] title = {"security","dustman","chauffeur"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }
        updateTable();
        mainID.setEditable(false);
        
        Clear();
    }//GEN-LAST:event_formWindowOpened
private void updateTable(){
            DefaultTableModel model = ( DefaultTableModel)mainTable.getModel();
            model.setRowCount(0);
       for(Employee emp :(CSVservices.employeeList)){
                
    
  Object ob1 = emp.getEmployeeId();
  Object ob2 =emp.getEmployeeName();
  Object ob3 =emp.getEmployeeBirthDate();
  Object ob4 =emp.getEmployeeMobilePhone();
  Object ob5 =emp.getEmployeeDepartment();
  Object ob6 =emp.getEmployeeJopTitle();
  model.addRow(new Object[]{ob1,ob2,ob3,ob4,ob5,ob6});
        }
}
    private void autoGenerateID(){
    if(CSVservices.employeeList.size()<1){
    mainID.setText("1");
        }else{
         int empId = CSVservices.employeeList.get((CSVservices.employeeList.size())-1).getEmployeeId();
        mainID.setText(String.valueOf(empId+1));
        }
}
private void Clear(){
    mainDeleteButton.setEnabled(false);
        mainUpdateButton.setEnabled(false);
        mainAddButton.setEnabled(true);
    mainName.setText("");
    mainBirthDate.setDate(null);
    mainPhone.setText("");
    mainDepartment.setSelectedItem("programming");
    autoGenerateID();
}
    private void mainExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainExitButtonActionPerformed
      System.exit(0);
    }//GEN-LAST:event_mainExitButtonActionPerformed

    private void mainDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainDepartmentActionPerformed
   if (mainDepartment.getSelectedItem().equals("programming")){
            String [] title = {"Java Programmer","Python Programmer","C++ programmer","Kotlin Programmer"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("economy")){
            String [] title = {"financial consultant","Data analyst","statistician"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("it")){
            String [] title = {"Network Architect","IT Analyst","Network Engineer","Cloud Consultant"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("testing")){
            String [] title = {"Quality Assurance ENG","Manual Tester","Automation Tester"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }else if(mainDepartment.getSelectedItem().equals("other")){
            String [] title = {"security","dustman","chauffeur"};
            mainJopTitle.setModel(new DefaultComboBoxModel(title));
        }    }//GEN-LAST:event_mainDepartmentActionPerformed

    private void mainClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainClearButtonActionPerformed
        Clear();
        updateTable();
    }//GEN-LAST:event_mainClearButtonActionPerformed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
        try {
            mainAddButton.setEnabled(false);
            mainDeleteButton.setEnabled(true);
            mainUpdateButton.setEnabled(true);
            int selected = mainTable.getSelectedRow();
            Employee emp = CSVservices.employeeList.get(selected);
            mainID.setText(String.valueOf(emp.getEmployeeId()));
            mainName.setText(emp.getEmployeeName());
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            mainBirthDate.setDate(f.parse(emp.getEmployeeBirthDate()));
            mainPhone.setText(emp.getEmployeeMobilePhone());
            mainDepartment.setSelectedItem(emp.getEmployeeDepartment());
            mainJopTitle.setSelectedItem(emp.getEmployeeJopTitle());
        } catch (ParseException ex) {
            Logger.getLogger(CompanyForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mainTableMouseClicked

    private void mainDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainDeleteButtonActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        CSVservices.removeById(Integer.parseInt(mainID.getText()));
        updateTable();
        Clear();
        } 
    }//GEN-LAST:event_mainDeleteButtonActionPerformed

    private void mainSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSearchButtonActionPerformed
       Employee emp = new Employee();
       
        if(mainIdRadio.isSelected()){
            try{
           emp = searchById(Integer.parseInt(mainSearch.getText()));
           }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "please enter valid employee ID");
                mainSearch.setText("");
                updateTable();
                return;
            }
        }
        if(mainNameRadio.isSelected()){
            emp = searchByName(mainSearch.getText());
        }
       
            DefaultTableModel model = ( DefaultTableModel)mainTable.getModel();
            model.setRowCount(0);
            
            
            try{
            
            Object ob1 = emp.getEmployeeId();
            Object ob2 =emp.getEmployeeName();
            Object ob3 =emp.getEmployeeBirthDate();
            Object ob4 =emp.getEmployeeMobilePhone();
            Object ob5 =emp.getEmployeeDepartment();
            Object ob6 =emp.getEmployeeJopTitle();
            
            model.addRow(new Object[]{ob1,ob2,ob3,ob4,ob5,ob6});
            
            }catch(NullPointerException ex){
                 JOptionPane.showMessageDialog(null, "employee not found");
                 updateTable();
            }
        
           mainSearch.setText("");
       
     
        
    }//GEN-LAST:event_mainSearchButtonActionPerformed

    private void mainUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainUpdateButtonActionPerformed
        int id = Integer.parseInt(mainID.getText());
        String name = mainName.getText();
         SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String date = f.format(mainBirthDate.getDate());
        String phone = mainPhone.getText();
        String dept = (String) mainDepartment.getSelectedItem();
        String title = (String) mainJopTitle.getSelectedItem();
        
        try {
            CSVservices.update(id, name, date, phone, dept, title);
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            Clear();
            updateTable();
        }
         
    }//GEN-LAST:event_mainUpdateButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        updateTable();
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompanyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private csv.UI.controls.JButtonBox mainAddButton;
    private com.toedter.calendar.JDateChooser mainBirthDate;
    private csv.UI.controls.JButtonBox mainClearButton;
    private csv.UI.controls.JButtonBox mainDeleteButton;
    private csv.UI.controls.JMyCombo mainDepartment;
    private csv.UI.controls.JButtonBox mainExitButton;
    private javax.swing.JTextField mainID;
    private javax.swing.JRadioButton mainIdRadio;
    private csv.UI.controls.JMyCombo mainJopTitle;
    private javax.swing.JTextField mainName;
    private javax.swing.JRadioButton mainNameRadio;
    private javax.swing.JTextField mainPhone;
    private javax.swing.JTextField mainSearch;
    private csv.UI.controls.JButtonBox mainSearchButton;
    private javax.swing.JTable mainTable;
    private csv.UI.controls.JButtonBox mainUpdateButton;
    private javax.swing.ButtonGroup radioGroup;
    // End of variables declaration//GEN-END:variables
}
