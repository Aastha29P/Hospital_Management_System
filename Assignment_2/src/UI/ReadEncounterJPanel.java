/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.table.DefaultTableModel;
import system.Encounter1;
import system.encounterHistory;
import system.vitalSHistory;
import system.vitalSigns;

public class ReadEncounterJPanel extends javax.swing.JPanel {

    encounterHistory encHistory;
    vitalSHistory vsHistory;
    public ReadEncounterJPanel(encounterHistory encHistory, vitalSHistory vsHistory) {
        initComponents();
        this.encHistory = encHistory;
        this.vsHistory = vsHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ETable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));

        lbTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 204, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View Encounter Report");

        ETable.setBackground(java.awt.SystemColor.controlHighlight);
        ETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Report Id", "Doctor Id", "Doctor Name", "Patient Name", "Hospital Id", "Hospital Name", "Date", "Body Temperature", "Pulse Rate", "Respiration Rate", "BP"
            }
        ));
        jScrollPane1.setViewportView(ETable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ETable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ETable.getModel();
            model.setRowCount(0);

            for(Encounter1 e: encHistory.getEncounterHistory()){

                Object[] row = new Object[12];
                row[0] = e;
                row[1] = e.getRepId();
                row[2] = e.getDocId();
                row[3] = e.getDocName();
                row[4] = e.getPatName();
                row[5] = e.getHospId();
                row[6] = e.getHospName();
                row[7] = e.getDate();
            
            for(vitalSigns v: vsHistory.getVsHistory()){
                row[8] = v.getBodyTemp();
                row[9] = v.getPulseRate();
                row[10] = v.getRespRate();
                row[11] = v.getbP();
            } 
            model.addRow(row);
            }
    }

    
}