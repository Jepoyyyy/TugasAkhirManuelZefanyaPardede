/*#modul yang digunakan
-modul 1:Varibel
-modul 2:Switch Case & If
-modul 4:Private 
-modul 5:OOP
-modul 6:setter dan getter
-modul 8:GUI
*/
package tugasakhir1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {
        String pilihan;
        int harga_barang;
        int jmlh_bayar;
        int bayar,beli,Harga;
        String Hasil;
        /**
     * 
     * Creates new form NewJFrame
     */
    public Main() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        batal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textharga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalHRG = new javax.swing.JTextField();
        hitungharga = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textBYR = new javax.swing.JTextField();
        btnkembalian = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textBalik = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.pink);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOKO JAM SAMPURNA");

        jLabel7.setBackground(new java.awt.Color(0, 153, 51));
        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel7.setText("Nama Barang :");
        jLabel7.setToolTipText("");

        ComboBox.setFont(new java.awt.Font("Cambria Math", 0, 8
        ));
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Rolex", "G-Shock", "DW", "Casio" }));
        ComboBox.setToolTipText("");
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        batal.setBackground(java.awt.Color.white);
        batal.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        batal.setText("Batal");
        batal.setToolTipText("");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel2.setText("Harga Barang :");
        jLabel2.setToolTipText("");

        textharga.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        textharga.setForeground(new java.awt.Color(0, 0, 1));
        textharga.setToolTipText("");
        textharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texthargaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel3.setText("Jumlah              :");
        jLabel3.setToolTipText("");

        Jumlah.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        Jumlah.setToolTipText("");
        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel4.setText("Total Harga    :");
        jLabel4.setToolTipText("");

        totalHRG.setEditable(false);
        totalHRG.setBackground(java.awt.Color.white);
        totalHRG.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        totalHRG.setToolTipText("");
        totalHRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHRGActionPerformed(evt);
            }
        });

        hitungharga.setBackground(java.awt.Color.white);
        hitungharga.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        hitungharga.setText("Hitung Jumlah Harga");
        hitungharga.setToolTipText("");
        hitungharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitunghargaActionPerformed(evt);
            }
        });

        keluar.setBackground(java.awt.Color.white);
        keluar.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        keluar.setText("Keluar");
        keluar.setToolTipText("");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel5.setText("Jumlah Bayar");
        jLabel5.setToolTipText("");

        textBYR.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        textBYR.setToolTipText("");
        textBYR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBYRActionPerformed(evt);
            }
        });

        btnkembalian.setBackground(java.awt.Color.white);
        btnkembalian.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        btnkembalian.setText("Bayar ");
        btnkembalian.setToolTipText("");
        btnkembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembalianActionPerformed(evt);
            }
        });

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        jLabel6.setText("Jumlah Kembalian");
        jLabel6.setToolTipText("");

        textBalik.setEditable(false);
        textBalik.setBackground(java.awt.Color.white);
        textBalik.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        textBalik.setToolTipText("");
        textBalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBalikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textharga)
                    .addComponent(ComboBox, 0, 383, Short.MAX_VALUE)
                    .addComponent(Jumlah)
                    .addComponent(totalHRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textBalik, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitungharga))
                        .addGap(44, 44, 44))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(textBYR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5)
                        .addGap(76, 76, 76)
                        .addComponent(btnkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keluar)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalHRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitungharga))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnkembalian)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBYR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBalik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texthargaActionPerformed
        
    }//GEN-LAST:event_texthargaActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        
       
        
    }//GEN-LAST:event_JumlahActionPerformed

    private void totalHRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHRGActionPerformed
        
    }//GEN-LAST:event_totalHRGActionPerformed

    private void textBYRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBYRActionPerformed
        
    }//GEN-LAST:event_textBYRActionPerformed

    private void textBalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBalikActionPerformed
        
    }//GEN-LAST:event_textBalikActionPerformed

    private void hitunghargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitunghargaActionPerformed
        // TODO add your handling code here:
        Harga =Integer.parseInt(textharga.getText());
        beli = Integer.parseInt(Jumlah.getText());
        
        bayar = Harga * beli;
        
        DecimalFormat angka = new DecimalFormat("###,###");
        totalHRG.setText(""+Integer.toString(bayar));
    }//GEN-LAST:event_hitunghargaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
        pilihan = (String) ComboBox.getSelectedItem();
        switch (pilihan) {
            case "DW":
                harga_barang = 1000;
                break;
            case "G-Shock" :
                harga_barang = 1200;
                break;
            case "Casio" :
                harga_barang = 15000;
                break;
            case "Rolex" :
                harga_barang = 50000;
             
                
        }
        textharga.setText(""+Integer.toString(harga_barang));
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void btnkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembalianActionPerformed
        // TODO add your handling code here:
        int JumlahBayar = Integer.parseInt(textBYR.getText());
        int TotalHarga = Integer.parseInt(totalHRG.getText());
        if(TotalHarga<=JumlahBayar){
       textBalik.setText(Integer.toString(JumlahBayar-TotalHarga));
        }
        else {
            textBalik.setText("Uang anda Kurang");
        }
    }//GEN-LAST:event_btnkembalianActionPerformed
    
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here: 
        //
        ComboBox.setSelectedIndex(0);
        textharga.setText("");
        Jumlah.setText("");
        totalHRG.setText("");
        textBYR.setText("");
        textBalik .setText("");
    }//GEN-LAST:event_batalActionPerformed
            
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JButton batal;
    private javax.swing.JButton btnkembalian;
    private javax.swing.JButton hitungharga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField textBYR;
    private javax.swing.JTextField textBalik;
    private javax.swing.JTextField textharga;
    private javax.swing.JTextField totalHRG;
    // End of variables declaration//GEN-END:variables
}