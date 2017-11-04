/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistik.kuadratterkecil;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class KuadratTerkecil extends javax.swing.JFrame {

    private List<JTextField> listX = new ArrayList<JTextField>();
    private List<JTextField> listY = new ArrayList<JTextField>();
    private int rowCount = 0;
    
    /**
     * Creates new form KuadratTerkecil
     */
    public KuadratTerkecil() {
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

        btnTambahBaris = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHasil = new javax.swing.JButton();
        mainContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHasil = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        res1 = new javax.swing.JLabel();
        res2 = new javax.swing.JLabel();
        res3 = new javax.swing.JLabel();
        txCariWaktu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnTambahBaris.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnTambahBaris.setText("Tambah Baris");
        btnTambahBaris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahBarisMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Seri Waktu");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Trend");

        btnHasil.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnHasil.setText("Hasil");
        btnHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHasilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        tblHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tahun", "X", "Y", "XY", "X^2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHasil);

        jLabel4.setText("Y = A + BX");

        jLabel5.setText("= ΣY/n + ΣXY/ΣX^2 * X");

        jLabel6.setText("----------------->");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("A = ΣY/n");

        jLabel8.setText("B = ΣXY/ΣX^2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        res1.setText("= ? + ? * ?");

        res2.setText("= ? + ?");

        res3.setText("= ?");

        jLabel9.setText("Cari Waktu");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Tabel Perhitungan");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setText("Rumus & Hasil Perhitungan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(84, 84, 84))
                        .addComponent(btnHasil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambahBaris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txCariWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5)
                                    .addComponent(res1)
                                    .addComponent(res2)
                                    .addComponent(res3))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(35, 35, 35)))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(res1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(res2))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(res3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txCariWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahBaris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHasil)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahBarisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahBarisMouseClicked
        // TODO add your handling code here:
        add();
    }//GEN-LAST:event_btnTambahBarisMouseClicked

    private void btnHasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHasilMouseClicked
        // TODO add your handling code here:
        proc();
    }//GEN-LAST:event_btnHasilMouseClicked

    private void add() {
        int fromTop = (30 * rowCount);
        int width = mainContainer.getWidth()/2;
        int height = 30;
        
        JTextField txItemX = new JTextField();
        txItemX.setBounds(0,fromTop,width,height);
        JTextField txItemY = new JTextField();
        txItemY.setBounds(mainContainer.getWidth()/2,fromTop,width,height);
        txItemY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
                if(e.getKeyCode() == e.VK_ENTER) {
                    add();
                }
            }
        });
        
        listX.add(txItemX);
        listY.add(txItemY);
        
        mainContainer.add(txItemX);
        mainContainer.add(txItemY);
        mainContainer.repaint();
        txItemX.requestFocus();
        rowCount++;
    }
    
    private void proc() {
        int n = listX.size();
        DefaultTableModel dm = new DefaultTableModel(0,0);
        String header[] = new String[] {"Tahun","Y","X","XY","X^2"};
        dm.setColumnIdentifiers(header);
        tblHasil.setModel(dm);
        int awal,akhir;
        if(n % 2 == 0) {
            // genap
            // TODO : Fungsi generate range tanpa 0
            awal = -4;
            akhir = 4;
        } else {
            // ganjil
            awal = -((n - 1) / 2);
            akhir = -awal;
        }
        
        float sY = 0;
        float sX = 0;
        float sXY = 0;
        float sX2 = 0;
        
        int[] xs = IntStream.rangeClosed(awal,akhir).toArray();
        int cari = Integer.valueOf(txCariWaktu.getText());
        int xCari;
        int nilaiWaktuAkhir = Integer.valueOf(listX.get(listX.size() - 1).getText());
        int nilaiWaktuAwal = Integer.valueOf(listX.get(0).getText());
        if(cari > nilaiWaktuAkhir){
            xCari = (cari - nilaiWaktuAkhir) + xs[xs.length -1];
        } else {
            xCari = (cari - nilaiWaktuAwal) + xs[0];
        }
        
        for(int i=0;i<n;i++) {
            JTextField itemX = listX.get(i);
            JTextField itemY = listY.get(i);
            int tahun = Integer.valueOf(itemX.getText());
            int x = xs[i];
            int y = Integer.valueOf(itemY.getText());
            int xy = x*y;
            int x2 = (int) Math.pow(x, 2);
            
            sY += y;
            sX += x;
            sXY += xy;
            sX2 += x2;
            
            Vector<Object> data = new Vector<Object>();
            data.add(itemX.getText());
            data.add(itemY.getText());
            data.add(x);
            data.add(xy);
            data.add(x2);
            dm.addRow(data);
        }
        
        Vector<Object> footer = new Vector<Object>();
        footer.add("Jumlah");
        footer.add(sY);
        footer.add(sX);
        footer.add(sXY);
        footer.add(sX2);
        dm.addRow(footer);
        
        res1.setText("= " + String.valueOf(sY/(float)n) + " + " + String.valueOf(sXY/sX2) + " * " + String.valueOf(xCari));
        res2.setText("= " + String.valueOf(sY/(float)n) + " + " + String.valueOf((sXY/sX2) * xCari));
        res3.setText("= " + String.valueOf((sY/(float)n) + ((sXY/sX2)*xCari)));
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
            java.util.logging.Logger.getLogger(KuadratTerkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KuadratTerkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KuadratTerkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KuadratTerkecil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KuadratTerkecil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnTambahBaris;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JLabel res1;
    private javax.swing.JLabel res2;
    private javax.swing.JLabel res3;
    private javax.swing.JTable tblHasil;
    private javax.swing.JTextField txCariWaktu;
    // End of variables declaration//GEN-END:variables
}
