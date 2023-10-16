
package ma.ui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ma.beans.Service;
import ma.connexion.Connexion;
import ma.service.ClientService;
import ma.service.ServiceService;


public class ServiceForm extends javax.swing.JInternalFrame {
    PreparedStatement ps = null;
    ResultSet rs = null;
    ServiceService ss = new ServiceService();
    ClientService cs;
    DefaultTableModel model = null;
    static int id = 0;
    
   
    public ServiceForm() {
        initComponents();
        ss = new ServiceService();
        cs = new ClientService();
        model  = (DefaultTableModel) serviceTable.getModel();
        load();
        
    }
    
    public void load(){
        model.setRowCount(0);
        for(Service s : ss.findAll()){
            model.addRow(new Object[]{
                s.getId(),
                s.getNom()
            });
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        deleteService = new javax.swing.JButton();
        updateService = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des services");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire"));

        jLabel1.setText("Nom : ");

        add.setText("Ajouter");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(add)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des services"));

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom"
            }
        ));
        serviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(serviceTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        deleteService.setText("Supprimer");
        deleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteServiceActionPerformed(evt);
            }
        });

        updateService.setText("Modifier");
        updateService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateServiceMouseClicked(evt);
            }
        });
        updateService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(deleteService)
                        .addGap(18, 18, 18)
                        .addComponent(updateService)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String nom = txtNom.getText().toString();
        ss.create(new Service(nom));
        model.setRowCount(0);
         load();
        
    }//GEN-LAST:event_addActionPerformed

    private void serviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceTableMouseClicked
        // TODO add your handling code here:
        id = Integer.parseInt(serviceTable.getValueAt( serviceTable.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_serviceTableMouseClicked

    private void deleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteServiceActionPerformed
        // TODO add your handling code here:
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce service ?");
        
        if(reponse == 0){
            ss.delete(ss.findById(id));
            load();
        }
    }//GEN-LAST:event_deleteServiceActionPerformed

    private void updateServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateServiceMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateServiceMouseClicked

    private void updateServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateServiceActionPerformed
        // TODO add your handling code here:
        int ligne = serviceTable.getSelectedRow();
        
        if(ligne == -1){
        JOptionPane.showMessageDialog(null, "Séléctionnez un service !");
        }
            else{
            String nom = txtNom.getText().toString();
            Service sr = new Service(nom);
            
            if(ss.update(ss.findById(id),sr)){
                JOptionPane.showMessageDialog(this, "Service modifié");
                load();
            }      
       }           
    }//GEN-LAST:event_updateServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton deleteService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable serviceTable;
    private javax.swing.JTextField txtNom;
    private javax.swing.JButton updateService;
    // End of variables declaration//GEN-END:variables
}
