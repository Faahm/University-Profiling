// Java jForm in university profiling, students class.
// GUI by Fatima Mahinay, Source Code by Alexandra Lanorias
// October 21, 2021 

package university_profiling;

import java.io.BufferedWriter;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.nio.file.Path;


public class students extends javax.swing.JFrame {
    boolean goodEmail = false;
    boolean goodBirthdayFormat = false;
    StudentProfiling s = new StudentProfiling();
    
    public students() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studentMobileNumber = new javax.swing.JTextField();
        studentIdNumber = new javax.swing.JTextField();
        studentLastName = new javax.swing.JTextField();
        studentAddress = new javax.swing.JTextField();
        studentBirthdate = new javax.swing.JTextField();
        studentEmail = new javax.swing.JTextField();
        yearLevel = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        studentGender = new javax.swing.JComboBox();
        studentSaveButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        studentFirstName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        studentMI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        studentEmailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Student Profiling");

        jLabel2.setText("ID Number:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Address:");

        jLabel5.setText("Birthdate:");

        jLabel6.setText("Gender:");

        jLabel7.setText("Email:");

        jLabel8.setText("Mobile Number:");

        jLabel9.setText("Year Level:");

        jLabel10.setText("Course:");

        jLabel11.setText("Section:");

        studentBirthdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentBirthdateKeyReleased(evt);
            }
        });

        studentEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentEmailKeyReleased(evt);
            }
        });

        studentGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Non-binary" }));

        studentSaveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentSaveButton.setForeground(new java.awt.Color(0, 102, 51));
        studentSaveButton.setText("Save");
        studentSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSaveButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("First Name:");

        jLabel13.setText("M.I.:");

        jLabel14.setForeground(new java.awt.Color(-8355712,true));
        jLabel14.setText("e.g. December 7, 1989");

        studentEmailLabel.setForeground(new java.awt.Color(-8355712,true));
        studentEmailLabel.setText("e.g. gojosatoru@gmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(studentIdNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(studentLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(studentAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(studentBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(studentGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(section, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(course, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(yearLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(studentMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(studentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(studentMI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel14)
                                .addComponent(studentEmailLabel))
                            .addGap(61, 61, 61))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(studentSaveButton)
                            .addContainerGap(665, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(271, 271, 271))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(studentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(studentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(studentMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(studentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(studentBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(studentGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentEmailLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(studentMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(studentSaveButton)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void studentSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSaveButtonActionPerformed
    if(studentIdNumber.getText().length() == 0 || studentLastName.getText().length() == 0 || studentFirstName.getText().length() == 0 || studentMI.getText().length() == 0  || studentAddress.getText().length() == 0 || studentBirthdate.getText().length() == 0 || studentEmail.getText().length() == 0 || studentMobileNumber.getText().length() == 0 || yearLevel.getText().length() == 0 || course.getText().length() == 0 || section.getText().length() == 0)
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
}//GEN-LAST:event_studentSaveButtonActionPerformed

private void studentEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentEmailKeyReleased
    if(studentEmail.getText().matches(".+@.+\\.[a-z]+"))
        goodEmail = true;
}//GEN-LAST:event_studentEmailKeyReleased

private void studentBirthdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentBirthdateKeyReleased
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");
    dateFormat.setLenient(false);
    
    try {
        dateFormat.parse(studentBirthdate.getText());
        goodBirthdayFormat = true;
    }
    
    catch(ParseException e) {
        
    }
}//GEN-LAST:event_studentBirthdateKeyReleased

    public void jframeToTxt() throws IOException {
        //FileWriter writer = new FileWriter("C:\\data.txt");
        BufferedWriter bw = null;
        try {
            String s1 = s.identifier();
            String s2 = "ID Number: " + studentIdNumber.getText();
            String s3 = "Full Name: " + studentLastName.getText() + ", " + studentFirstName.getText() + " " + studentMI.getText();
            String s4 = "Address: " + studentAddress.getText();
            String s5 = "Birthdate: " + studentBirthdate.getText();
            String s6 = "Gender: " + studentGender.getSelectedItem().toString();
            String s7 = "Email: " + studentEmail.getText();
            String s8 = "Mobile Number: " + studentMobileNumber.getText();
            String s9 = "Year Level: " + yearLevel.getText();
            String s10 = "Course: " + course.getText();
            String s11 = "Section: " + section.getText();
            String[] info = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11};
            File file = new File("C:\\data.txt");
            //writer.close();

	  if (!file.exists()) {
	     file.createNewFile();
	  }
	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
          for(int i = 0; i < 11; i++) {
              bw.write(info[i]);
          }
          System.out.println("File written Successfully");

        } catch (IOException ioe) {
	   ioe.printStackTrace();
           
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
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
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new students().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField section;
    private javax.swing.JTextField studentAddress;
    private javax.swing.JTextField studentBirthdate;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JLabel studentEmailLabel;
    private javax.swing.JTextField studentFirstName;
    private javax.swing.JComboBox studentGender;
    private javax.swing.JTextField studentIdNumber;
    private javax.swing.JTextField studentLastName;
    private javax.swing.JTextField studentMI;
    private javax.swing.JTextField studentMobileNumber;
    private javax.swing.JButton studentSaveButton;
    private javax.swing.JTextField yearLevel;
    // End of variables declaration//GEN-END:variables
}