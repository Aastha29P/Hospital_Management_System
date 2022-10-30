/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import system.Patient;
import system.patientDirectory;

public class CreatePatientJPanel extends javax.swing.JPanel {

    patientDirectory patientHistory;
    
    public CreatePatientJPanel(patientDirectory patientHistory) {
        initComponents();
        this.patientHistory = patientHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDocTitle = new javax.swing.JLabel();
        lbPatId = new javax.swing.JLabel();
        txtPatId = new javax.swing.JTextField();
        lbPatFName = new javax.swing.JLabel();
        txtPatFName = new javax.swing.JTextField();
        lbPatLName = new javax.swing.JLabel();
        txtPatLName = new javax.swing.JTextField();
        lbPatPhone = new javax.swing.JLabel();
        txtPatPhone = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lbPatGen = new javax.swing.JLabel();
        txtPatGen = new javax.swing.JTextField();
        lbDob = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lbHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lbWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lbHouse = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lbPatCommunity = new javax.swing.JLabel();
        txtPatCommunity = new javax.swing.JTextField();

        lbDocTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDocTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocTitle.setText("Patient");

        lbPatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatId.setText(" Id");

        lbPatFName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatFName.setText("First Name");

        txtPatFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatFNameActionPerformed(evt);
            }
        });

        lbPatLName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatLName.setText("Last Name");

        txtPatLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatLNameActionPerformed(evt);
            }
        });

        lbPatPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatPhone.setText("Phone");

        txtPatPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatPhoneActionPerformed(evt);
            }
        });

        lbAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAge.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lbPatGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatGen.setText("Gender");

        txtPatGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatGenActionPerformed(evt);
            }
        });

        lbDob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDob.setText("Date of Birth");

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        lbHeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeight.setText("Height");

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        lbWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWeight.setText("Weight");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lbHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHouse.setText("House");

        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbPatCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatCommunity.setText("Community");

        txtPatCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbDocTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPatGen, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbPatId, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbPatFName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbPatLName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbPatPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbDob, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lbAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPatCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatId, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtPatFName)
                    .addComponent(txtPatLName)
                    .addComponent(txtPatPhone)
                    .addComponent(txtAge)
                    .addComponent(txtPatGen)
                    .addComponent(txtDob)
                    .addComponent(txtHeight)
                    .addComponent(txtWeight)
                    .addComponent(txtHouse)
                    .addComponent(txtPatCommunity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDocTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPatId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPatFName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPatLName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPatPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPatGen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDob, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHeight)
                    .addComponent(lbHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPatCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnAdd)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatGenActionPerformed

    private void txtPatFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatFNameActionPerformed

    private void txtPatLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatLNameActionPerformed

    private void txtPatPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatPhoneActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
        int patId = Integer.parseInt(txtPatId.getText());
        String firstName = txtPatFName.getText();
        String lastName = txtPatLName.getText();
        String patPhone = txtPatPhone.getText();
        int age = Integer.parseInt(txtAge.getText()); 
        String gender = txtPatGen.getText();
        String dob = txtDob.getText();
        int height = Integer.parseInt(txtHeight.getText());
        int weight = Integer.parseInt(txtWeight.getText());
        String house = txtHouse.getText();
        String pcommunity = txtPatCommunity.getText();
        
        Patient p = patientHistory.addNewPat();

        p.setPatId(patId);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setPatPhone(patPhone);
        p.setAge(age);
        p.setGender(gender);
        p.setDob(dob);
        p.setHeight(height);
        p.setWeight(weight);
        p.setHouse(house);
        p.setPCommunity(pcommunity);

        JOptionPane.showMessageDialog(this, "New Patient is added.");

        txtPatId.setText("");
        txtPatFName.setText("");
        txtPatLName.setText("");
        txtPatPhone.setText("");
        txtAge.setText("");
        txtPatGen.setText("");
        txtDob.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtHouse.setText("");
        txtPatCommunity.setText("");
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void txtPatCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbDob;
    private javax.swing.JLabel lbDocTitle;
    private javax.swing.JLabel lbHeight;
    private javax.swing.JLabel lbHouse;
    private javax.swing.JLabel lbPatCommunity;
    private javax.swing.JLabel lbPatFName;
    private javax.swing.JLabel lbPatGen;
    private javax.swing.JLabel lbPatId;
    private javax.swing.JLabel lbPatLName;
    private javax.swing.JLabel lbPatPhone;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtPatCommunity;
    private javax.swing.JTextField txtPatFName;
    private javax.swing.JTextField txtPatGen;
    private javax.swing.JTextField txtPatId;
    private javax.swing.JTextField txtPatLName;
    private javax.swing.JTextField txtPatPhone;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
private boolean Validation() {
        try {
        Integer.parseInt(txtPatId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Id");
            
        }
        
        if (txtPatFName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient First Name");
            return false;
        } else {
            if (!(txtPatFName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Patient First Name");
                return false;
            }
        }
        
        if (txtPatLName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Last Name");
            return false;
        } else {
            if (!(txtPatLName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Patient Last Name");
                return false;
            }
        }
        
        if (txtPatPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Phone Number");
            return false;
        } else {
            if (!(txtPatPhone.getText().matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Patient Phone Number(10 digits)");
                return false;
            }
        }
        
        try {
        Integer.parseInt(txtAge.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Age");
            
        }
        
        if (txtAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Age");
            return false;
        }
     
            
        if (txtPatGen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Gender");
            return false;
        }
            else{
            if(!(txtPatGen.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid gender");
                return false;
            }
        }    
        
        if (txtDob.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient DOB");
            return false;
        } else {
            if (!(txtDob.getText().matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))) {
                JOptionPane.showMessageDialog(this, "Please enter Date Format mm/dd/yyyy");
                return false;
            }
        }
        
        if (txtHeight.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Height");
            return false;
        }
        
        try {
        Integer.parseInt(txtHeight.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Height");
            
        }
        
        if (txtWeight.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Weight");
            return false;
        }
        
        try {
        Integer.parseInt(txtWeight.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Weight");
            
        }
        if (txtHouse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient House");
            return false;
        }
            else{
            if(!(txtHouse.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid House");
                return false;
            }
        } 
        
        if (txtPatCommunity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Community");
            return false;
        }
            else{
            if(!(txtPatCommunity.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid Community");
                return false;
            }
        } 
        
       
        return true;
    } 
}
