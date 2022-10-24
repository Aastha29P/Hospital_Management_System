/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import system.Patient;
import system.patientDirectory;


public class ReadPatientJPanel extends javax.swing.JPanel {
    
    patientDirectory patientHistory;
    public ReadPatientJPanel(patientDirectory patientHistory) {
        initComponents();
        this.patientHistory= patientHistory;
        
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PTable = new javax.swing.JTable();
        txtWeight = new javax.swing.JTextField();
        lbHouse = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        lbPatId = new javax.swing.JLabel();
        lbPatCommunity = new javax.swing.JLabel();
        txtPatId = new javax.swing.JTextField();
        lbPatFName = new javax.swing.JLabel();
        txtPatCommunity = new javax.swing.JTextField();
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
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lbTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Patients");

        PTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Phone", "Age", "Gender", "Date of Birth", "Height", "Weight", "House", "Community"
            }
        ));
        jScrollPane1.setViewportView(PTable);

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

        lbPatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatId.setText(" Id");

        lbPatCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatCommunity.setText("Community");

        lbPatFName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatFName.setText("First Name");

        txtPatCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatCommunityActionPerformed(evt);
            }
        });

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

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(42, 42, 42)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatFName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatLName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPatCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatId)
                            .addComponent(txtPatFName)
                            .addComponent(txtPatLName)
                            .addComponent(txtPatPhone)
                            .addComponent(txtAge)
                            .addComponent(txtPatGen)
                            .addComponent(txtDob)
                            .addComponent(txtHeight)
                            .addComponent(txtWeight)
                            .addComponent(txtHouse)
                            .addComponent(txtPatCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(24, 24, 24)
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
                    .addComponent(lbHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void txtPatCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatCommunityActionPerformed

    private void txtPatFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatFNameActionPerformed

    private void txtPatLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatLNameActionPerformed

    private void txtPatPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatPhoneActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtPatGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatGenActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) PTable.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedRowIndex, 0);
        
        txtPatId.setText(String.valueOf(selectedPatient.getPatId()));
        txtPatFName.setText(selectedPatient.getFirstName());
        txtPatLName.setText(selectedPatient.getLastName());
        txtPatPhone.setText(selectedPatient.getPatPhone());
        txtAge.setText(String.valueOf(selectedPatient.getAge()));
        txtPatGen.setText(selectedPatient.getGender());
        txtDob.setText(selectedPatient.getDob());
        txtHeight.setText(String.valueOf(selectedPatient.getHeight()));
        txtWeight.setText(String.valueOf(selectedPatient.getWeight()));
        txtHouse.setText(selectedPatient.getHouse());
        txtPatCommunity.setText(selectedPatient.getPCommunity());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) PTable.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

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

        JOptionPane.showMessageDialog(this, "Employee Information Updated");
        //history.deleteEmployee(selectedEmployee);
        selectedPatient.setPatId(patId);
        selectedPatient.setFirstName(firstName);
        selectedPatient.setLastName(lastName);
        selectedPatient.setPatPhone(patPhone);
        selectedPatient.setAge(age);
        selectedPatient.setGender(gender);
        selectedPatient.setDob(dob);
        selectedPatient.setHeight(height);
        selectedPatient.setWeight(weight);
        selectedPatient.setHouse(house);

        populateTable();
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
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) PTable.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedRowIndex, 0);

        patientHistory.deletePatient(selectedPatient);
        JOptionPane.showMessageDialog(this, "Employee deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbDob;
    private javax.swing.JLabel lbHeight;
    private javax.swing.JLabel lbHouse;
    private javax.swing.JLabel lbPatCommunity;
    private javax.swing.JLabel lbPatFName;
    private javax.swing.JLabel lbPatGen;
    private javax.swing.JLabel lbPatId;
    private javax.swing.JLabel lbPatLName;
    private javax.swing.JLabel lbPatPhone;
    private javax.swing.JLabel lbTitle;
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

    private void populateTable() {
            DefaultTableModel model = (DefaultTableModel) PTable.getModel();
            model.setRowCount(0);

            for(Patient e: patientHistory.getPatientHistory()){

                Object[] row = new Object[11];
                row[0] = e;
                row[1] = e.getPatId();
                row[2] = e.getFirstName();
                row[3] = e.getLastName();
                row[4] = e.getPatPhone();
                row[5] = e.getAge();
                row[6] = e.getGender();
                row[7] = e.getDob();
                row[8] = e.getHeight();
                row[9] = e.getWeight();
                row[9] = e.getHouse();

                model.addRow(row);
            }
        }
}
