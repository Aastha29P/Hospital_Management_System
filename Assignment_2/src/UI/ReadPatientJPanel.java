/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import system.Community;
import system.CommunityHistory;
import system.Patient;
import system.patientDirectory;


public class ReadPatientJPanel extends javax.swing.JPanel {
    
    private ArrayList<Community> cList = new ArrayList<>();
//
    private HashSet<String> cityList = new HashSet<>();
//
//   private ArrayList<String> communityNameList = new ArrayList<>();
//
//    private ArrayList<String> houseList = new ArrayList<>();
//
    private HashMap<String, ArrayList<String>> map = new HashMap<>();
    CommunityHistory comm;
    Patient patient;
    patientDirectory patientHistory;
    public ReadPatientJPanel(patientDirectory patientHistory, Patient patient, CommunityHistory comm) {
        initComponents();
        this.patientHistory= patientHistory;
        this.patient = patient;
        this.comm = comm;
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
        lbPatCommunity1 = new javax.swing.JLabel();
        CommNameTxt = new javax.swing.JComboBox<>();
        CommCityTxt = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 0));

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Patients");

        PTable.setBackground(java.awt.SystemColor.controlHighlight);
        PTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Phone", "Age", "Gender", "Date of Birth", "Height", "Weight", "House", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(PTable);

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lbHouse.setForeground(new java.awt.Color(255, 255, 255));
        lbHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHouse.setText("House");

        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        lbPatId.setForeground(new java.awt.Color(255, 255, 255));
        lbPatId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatId.setText(" Id");

        lbPatCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lbPatCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatCommunity.setText("Community");

        lbPatFName.setForeground(new java.awt.Color(255, 255, 255));
        lbPatFName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatFName.setText("First Name");

        txtPatFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatFNameActionPerformed(evt);
            }
        });

        lbPatLName.setForeground(new java.awt.Color(255, 255, 255));
        lbPatLName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatLName.setText("Last Name");

        txtPatLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatLNameActionPerformed(evt);
            }
        });

        lbPatPhone.setForeground(new java.awt.Color(255, 255, 255));
        lbPatPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatPhone.setText("Phone");

        txtPatPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatPhoneActionPerformed(evt);
            }
        });

        lbAge.setForeground(new java.awt.Color(255, 255, 255));
        lbAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAge.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lbPatGen.setForeground(new java.awt.Color(255, 255, 255));
        lbPatGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatGen.setText("Gender");

        txtPatGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatGenActionPerformed(evt);
            }
        });

        lbDob.setForeground(new java.awt.Color(255, 255, 255));
        lbDob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDob.setText("Date of Birth");

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        lbHeight.setForeground(new java.awt.Color(255, 255, 255));
        lbHeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeight.setText("Height");

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        lbWeight.setForeground(new java.awt.Color(255, 255, 255));
        lbWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWeight.setText("Weight");

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbPatCommunity1.setForeground(new java.awt.Color(255, 255, 255));
        lbPatCommunity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatCommunity1.setText("City");

        CommNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommNameTxtActionPerformed(evt);
            }
        });

        CommCityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommCityTxtActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbPatCommunity1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPatGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPatId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPatFName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPatLName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbPatPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDob, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(lbAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lbPatCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addComponent(CommCityTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CommNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbPatCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CommCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPatCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

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
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) PTable.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedRowIndex, 0);
        String selectedCity = patient.getCity();
        String selectedComm = patient.getCommunity();
        
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
        CommNameTxt.setSelectedItem(patient.getCommunity());
        CommCityTxt.setSelectedItem(patient.getCity());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
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
        String PatCity = CommCityTxt.getSelectedItem().toString();
        String PatComm = CommNameTxt.getSelectedItem().toString();

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
        selectedPatient.setCity(PatCity);
        selectedPatient.setCommunity(PatComm);

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
        CommNameTxt.setSelectedItem("");
        CommCityTxt.setSelectedItem("");
    }//GEN-LAST:event_btnUpdateActionPerformed
}
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

    private void CommNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommNameTxtActionPerformed

    private void CommCityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommCityTxtActionPerformed
        // TODO add your handling code here:
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {

            if (CommCityTxt.getSelectedItem() != null) {

                if (CommCityTxt.getSelectedItem().equals(entry.getKey())) {
                    ArrayList<String> list = entry.getValue();
                    //HospCityCombobox.removeAllItems();
                    CommNameTxt.removeAllItems();
                    for (String community : list) {
                        CommNameTxt.addItem(community);
                    }

                }

            }

        }
    }//GEN-LAST:event_CommCityTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CommCityTxt;
    private javax.swing.JComboBox<String> CommNameTxt;
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
    private javax.swing.JLabel lbPatCommunity1;
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

                Object[] row = new Object[13];
                row[0] = e;
                row[1] = e.getFirstName();
                row[2] = e.getLastName();
                row[3] = e.getPatPhone();
                row[4] = e.getAge();
                row[5] = e.getGender();
                row[6] = e.getDob();
                row[7] = e.getHeight();
                row[8] = e.getWeight();
                row[9] = e.getHouse();
                row[10] = e.getCommunity();
                row[11] = e.getCity();

                model.addRow(row);
            }
        }
    private boolean Validation() {
        
        if (txtPatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient ID");
            return false;
        } else {
            if (txtPatId.getText().length() != 4) {
                JOptionPane.showMessageDialog(this, "Patient ID should be only 4 digits");
                return false;
            }
        }
        try {
        Integer.parseInt(txtPatId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Id");
            
        }
        
        if (txtPatFName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient First Name");
            return false;
        } else {
            if (!(txtPatFName.getText().matches("[a-zA-Z]*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Patient First Name");
                return false;
            }
        }
        
        if (txtPatLName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Patient Last Name");
            return false;
        } else {
            if (!(txtPatLName.getText().matches("[a-zA-Z]*"))) {
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
            if(!(txtPatGen.getText().matches("[a-zA-Z]*"))){
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
        
              
       
        return true;
    } 
}
