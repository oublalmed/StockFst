/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfst;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Statistiques extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    public Statistiques() {
        initComponents();
        NombreProduit();
        TotaleVente();
        NombreFacture();
        NombreCmd();
        show(position);
    }
int position=0;

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
    public void NombreProduit(){
        Connection cn;
        PreparedStatement ps;
        cn=connecter();
        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");
            }
            else {
                ps=cn.prepareStatement("select count(*) from produit ");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                NBRProduit.setText(rs.getString(1).toString());
                
                 }
        }
            }catch(Exception Ex){}
    }
   
        public void NombreCmd(){
        Connection cn;
        PreparedStatement ps;
        cn=connecter();
        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");
            }
            else {
                ps=cn.prepareStatement("select count(*) from cammande ");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                NBRCmd.setText(rs.getString(1).toString());
                
                 }
        }
            }catch(Exception Ex){}
    }
        
    public void TotaleVente(){
        Connection cn;
        PreparedStatement ps;
        cn=connecter();
        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");
            }
            else {
                ps=cn.prepareStatement("select sum(prixvente*qte) from vente");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                String vente =rs.getString(1);
                TotalVente.setText(vente+" dh");
                 }
        }
            }catch(Exception Ex){}
    }
    
     public void NombreFacture(){
        Connection cn;
        PreparedStatement ps;
        cn=connecter();
        try{
            if (cn==null){
                JOptionPane.showMessageDialog(this, "Pas de connexion");
            }
            else {
                ps=cn.prepareStatement("select distinct count(*) from factureClient ");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                NBRFactures.setText(rs.getString(1));
                
                 }
        }
            }catch(Exception Ex){}
    }
     
     public String[] takeImage()
     {
         File f= new File(getClass().getResource("/ImageSlides").getFile());
         String[] Images=f.list();
         return Images;
     }
     
     public void show(int index)
     {
       String[] Images=takeImage();
       String img=Images[index];
       ImageIcon icon=new ImageIcon(getClass().getResource("/ImageSlides/"+img));
       Image image=icon.getImage().getScaledInstance(ImgStati.getWidth(), ImgStati.getHeight(), Image.SCALE_SMOOTH);
       ImgStati.setIcon(new ImageIcon(image));
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
        jPanel2 = new javax.swing.JPanel();
        NBRProduit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TotalVente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NBRFactures = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ImgStati = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        NBRCmd = new javax.swing.JLabel();
        Inventaire = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Statistiques"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black), "Produits", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setOpaque(false);

        NBRProduit.setBackground(new java.awt.Color(255, 255, 255));
        NBRProduit.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        NBRProduit.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(NBRProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(NBRProduit, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 110, 250, 112);
        jPanel2.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setOpaque(false);

        TotalVente.setBackground(new java.awt.Color(255, 255, 255));
        TotalVente.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        TotalVente.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(TotalVente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalVente, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 240, 250, 110);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black), "Factures", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setOpaque(false);

        NBRFactures.setBackground(new java.awt.Color(255, 255, 255));
        NBRFactures.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        NBRFactures.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(NBRFactures, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(NBRFactures, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 370, 250, 110);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Les statistiques");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 0, 280, 80);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 80, 1160, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-next-page-40.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1090, 350, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-back-to-40.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 350, 40, 40);
        jPanel1.add(ImgStati);
        ImgStati.setBounds(350, 120, 725, 494);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black), "Commandes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel5.setOpaque(false);

        NBRCmd.setBackground(new java.awt.Color(255, 255, 255));
        NBRCmd.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        NBRCmd.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(NBRCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(NBRCmd, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 500, 250, 110);

        Inventaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-folder-40.png"))); // NOI18N
        Inventaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InventaireMousePressed(evt);
            }
        });
        jPanel1.add(Inventaire);
        Inventaire.setBounds(1090, 20, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/bg-5-full.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1160, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
      new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Statistiques.class.getName()).log(Level.SEVERE, null, ex);
        }
     int p=this.ImgStati.getX();
     
     if(p>-1)
     {
       Animacion.Animacion.mover_izquierda(900, 350, 1, 2, ImgStati);
     }
     position=position+1;
     if(position>=takeImage().length)
     {
     position=takeImage().length-1;
     }
     show(position);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
       new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Statistiques.class.getName()).log(Level.SEVERE, null, ex);
        }
     int p=this.ImgStati.getX();
     
     if(p>-1)
     {
       Animacion.Animacion.mover_izquierda(900, 350, 1, 2, ImgStati);
     }
     position=position-1;
     if(position<0)
     {
     position=0;
     }
     show(position);
                          
    }//GEN-LAST:event_jLabel3MousePressed

    private void InventaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventaireMousePressed

                 Consultations c=new Consultations();
                 c.setVisible(true);       
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
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistiques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgStati;
    private javax.swing.JLabel Inventaire;
    private javax.swing.JLabel NBRCmd;
    private javax.swing.JLabel NBRFactures;
    private javax.swing.JLabel NBRProduit;
    private javax.swing.JLabel TotalVente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
