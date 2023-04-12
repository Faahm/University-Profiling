// Java jForm in university profiling, employees class.
// GUI by Fatima Mahinay, Source Code by Alexandra Lanorias
// October 21, 2021

package university_profiling;

import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.io.IOException;

public class employees extends javax.swing.JFrame {
    boolean goodEmail = false;
    boolean goodBirthdayFormat = false;
    EmployeeProfiling e = new EmployeeProfiling();

    public employees() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        employeeMI = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        employeeFirstName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        employeeGender = new javax.swing.JComboBox();
        employeeBirthdate = new javax.swing.JTextField();
        employeeAddress = new javax.swing.JTextField();
        employeeLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeIdNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        employeeMobileNumber = new javax.swing.JTextField();
        employeeEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        occupation = new javax.swing.JTextField();
        employeeSaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Gender:");

        jLabel5.setText("Birthdate:");

        jLabel4.setText("Address:");

        jLabel14.setForeground(new java.awt.Color(-8355712,true));
        jLabel14.setText("e.g. December 7, 1989");

        jLabel13.setText("M.I.:");

        jLabel12.setText("First Name:");

        employeeGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Non-binary" }));

        employeeBirthdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeBirthdateKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Employee Profiling");

        jLabel2.setText("ID Number:");

        jLabel3.setText("Last Name:");

        jLabel15.setForeground(new java.awt.Color(-8355712,true));
        jLabel15.setText("e.g. gojosatoru@gmail.com");

        jLabel7.setText("Email:");

        jLabel8.setText("Mobile Number:");

        employeeEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeEmailKeyReleased(evt);
            }
        });

        jLabel9.setText("Occupation:");

        employeeSaveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeeSaveButton.setForeground(new java.awt.Color(0, 102, 51));
        employeeSaveButton.setText("Save");
        employeeSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(348, 348, 348))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(occupation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeMobileNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeIdNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeBirthdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(employeeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeMI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))
                                .addGap(261, 261, 261))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeSaveButton)
                        .addContainerGap(859, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(employeeMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(employeeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(employeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(employeeBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(employeeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(employeeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(employeeMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(employeeSaveButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void employeeSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSaveButtonActionPerformed
    if(employeeIdNumber.getText().length() == 0 || employeeLastName.getText().length() == 0 || employeeFirstName.getText().length() == 0 || employeeMI.getText().length() == 0  || employeeAddress.getText().length() == 0 || employeeBirthdate.getText().length() == 0 || employeeEmail.getText().length() == 0 || employeeMobileNumber.getText().length() == 0 || occupation.getText().length() == 0)
        alertMessage("Incomplete Information!", "Warning");
    
    else if(goodBirthdayFormat == false)
        alertMessage("Bad Birthdate Format!", "Warning");
    
    else if(goodEmail == false)
        alertMessage("Bad Email Format!", "Warning");
    
    else{
        try {
            jframeToTxt();
        }
        
        catch(IOException e) {
            
        }
        
        options ops = new options();
        ops.setVisible(true);
    }
}//GEN-LAST:event_employeeSaveButtonActionPerformed

private void employeeEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeEmailKeyReleased
    if(employeeEmail.getText().matches(".+@.+\\.[a-z]+"))
        goodEmail = true;
}//GEN-LAST:event_employeeEmailKeyReleased

private void employeeBirthdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeBirthdateKeyReleased
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");
    dateFormat.setLenient(false);
    
    try {
        dateFormat.parse(employeeBirthdate.getText());
        goodBirthdayFormat = true;
    }
    
    catch(ParseException e) {
        
    }
}//GEN-LAST:event_employeeBirthdateKeyReleased

    public void jframeToTxt() throws IOException {
        PrintWriter gojo = new PrintWriter("C:\\data.txt");

        gojo.println(e.identifier());
        gojo.println("ID Number: " + employeeIdNumber.getText());
        gojo.println("Full Name: " + employeeLastName.getText() + ", " + employeeFirstName.getText() + " " + employeeMI.getText());
        gojo.println("Address: " + employeeAddress.getText());
        gojo.println("Birthdate: " + employeeBirthdate.getText());
        gojo.println("Gender: " + employeeGender.getSelectedItem().toString());
        gojo.println("Email: " + employeeEmail.getText());
        gojo.println("Mobile Number: " + employeeMobileNumber.getText());
        gojo.println("Occupation: " + occupation.getText());
        
        gojo.close();
    }

    private void alertMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new employees().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeAddress;
    private javax.swing.JTextField employeeBirthdate;
    private javax.swing.JTextField employeeEmail;
    private javax.swing.JTextField employeeFirstName;
    private javax.swing.JComboBox employeeGender;
    private javax.swing.JTextField employeeIdNumber;
    private javax.swing.JTextField employeeLastName;
    private javax.swing.JTextField employeeMI;
    private javax.swing.JTextField employeeMobileNumber;
    private javax.swing.JButton employeeSaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField occupation;
    // End of variables declaration//GEN-END:variables
}