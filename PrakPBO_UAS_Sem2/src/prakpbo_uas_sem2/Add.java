
package prakpbo_uas_sem2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Add extends javax.swing.JFrame {
    private String pengguna;
    public Add(String a) {
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        int lebar = dim.width/2 - 520/2;
        int tinggi = dim.height/2 - 450/2;
        setLocation( lebar, tinggi );
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pengguna = a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dlNT = new javax.swing.JTextField();
        planNT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteNT = new javax.swing.JTextArea();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(410, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 54, 54));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Task");

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(174, 173, 178));
        jLabel2.setText("What is your plan?");

        jLabel3.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 173, 178));
        jLabel3.setText("When is your deadlines?");

        jLabel4.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(174, 173, 178));
        jLabel4.setText("Write a note");

        dlNT.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        dlNT.setForeground(new java.awt.Color(54, 54, 54));
        dlNT.setToolTipText("");
        dlNT.setAutoscrolls(false);
        dlNT.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 173, 178), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        dlNT.setMargin(new java.awt.Insets(2, 10, 2, 2));
        dlNT.setName(""); // NOI18N
        dlNT.setSelectionColor(new java.awt.Color(51, 204, 255));
        dlNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlNTActionPerformed(evt);
            }
        });

        planNT.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        planNT.setForeground(new java.awt.Color(54, 54, 54));
        planNT.setToolTipText("");
        planNT.setAutoscrolls(false);
        planNT.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 173, 178), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        planNT.setMargin(new java.awt.Insets(2, 10, 2, 2));
        planNT.setName(""); // NOI18N
        planNT.setSelectionColor(new java.awt.Color(51, 204, 255));
        planNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planNTActionPerformed(evt);
            }
        });

        noteNT.setColumns(20);
        noteNT.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        noteNT.setForeground(new java.awt.Color(54, 54, 54));
        noteNT.setLineWrap(true);
        noteNT.setRows(5);
        noteNT.setWrapStyleWord(true);
        noteNT.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 173, 178), 1, true), javax.swing.BorderFactory.createEmptyBorder(7, 10, 7, 7)));
        jScrollPane1.setViewportView(noteNT);

        button1.setBackground(new java.awt.Color(9, 132, 227));
        button1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("CREATE");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(225, 118, 118));
        button2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlNT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planNT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(planNT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dlNT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dlNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlNTActionPerformed

    private void planNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planNTActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        UI ui = new UI();
        Task task = new Task(planNT.getText(), dlNT.getText(), noteNT.getText(), "To Do", pengguna);
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            ResultSet rstodo = con.createStatement().executeQuery("SELECT Judul FROM todo");
            boolean ada = false;
            while(rstodo.next() && ada == false){
                if(rstodo.getString(1).equals(planNT.getText())){
                    ada = true;
                    JOptionPane.showMessageDialog(null, "Nama Judul Sudah Digunakan");
                }
            }
            if(ada == false){
                task.insert();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JTextField dlNT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea noteNT;
    private javax.swing.JTextField planNT;
    // End of variables declaration//GEN-END:variables

   
}
