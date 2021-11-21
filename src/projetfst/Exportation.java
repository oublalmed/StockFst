/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfst;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Hp
 */
public class Exportation extends javax.swing.JFrame {

    /**
     * Creates new form Exportation
     */
    public Exportation() {
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

        jPanel1 = new javax.swing.JPanel();
        Excel = new javax.swing.JLabel();
        Word = new javax.swing.JLabel();
        Pdf = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-microsoft-excel-2019-100.png"))); // NOI18N
        Excel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Excel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExcelMousePressed(evt);
            }
        });
        jPanel1.add(Excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 111, 135));

        Word.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-microsoft-word-2019-100.png"))); // NOI18N
        Word.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WordMousePressed(evt);
            }
        });
        jPanel1.add(Word, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 114));

        Pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/icons8-pdf-100.png"))); // NOI18N
        Pdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PdfMousePressed(evt);
            }
        });
        jPanel1.add(Pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 89, 110));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 449, 10));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choisir l'outl pour exporter vos données ?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageProjet/bg-5-full.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PdfMousePressed

        MessageFormat header = new MessageFormat("Table d'inventaire des produits  ");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");

        try {

            boolean print = Inventaire.tab_InfosTotal.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException Ex) {
        }

    }//GEN-LAST:event_PdfMousePressed

    private void ExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcelMousePressed

        try {
            HSSFWorkbook fWorkbook = new HSSFWorkbook();
            HSSFSheet fSheet = fWorkbook.createSheet("new Sheet");
            HSSFFont sheetTitleFont = fWorkbook.createFont();
            File file = new File("C:\\Users\\Hp\\Desktop\\non complete\\Projet stage\\Rapports\\Test.xls");
            HSSFCellStyle cellStyle = fWorkbook.createCellStyle();

            //sheetTitleFont.setColor();
            TableModel model = Inventaire.tab_InfosTotal.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                HSSFRow fRow = fSheet.createRow((short) i);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    HSSFCell cell = fRow.createCell((short) j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                    cell.setCellStyle(cellStyle);

                }

            }
            FileOutputStream fileOutputStream;
            fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            fWorkbook.write(bos);
            bos.close();
            fileOutputStream.close();
            JOptionPane.showMessageDialog(this, "C'est fait ");
        } catch (Exception e) {

        }

    }//GEN-LAST:event_ExcelMousePressed

    private void WordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WordMousePressed

        String filePath = "C:\\Users\\Hp\\Desktop\\non complete\\Projet stage\\Rapports\\test.doc";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < Inventaire.tab_InfosTotal.getRowCount(); i++) {//rows
                for (int j = 0; j < Inventaire.tab_InfosTotal.getColumnCount(); j++) {//columns
                    bw.write(Inventaire.tab_InfosTotal.getValueAt(i, j).toString() + " | ");
                }
                bw.newLine();
                }

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "C'est fait ");

        } catch (IOException ex) {

        }

     }//GEN-LAST:event_WordMousePressed

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
            java.util.logging.Logger.getLogger(Exportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exportation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Excel;
    private javax.swing.JLabel Pdf;
    private javax.swing.JLabel Word;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
