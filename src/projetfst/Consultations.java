/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Hp
 */
public class Consultations extends javax.swing.JFrame {

    /**
     * Creates new form Consultations
     */
    public Consultations() {
        initComponents();
        super.setLocationRelativeTo(null);
        RemplirComboEtat();
      //  Message.setVisible(false);

    }
    
    JComboBox c= new JComboBox();
    public void RemplirComboEtat(){
        Connection cn;
        PreparedStatement ps;
        cn=connecter();
        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");
            }
            else {
                ps=cn.prepareStatement("select idEtat from EtatVente");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                c.addItem(rs.getString("idEtat"));
                 }
                tab_Inventaire.getColumnModel().getColumn(7).setCellEditor(new DefaultCellEditor(c)); 
        }
           
            }catch(Exception Ex){}
    }
 
 public Connection connecter(){
     
     String url ="jdbc:mysql://localhost:3306/gestionmagasin?zeroDateTimeBehavior=convertToNull";
     Connection cn;
     String user="root";
     String password="";
        try{
            cn=DriverManager.getConnection(url,user,password);
            return cn;
            
        }catch(Exception Ex){ return null;}
        
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VentesComplet = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        VentesEnAtt = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TousVentes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VentesAccept = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_Inventaire = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        Refrech = new javax.swing.JLabel();
        Actualiser = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Confirmer = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Inventaire = new javax.swing.JLabel();
        Actualiser1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.black));
        jPanel1.setLayout(null);

        VentesComplet.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        VentesComplet.setOpaque(false);
        VentesComplet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentesCompletMousePressed(evt);
            }
        });

        javax.swing.GroupLayout VentesCompletLayout = new javax.swing.GroupLayout(VentesComplet);
        VentesComplet.setLayout(VentesCompletLayout);
        VentesCompletLayout.setHorizontalGroup(
            VentesCompletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        VentesCompletLayout.setVerticalGroup(
            VentesCompletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel1.add(VentesComplet);
        VentesComplet.setBounds(820, 30, 217, 60);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-task-completed-35.png"))); // NOI18N
        jLabel3.setText("  Livraisons completes");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(830, 30, 213, 56);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel4.setOpaque(false);

        VentesEnAtt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        VentesEnAtt.setForeground(new java.awt.Color(255, 255, 255));
        VentesEnAtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-puzzled-35.png"))); // NOI18N
        VentesEnAtt.setText(" livraisons en attente");
        VentesEnAtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentesEnAttMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(VentesEnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(VentesEnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(320, 30, 217, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel5.setOpaque(false);

        TousVentes.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        TousVentes.setForeground(new java.awt.Color(255, 255, 255));
        TousVentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-document-35.png"))); // NOI18N
        TousVentes.setText("   Tous les livraisons");
        TousVentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TousVentesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TousVentes, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TousVentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(70, 30, 217, 60);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel3.setOpaque(false);

        VentesAccept.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        VentesAccept.setForeground(new java.awt.Color(255, 255, 255));
        VentesAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-checkmark-35.png"))); // NOI18N
        VentesAccept.setText("  livraisons accept??es");
        VentesAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VentesAcceptMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(VentesAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(VentesAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(570, 30, 217, 60);

        tab_Inventaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tab_Inventaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID livraison", "Designation", "R??ference", "Quantit??", "Prix", "Somme", "Nom client", "ID etat", "Etat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_Inventaire);
        tab_Inventaire.setRowHeight (30);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 120, 1020, 402);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel6.setOpaque(false);

        Refrech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-refresh-35.png"))); // NOI18N
        Refrech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefrechMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RefrechMousePressed(evt);
            }
        });

        Actualiser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Actualiser.setForeground(new java.awt.Color(255, 255, 255));
        Actualiser.setText("Actualiser");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Refrech)
                .addGap(18, 18, 18)
                .addComponent(Actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Refrech))
            .addComponent(Actualiser, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(190, 540, 190, 40);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel7.setOpaque(false);

        Confirmer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-ok-35.png"))); // NOI18N
        Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfirmerMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmer");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Confirmer)
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Confirmer))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(720, 540, 190, 40);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jPanel8.setOpaque(false);

        Inventaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-document-35.png"))); // NOI18N
        Inventaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventaireMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InventaireMousePressed(evt);
            }
        });

        Actualiser1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Actualiser1.setForeground(new java.awt.Color(255, 255, 255));
        Actualiser1.setText("Inventaires");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(Inventaire)
                .addGap(18, 18, 18)
                .addComponent(Actualiser1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Inventaire))
            .addComponent(Actualiser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(450, 540, 190, 39);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/bg-5-full.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1100, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmerMousePressed
        Connection cn;
        PreparedStatement ps;
        cn=connecter(); 
        try
        {
        if (cn==null){
          JOptionPane.showMessageDialog(this, "Pas de connexion");}
          else
          {  
            int row = tab_Inventaire.getSelectedRow();
            String value = (tab_Inventaire.getModel().getValueAt(row, 0).toString());
            String etat =(tab_Inventaire.getModel().getValueAt(row, 7).toString()) ;
            ps=cn.prepareStatement("update Vente set idEtat=? where idVente="+value );
            ps.setString(1,etat);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tab_Inventaire.getModel();
            if(tab_Inventaire.getSelectedRowCount()==1)
            {
               model.removeRow(row);
            }
          }
        }
        catch(Exception Ex){JOptionPane.showMessageDialog(this, Ex);
        System.out.print(Ex);
        }
    }//GEN-LAST:event_ConfirmerMousePressed

    private void TousVentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TousVentesMousePressed
Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Vente> listVente =new ArrayList<>();
        cn=connecter();

        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");}
            else
            {
                ps=cn.prepareStatement("select idVente,designationV,reference,qte,prixVente,c.nomClient,v.idEtat,libelleEtat from client c,vente v,Produit p ,etatVente e where v.idClient=c.idClient and p.idProduit=v.idProduit and v.idEtat=e.idEtat order by idVente asc ");
                rs=ps.executeQuery();
                while(rs.next())
                {
                    int prix=(int) rs.getDouble("prixVente");
                    int qte=rs.getInt("qte");
                    double somme =prix*qte;
                    Vente v = new Vente(rs.getInt("idVente"),rs.getString("designationV"),rs.getString("reference"),qte,prix,somme,rs.getString("nomClient"),rs.getInt("idEtat"),rs.getString("libelleEtat"));
                    listVente.add(v);
                }
            }
        }catch(Exception e)
        {JOptionPane.showMessageDialog(this, e);
        System.out.print(e);
        }
        DefaultTableModel model=(DefaultTableModel) tab_Inventaire.getModel();
        Object[] row = new Object[9];
        for(int i=0;i<listVente.size();i++)
        {
            row[0]=listVente.get(i).getIdVente();
            row[1]=listVente.get(i).getDesignation();
            row[2]=listVente.get(i).getReference();
            row[3]=listVente.get(i).getQte();
            row[4]=listVente.get(i).getPrixVente();
            row[5]=listVente.get(i).getSomme();
            row[6]=listVente.get(i).getNomClient();
            row[7]=listVente.get(i).getIdEtat();
            row[8]=listVente.get(i).getEtat();
            model.addRow(row);
        }
    }//GEN-LAST:event_TousVentesMousePressed

    private void VentesEnAttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesEnAttMousePressed
        Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Vente> listVente =new ArrayList<>();
        cn=connecter();

        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");}
            else
            {
                ps=cn.prepareStatement("select distinct idVente,designationV,reference,qte,prixVente,c.nomClient,v.idEtat,libelleEtat from client c,vente v,Produit p ,etatVente e where v.idClient=c.idClient and p.idProduit=v.idProduit and v.idEtat=e.idEtat and libelleEtat='En cours'  order by idVente asc ");
                rs=ps.executeQuery();
                while(rs.next())
                {
                    int prix=(int) rs.getDouble("prixVente");
                    int qte=rs.getInt("qte");
                    double somme =prix*qte;
                    Vente v = new Vente(rs.getInt("idVente"),rs.getString("designationV"),rs.getString("reference"),qte,prix,somme,rs.getString("nomClient"),rs.getInt("idEtat"),rs.getString("libelleEtat"));
                    listVente.add(v);
                }
            }
        }catch(Exception e)
        {JOptionPane.showMessageDialog(this, e);
        System.out.print(e);
        }
        DefaultTableModel model=(DefaultTableModel) tab_Inventaire.getModel();
        Object[] row = new Object[9];
        for(int i=0;i<listVente.size();i++)
        {
            row[0]=listVente.get(i).getIdVente();
            row[1]=listVente.get(i).getDesignation();
            row[2]=listVente.get(i).getReference();
            row[3]=listVente.get(i).getQte();
            row[4]=listVente.get(i).getPrixVente();
            row[5]=listVente.get(i).getSomme();
            row[6]=listVente.get(i).getNomClient();
            row[7]=listVente.get(i).getIdEtat();
            row[8]=listVente.get(i).getEtat();            
            model.addRow(row);
        }
    }//GEN-LAST:event_VentesEnAttMousePressed

    private void RefrechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefrechMouseClicked
    }//GEN-LAST:event_RefrechMouseClicked

    private void RefrechMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefrechMousePressed
                 DefaultTableModel model =(DefaultTableModel) tab_Inventaire.getModel();
                  model.setRowCount(0);  
    }//GEN-LAST:event_RefrechMousePressed

    private void VentesAcceptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesAcceptMousePressed
 Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Vente> listVente =new ArrayList<>();
        cn=connecter();

        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");}
            else
            {
                ps=cn.prepareStatement("select idVente,designationV,reference,qte,prixVente,c.nomClient,v.idEtat,libelleEtat from client c,vente v,Produit p ,etatVente e where v.idClient=c.idClient and p.idProduit=v.idProduit and v.idEtat=e.idEtat and libelleEtat='Accord??e' order by idVente asc ");
                rs=ps.executeQuery();
                while(rs.next())
                {
                    int prix=(int) rs.getDouble("prixVente");
                    int qte=rs.getInt("qte");
                    double somme =prix*qte;
                    Vente v = new Vente(rs.getInt("idVente"),rs.getString("designationV"),rs.getString("reference"),qte,prix,somme,rs.getString("nomClient"),rs.getInt("idEtat"),rs.getString("libelleEtat"));
                    listVente.add(v);
                }
            }
        }catch(Exception e)
        {JOptionPane.showMessageDialog(this, e);
        System.out.print(e);
        }
        DefaultTableModel model=(DefaultTableModel) tab_Inventaire.getModel();
        Object[] row = new Object[9];
        for(int i=0;i<listVente.size();i++)
        {
            row[0]=listVente.get(i).getIdVente();
            row[1]=listVente.get(i).getDesignation();
            row[2]=listVente.get(i).getReference();
            row[3]=listVente.get(i).getQte();
            row[4]=listVente.get(i).getPrixVente();
            row[5]=listVente.get(i).getSomme();
            row[6]=listVente.get(i).getNomClient();
            row[7]=listVente.get(i).getIdEtat();
            row[8]=listVente.get(i).getEtat();
            model.addRow(row);
        }
                            }//GEN-LAST:event_VentesAcceptMousePressed

    private void VentesCompletMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentesCompletMousePressed
        Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Vente> listVente =new ArrayList<>();
        cn=connecter();

        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");}
            else
            {
                ps=cn.prepareStatement("select idVente,designationV,reference,qte,prixVente,c.nomClient,v.idEtat,libelleEtat from client c,vente v,Produit p ,etatVente e where v.idClient=c.idClient and p.idProduit=v.idProduit and v.idEtat=e.idEtat and libelleEtat='Complet' order by idVente asc ");
                rs=ps.executeQuery();
                while(rs.next())
                {
                    int prix=(int) rs.getDouble("prixVente");
                    int qte=rs.getInt("qte");
                    double somme =prix*qte;
                    Vente v = new Vente(rs.getInt("idVente"),rs.getString("designationV"),rs.getString("reference"),qte,prix,somme,rs.getString("nomClient"),rs.getInt("idEtat"),rs.getString("libelleEtat"));
                    listVente.add(v);
                }
            }
        }catch(Exception e)
        {JOptionPane.showMessageDialog(this, e);
        System.out.print(e);
        }
        DefaultTableModel model=(DefaultTableModel) tab_Inventaire.getModel();
        Object[] row = new Object[9];
        for(int i=0;i<listVente.size();i++)
        {
            row[0]=listVente.get(i).getIdVente();
            row[1]=listVente.get(i).getDesignation();
            row[2]=listVente.get(i).getReference();
            row[3]=listVente.get(i).getQte();
            row[4]=listVente.get(i).getPrixVente();
            row[5]=listVente.get(i).getSomme();
            row[6]=listVente.get(i).getNomClient();
            row[7]=listVente.get(i).getIdEtat();
            row[8]=listVente.get(i).getEtat();
            model.addRow(row);
        }
                            
    }//GEN-LAST:event_VentesCompletMousePressed

    private void InventaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventaireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InventaireMouseClicked

    private void InventaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventaireMousePressed
        Inventaire i=new Inventaire();
        i.setVisible(true);
    }//GEN-LAST:event_InventaireMousePressed

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
            java.util.logging.Logger.getLogger(Consultations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualiser;
    private javax.swing.JLabel Actualiser1;
    private javax.swing.JLabel Confirmer;
    private javax.swing.JLabel Inventaire;
    private javax.swing.JLabel Refrech;
    private javax.swing.JLabel TousVentes;
    private javax.swing.JLabel VentesAccept;
    private javax.swing.JPanel VentesComplet;
    private javax.swing.JLabel VentesEnAtt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_Inventaire;
    // End of variables declaration//GEN-END:variables
}
