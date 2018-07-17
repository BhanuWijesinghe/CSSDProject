/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

import Route.JourneyRecord.ShowJourneys;
import Route.Stops.ShowStops;
import Route.TransportVehicle.ShowVehicle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shakuni
 */
public class RouteUI extends javax.swing.JFrame {

    /**
     * Creates new form RouteUI
     */
    public RouteUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        routeJourneyTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        routeStopsTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        stopsSelect = new javax.swing.JButton();
        journeySelect = new javax.swing.JButton();
        vehicleSelect = new javax.swing.JButton();
        routeID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Route ID :");

        jLabel2.setText("Name :");

        routeJourneyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Source Stop", "Destination Stop", "Date", "Time", "Transport Type", "Cost"
            }
        ));
        jScrollPane1.setViewportView(routeJourneyTable);

        jLabel3.setText("Stops :");

        jLabel4.setText("Journeys :");

        routeStopsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stop ID", "Zone ID", "Name", "Latitude", "Longitude"
            }
        ));
        jScrollPane2.setViewportView(routeStopsTable);

        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Capacity"
            }
        ));
        jScrollPane3.setViewportView(vehicleTable);

        jLabel5.setText("Vehicles :");

        stopsSelect.setText("Select Stops");
        stopsSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopsSelectActionPerformed(evt);
            }
        });

        journeySelect.setText("Select Journeys");
        journeySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeySelectActionPerformed(evt);
            }
        });

        vehicleSelect.setText("Select Vehicles");
        vehicleSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleSelectActionPerformed(evt);
            }
        });

        save.setText("Add Route");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("Reset");

        jLabel6.setFont(new java.awt.Font("Open Sans Extrabold", 1, 48)); // NOI18N
        jLabel6.setText("# TravelAnyWhere");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(save)
                        .addGap(59, 59, 59)
                        .addComponent(reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(27, 27, 27)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(routeID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(journeySelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stopsSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(routeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(stopsSelect)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(journeySelect)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(vehicleSelect)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopsSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopsSelectActionPerformed
        ShowStops showStops = new ShowStops(this);
        showStops.setVisible(true);
    }//GEN-LAST:event_stopsSelectActionPerformed

    private void journeySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeySelectActionPerformed
        ShowJourneys showJourney = new ShowJourneys(this);
        showJourney.setVisible(true);
    }//GEN-LAST:event_journeySelectActionPerformed

    private void vehicleSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleSelectActionPerformed
        ShowVehicle showVehicle = new ShowVehicle(this);
        showVehicle.setVisible(true);
    }//GEN-LAST:event_vehicleSelectActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String RID = routeID.getText().toString();
        String Name = name.getText().toString();
        //int stopIndex = routeStopsTable.getRowCount();
        Object [][] stops = new Object[routeStopsTable.getRowCount()][5];
        for(int i = 0; i< routeStopsTable.getRowCount(); i++){
            for(int y=0;y<5;y++){
                stops[i][y] = routeStopsTable.getValueAt(i, y);
            }                     
        }
//        Object [] stops = new Object[5];
//        for(int i = 0; i< stopIndex; i++){
//            stops[0] = routeStopsTable.getValueAt(i, 0);
//            stops[1] = routeStopsTable.getValueAt(i, 1);
//            stops[2] = routeStopsTable.getValueAt(i, 2);
//            stops[3] = routeStopsTable.getValueAt(i, 3);
//            stops[4] = routeStopsTable.getValueAt(i, 4);
//        }
        //int journeyIndex = routeStopsTable.getRowCount();
        Object [][] journey = new Object[routeStopsTable.getRowCount()][5];
        for(int i = 0; i< routeStopsTable.getRowCount(); i++){
            for(int y=0;y<5;y++){
                journey[i][y] = routeStopsTable.getValueAt(i, y);
            }
        }
//        Object [] journey = new Object[6];
//        for(int i = 0; i< journeyIndex; i++){
//            journey[0] = routeJourneyTable.getValueAt(i, 0);
//            journey[1] = routeJourneyTable.getValueAt(i, 1);
//            journey[2] = routeJourneyTable.getValueAt(i, 2);
//            journey[3] = routeJourneyTable.getValueAt(i, 3);
//            journey[4] = routeJourneyTable.getValueAt(i, 4);
//            journey[5] = routeJourneyTable.getValueAt(i, 5);
//        }
        //int vehicleIndex = routeStopsTable.getRowCount();
        Object [][] vehicle = new Object[routeStopsTable.getRowCount()][2];
        for(int i = 0; i< routeStopsTable.getRowCount(); i++){
            for(int y=0;y<2;y++){
                vehicle[i][y] = routeStopsTable.getValueAt(i, y);
            }                      
        }
//        Object [] vehicle = new Object[3];
//        for(int i = 0; i< vehicleIndex; i++){
//            vehicle[0] = vehicleTable.getValueAt(i, 0);
//            vehicle[1] = vehicleTable.getValueAt(i, 1);
//        }
        Route route = new Route();
        route.setRoute(RID, Name, stops, journey, vehicle);
        
        RouteClass routeClass = new RouteClass();
        routeClass.routeSerialization(route);
        JOptionPane.showMessageDialog(null, "Route added");
        
    }//GEN-LAST:event_saveActionPerformed
    public void setStops(Object[][] rowValue) {
        for(Object[] record:rowValue){
            DefaultTableModel model = (DefaultTableModel) routeStopsTable.getModel();
            model.addRow(record);
        }
    }
    public void setJourneys(Object[][] rowValue) {
        for(Object[] record:rowValue){
            DefaultTableModel journeyModel = (DefaultTableModel) routeJourneyTable.getModel();
            journeyModel.addRow(record);
        }
    }
    public void setVehicles(Object[][] rowValue) {
        for(Object[] record:rowValue){
            DefaultTableModel vehicleModel = (DefaultTableModel) vehicleTable.getModel();
            vehicleModel.addRow(record);
        }
    }
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
            java.util.logging.Logger.getLogger(RouteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouteUI().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton journeySelect;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JTextField routeID;
    private javax.swing.JTable routeJourneyTable;
    private javax.swing.JTable routeStopsTable;
    private javax.swing.JButton save;
    private javax.swing.JButton stopsSelect;
    private javax.swing.JButton vehicleSelect;
    private javax.swing.JTable vehicleTable;
    // End of variables declaration//GEN-END:variables

}
