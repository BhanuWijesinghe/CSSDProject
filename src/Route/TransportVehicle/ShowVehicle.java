/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.TransportVehicle;

import Route.RouteUI;
import java.util.ArrayList;

/**
 *
 * @author Shakuni
 */
public class ShowVehicle extends javax.swing.JFrame {

    /**
     * Creates new form ShowVehicle
     */
    RouteUI routeUI = new RouteUI();
    
    public ShowVehicle(RouteUI frame) {
        initComponents();
        ArrayList <Vehicle> vehicleList= null;
        TransportVehicleClass  TVehicleClass = new TransportVehicleClass();
        vehicleList = TVehicleClass.vehicleDeserialization();
        int i =0;
        for(Vehicle mk :vehicleList){
            //System.out.println(bk.getMemberNumber());
            vehicleTable.setValueAt(mk.getVehicleID(), i, 0);
            vehicleTable.setValueAt(mk.getCapacity(), i, 1);
            i++;
        }
        this.routeUI=frame;
        vehiclePanel.add(routeVehiclePanel);
    }
    
    public ShowVehicle() {
        initComponents();
        ArrayList <Vehicle> vehicleList= null;
        TransportVehicleClass  TVehicleClass = new TransportVehicleClass();
        vehicleList = TVehicleClass.vehicleDeserialization();
        int i =0;
        for(Vehicle mk :vehicleList){
            //System.out.println(bk.getMemberNumber());
            vehicleTable.setValueAt(mk.getVehicleID(), i, 0);
            vehicleTable.setValueAt(mk.getCapacity(), i, 1);
            i++;
        }
        vehiclePanel.remove(routeVehiclePanel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehiclePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        routeVehiclePanel = new javax.swing.JPanel();
        vehicleSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vehicle No", "Capacity"
            }
        ));
        jScrollPane1.setViewportView(vehicleTable);

        vehicleSelect.setText("Select Vehicle");
        vehicleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout routeVehiclePanelLayout = new javax.swing.GroupLayout(routeVehiclePanel);
        routeVehiclePanel.setLayout(routeVehiclePanelLayout);
        routeVehiclePanelLayout.setHorizontalGroup(
            routeVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routeVehiclePanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(vehicleSelect)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        routeVehiclePanelLayout.setVerticalGroup(
            routeVehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routeVehiclePanelLayout.createSequentialGroup()
                .addComponent(vehicleSelect)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vehiclePanelLayout = new javax.swing.GroupLayout(vehiclePanel);
        vehiclePanel.setLayout(vehiclePanelLayout);
        vehiclePanelLayout.setHorizontalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(routeVehiclePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        vehiclePanelLayout.setVerticalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(routeVehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehicleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleSelectActionPerformed
        int [] index = vehicleTable.getSelectedRows();
        Object [][] rowValue = new Object[index.length][2];
        for(int i = 0; i< index.length; i++){
            for(int y=0;y<2;y++){
                rowValue[i][y] = vehicleTable.getValueAt(index[i], y);
            }            
        }
//        Object [] rowValue = new Object[3];
//        for(int i = 0; i< index.length; i++){
//            rowValue[0] = vehicleTable.getValueAt(index[i], 0);
//            rowValue[1] = vehicleTable.getValueAt(index[i], 1);
//        }
        routeUI.setVehicles(rowValue);
        this.setVisible(false);
    }//GEN-LAST:event_vehicleSelectActionPerformed

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
            java.util.logging.Logger.getLogger(ShowVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel routeVehiclePanel;
    private javax.swing.JPanel vehiclePanel;
    private javax.swing.JButton vehicleSelect;
    private javax.swing.JTable vehicleTable;
    // End of variables declaration//GEN-END:variables
}
