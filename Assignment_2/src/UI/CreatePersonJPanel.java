/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import system.Person;
import system.personDirectory;


public class CreatePersonJPanel extends javax.swing.JPanel {

    personDirectory personHistory;
    public CreatePersonJPanel(personDirectory personHistory) {
        initComponents();
        this.personHistory = personHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPerAge = new javax.swing.JTextField();
        lbPerGen = new javax.swing.JLabel();
        txtPerGen = new javax.swing.JTextField();
        lbPerHouse = new javax.swing.JLabel();
        lbPerComm = new javax.swing.JLabel();
        txtPerHouse = new javax.swing.JTextField();
        lbPerTitle = new javax.swing.JLabel();
        lbPerId = new javax.swing.JLabel();
        txtPerComm = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtPerId = new javax.swing.JTextField();
        lbPerName = new javax.swing.JLabel();
        txtPerName = new javax.swing.JTextField();
        lbPerAge = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        txtPerAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerAgeActionPerformed(evt);
            }
        });

        lbPerGen.setForeground(new java.awt.Color(255, 255, 255));
        lbPerGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerGen.setText("Gender");

        txtPerGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerGenActionPerformed(evt);
            }
        });

        lbPerHouse.setForeground(new java.awt.Color(255, 255, 255));
        lbPerHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerHouse.setText("House");

        lbPerComm.setForeground(new java.awt.Color(255, 255, 255));
        lbPerComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerComm.setText("Community");

        txtPerHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerHouseActionPerformed(evt);
            }
        });

        lbPerTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbPerTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbPerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerTitle.setText("Person Form");

        lbPerId.setForeground(new java.awt.Color(255, 255, 255));
        lbPerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerId.setText(" Id");

        txtPerComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerCommActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lbPerName.setForeground(new java.awt.Color(255, 255, 255));
        lbPerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerName.setText("Name");

        txtPerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerNameActionPerformed(evt);
            }
        });

        lbPerAge.setForeground(new java.awt.Color(255, 255, 255));
        lbPerAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPerAge.setText("Age");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lbPerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPerComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPerAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPerGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPerHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPerId)
                            .addComponent(txtPerName)
                            .addComponent(txtPerAge)
                            .addComponent(txtPerGen)
                            .addComponent(txtPerHouse)
                            .addComponent(txtPerComm, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)
                        .addGap(46, 46, 46)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPerTitle)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPerId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPerName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPerGen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPerHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPerComm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPerHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPerComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(btnAdd)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerAgeActionPerformed

    private void txtPerGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerGenActionPerformed

    private void txtPerHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerHouseActionPerformed

    private void txtPerCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerCommActionPerformed

    private void txtPerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean isValid = Validation();
        if (isValid) {
        int perId = Integer.parseInt(txtPerId.getText());
        String perName = txtPerName.getText();
        int perAge = Integer.parseInt(txtPerAge.getText());
        String perGen = txtPerGen.getText();
        String PerHouse = txtPerHouse.getText(); 
        String perComm = txtPerComm.getText();
        
        Person p = personHistory.addNewPer();

        p.setPerId(perId);
        p.setName(perName);
        p.setAge(perAge);
        p.setGender(perGen);
        p.setHouse(PerHouse);
        p.setCommunity(perComm);
        
        JOptionPane.showMessageDialog(this, "New Person is added.");

        txtPerId.setText("");
        txtPerName.setText("");
        txtPerAge.setText("");
        txtPerGen.setText("");
        txtPerHouse.setText("");
        txtPerComm.setText("");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lbPerAge;
    private javax.swing.JLabel lbPerComm;
    private javax.swing.JLabel lbPerGen;
    private javax.swing.JLabel lbPerHouse;
    private javax.swing.JLabel lbPerId;
    private javax.swing.JLabel lbPerName;
    private javax.swing.JLabel lbPerTitle;
    private javax.swing.JTextField txtPerAge;
    private javax.swing.JTextField txtPerComm;
    private javax.swing.JTextField txtPerGen;
    private javax.swing.JTextField txtPerHouse;
    private javax.swing.JTextField txtPerId;
    private javax.swing.JTextField txtPerName;
    // End of variables declaration//GEN-END:variables
private boolean Validation() {
        
        if (txtPerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person ID");
            return false;
        } else {
            if (txtPerId.getText().length() != 2) {
                JOptionPane.showMessageDialog(this, "Person ID should be only 2 digits");
                return false;
            }
        }
        
        try {
        Integer.parseInt(txtPerId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Id");
            
        }
        
        
        if (txtPerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person Name");
            return false;
        } else {
            if (!(txtPerName.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))) {
                JOptionPane.showMessageDialog(this, "Please enter Valid Person Name");
                return false;
            }
        }
        
        try {
        Integer.parseInt(txtPerAge.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a numerical value for Age");
            
        }
        
        if (txtPerAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person Age");
            return false;
        }
        
        if (txtPerGen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person Gender");
            return false;
        }
            else{
            if(!(txtPerGen.getText().matches("[a-zA-Z]*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid gender");
                return false;
            }
        } 
        
        if (txtPerHouse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person House");
            return false;
        }
            else{
            if(!(txtPerHouse.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid House");
                return false;
            }
        } 
        
        if (txtPerComm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Person Community");
            return false;
        }
            else{
            if(!(txtPerComm.getText().matches("[a-zA-Z]*[\\s]{1}[a-zA-Z].*"))){
                JOptionPane.showMessageDialog(this, "Please enter valid Community");
                return false;
            }
        } 
        return true;
    }
}
