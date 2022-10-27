/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import system.Doctor;
import system.doctorDirectory;
import system.hospitalDirectory;
import system.patientDirectory;
//import system.doctorDirectory;

public class ReadDoctor extends javax.swing.JFrame {

     doctorDirectory docHistory;
     patientDirectory patientHistory;
     hospitalDirectory hospHistory;

    /**
     * Creates new form ReadDoctor
     */
    public ReadDoctor() {
        initComponents();
        docHistory = new doctorDirectory(); 
        patientHistory = new patientDirectory();
        hospHistory = new hospitalDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnDoctor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtHospName = new javax.swing.JTextField();
        txtDocId = new javax.swing.JTextField();
        lbHospId = new javax.swing.JLabel();
        lbDocName = new javax.swing.JLabel();
        txtHospId = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        lbDocGen = new javax.swing.JLabel();
        txtDocGen = new javax.swing.JTextField();
        lbDocPhone = new javax.swing.JLabel();
        txtDocPhone = new javax.swing.JTextField();
        lbDocDep = new javax.swing.JLabel();
        txtDocDep = new javax.swing.JTextField();
        lbHospName = new javax.swing.JLabel();
        lbDocId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnHospital.setText("Hospital");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnDoctor)
                .addGap(44, 44, 44)
                .addComponent(btnPatient)
                .addGap(38, 38, 38)
                .addComponent(btnHospital)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        lbTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Doctors");

        DTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Gender", "Phone", "Department", "Hospital Id", "Hospital Name"
            }
        ));
        jScrollPane1.setViewportView(DTable);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        lbHospId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospId.setText("Hospital Id");

        lbDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocName.setText("Name");

        txtHospId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospIdActionPerformed(evt);
            }
        });

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        lbDocGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocGen.setText("Gender");

        txtDocGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocGenActionPerformed(evt);
            }
        });

        lbDocPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocPhone.setText("Phone");

        txtDocPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocPhoneActionPerformed(evt);
            }
        });

        lbDocDep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocDep.setText("Department");

        txtDocDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocDepActionPerformed(evt);
            }
        });

        lbHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHospName.setText("Hospital Name");

        lbDocId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocId.setText(" Id");

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WorkAreaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(WorkAreaLayout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(btnView)
                                .addGap(30, 30, 30)
                                .addComponent(btnDelete)
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkAreaLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDocGen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDocDep, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDocId)
                    .addComponent(txtDocName)
                    .addComponent(txtDocGen)
                    .addComponent(txtDocPhone)
                    .addComponent(txtDocDep)
                    .addComponent(txtHospName)
                    .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDocGen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDocDep, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel createDoctorPanel= new CreateDoctorJPanel(docHistory);
        splitPane.setRightComponent(createDoctorPanel);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatientPanel= new CreatePatientJPanel(patientHistory);
        splitPane.setRightComponent(createPatientPanel);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel createHospitalPanel= new CreateHospitalJPanel(hospHistory);
        splitPane.setRightComponent(createHospitalPanel);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);

        int docId = Integer.parseInt(txtDocId.getText());
        String docName = txtDocName.getText();
        String docPhone = txtDocPhone.getText();
        String docGen = txtDocGen.getText();
        String docDep = txtDocDep.getText();
        int hospId = Integer.parseInt(txtHospId.getText());
        String hospName = txtHospName.getText();

        JOptionPane.showMessageDialog(this, "Employee Information Updated");
        //history.deleteEmployee(selectedEmployee);
        selectedDoctor.setDocId(docId);
        selectedDoctor.setDocName(docName);
        selectedDoctor.setDocPhone(docPhone);
        selectedDoctor.setDocGen(docGen);
        selectedDoctor.setDocDep(docDep);
        selectedDoctor.setHospId(hospId);
        selectedDoctor.setHospName(hospName);

        populateTable();
        txtDocId.setText("");
        txtDocName.setText("");
        txtDocPhone.setText("");
        txtDocGen.setText("");
        txtDocDep.setText("");
        txtHospId.setText("");
        txtHospName.setText("");
        }

        {
            // TODO add your handling code here:

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
        Doctor selectedDoctor = (Doctor)model.getValueAt(selectedRowIndex, 0);

        txtDocId.setText(String.valueOf(selectedDoctor.getDocId()));
        txtDocName.setText(selectedDoctor.getDocName());
        txtDocPhone.setText(selectedDoctor.getDocPhone());
        txtDocGen.setText(selectedDoctor.getDocGen());
        txtDocDep.setText(selectedDoctor.getDocDep());
        txtHospId.setText(String.valueOf(selectedDoctor.getHospId()));
        txtHospName.setText(selectedDoctor.getHospName());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) DTable.getModel();
        Doctor selectedDoctor = (Doctor)model.getValueAt(selectedRowIndex, 0);

        docHistory.deleteDoctor(selectedDoctor);
        JOptionPane.showMessageDialog(this, "Employee deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private void txtHospIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospIdActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtDocGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocGenActionPerformed

    private void txtDocPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocPhoneActionPerformed

    private void txtDocDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocDepActionPerformed

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
            java.util.logging.Logger.getLogger(ReadDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DTable;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDocDep;
    private javax.swing.JLabel lbDocGen;
    private javax.swing.JLabel lbDocId;
    private javax.swing.JLabel lbDocName;
    private javax.swing.JLabel lbDocPhone;
    private javax.swing.JLabel lbHospId;
    private javax.swing.JLabel lbHospName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtDocDep;
    private javax.swing.JTextField txtDocGen;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDocPhone;
    private javax.swing.JTextField txtHospId;
    private javax.swing.JTextField txtHospName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}