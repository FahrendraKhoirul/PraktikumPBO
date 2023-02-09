
package prakpbo_uas_sem2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI extends javax.swing.JFrame {
    
    public UI() {
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/3 - getWidth(), dim.height/8 - getHeight());
        initComponents();
        tampilkan();
        reset();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userTag = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Done = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        OnProgress = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ToDo = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        Info_Judul = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        Info_Status = new javax.swing.JTextField();
        Info_Dl = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Info_Cat = new javax.swing.JTextPane();
        TombolNext = new java.awt.Button();
        TombolDel = new java.awt.Button();
        addTask = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel5.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(39, 39, 39));
        jLabel5.setText("Lets Do It");

        jScrollPane5.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 7.png"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel4.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel4.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 80));
        jLabel4.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 70));

        userTag.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        userTag.setForeground(new java.awt.Color(102, 102, 102));
        userTag.setText("Fahrendra Khoirul");
        jPanel1.add(userTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, 30));

        jLabel7.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 239, 196));
        jLabel7.setText("It");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 60, 30));

        jLabel3.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 157, 106));
        jLabel3.setText("Lets");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 30));

        jLabel6.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 132, 227));
        jLabel6.setText("Do");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));

        jLabel8.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(174, 173, 178));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Add Task");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 80, 30));

        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        userButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userButtonMouseClicked(evt);
            }
        });
        jPanel1.add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 50, 50));

        Done.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Done.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 20)); // NOI18N
        Done.setForeground(new java.awt.Color(39, 39, 39));
        Done.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Done);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 207, 296));

        OnProgress.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        OnProgress.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 20)); // NOI18N
        OnProgress.setForeground(new java.awt.Color(39, 39, 39));
        OnProgress.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        OnProgress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnProgressMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OnProgress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 207, 296));

        ToDo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ToDo.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 20)); // NOI18N
        ToDo.setForeground(new java.awt.Color(39, 39, 39));
        ToDo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ToDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToDoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ToDo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 207, 296));

        jPanel2.setBackground(new java.awt.Color(9, 132, 227));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        label2.setForeground(new java.awt.Color(39, 39, 39));
        label2.setText("On Progress");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(252, 157, 106));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        label1.setForeground(new java.awt.Color(39, 39, 39));
        label1.setText("To Do");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 207, -1));

        jPanel4.setBackground(new java.awt.Color(85, 239, 196));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        label3.setForeground(new java.awt.Color(39, 39, 39));
        label3.setText("Done");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        label4.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        label4.setForeground(new java.awt.Color(39, 39, 39));
        label4.setText("Info");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Info_Judul.setEditable(false);
        Info_Judul.setBackground(new java.awt.Color(255, 255, 255));
        Info_Judul.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 1, 18)); // NOI18N
        Info_Judul.setForeground(new java.awt.Color(39, 39, 39));
        Info_Judul.setText("-");
        Info_Judul.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Info_Judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_JudulActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(174, 173, 178));
        label5.setText("Status");

        label6.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(174, 173, 178));
        label6.setText("Deadline");

        Info_Status.setEditable(false);
        Info_Status.setBackground(new java.awt.Color(255, 255, 255));
        Info_Status.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        Info_Status.setForeground(new java.awt.Color(252, 157, 106));
        Info_Status.setText("-");
        Info_Status.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        Info_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_StatusActionPerformed(evt);
            }
        });

        Info_Dl.setEditable(false);
        Info_Dl.setBackground(new java.awt.Color(255, 255, 255));
        Info_Dl.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        Info_Dl.setForeground(new java.awt.Color(252, 157, 106));
        Info_Dl.setText("-");
        Info_Dl.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 1, 1, 1));

        Info_Cat.setEditable(false);
        Info_Cat.setFont(new java.awt.Font("Avenir LT Std 55 Roman", 0, 18)); // NOI18N
        Info_Cat.setForeground(new java.awt.Color(168, 170, 169));
        jScrollPane4.setViewportView(Info_Cat);

        TombolNext.setBackground(new java.awt.Color(9, 132, 227));
        TombolNext.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 14)); // NOI18N
        TombolNext.setForeground(new java.awt.Color(255, 255, 255));
        TombolNext.setLabel("LETS DO IT");
        TombolNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolNextActionPerformed(evt);
            }
        });

        TombolDel.setBackground(new java.awt.Color(225, 118, 118));
        TombolDel.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 14)); // NOI18N
        TombolDel.setForeground(new java.awt.Color(255, 255, 255));
        TombolDel.setLabel("DELETE");
        TombolDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolDelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Info_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Info_Dl))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(TombolDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TombolNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Info_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Info_Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Info_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Info_Dl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TombolNext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TombolDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label5.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 300));

        addTask.setBackground(new java.awt.Color(255, 255, 255));
        addTask.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        addTask.setForeground(new java.awt.Color(85, 239, 196));
        addTask.setLabel("+");
        addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskActionPerformed(evt);
            }
        });
        jPanel1.add(addTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 63, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 10.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -310, 1160, 1110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Info_JudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_JudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Info_JudulActionPerformed

    private void Info_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Info_StatusActionPerformed

    private void addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskActionPerformed
       Add a = new Add(userTag.getText());
       a.setVisible(true);
    }//GEN-LAST:event_addTaskActionPerformed

    private void ToDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToDoMouseClicked
        Info_Judul.setText("-");
        Info_Status.setText("-");
        Info_Status.setForeground(new java.awt.Color(252, 157, 106));
        Info_Dl.setText("-");
        Info_Dl.setForeground(new java.awt.Color(252, 157, 106));
        TombolNext.setBackground(new java.awt.Color(9, 132, 227));
        TombolNext.setLabel("LETS DO IT");
        int i = ToDo.getSelectedIndex();
        Info_Judul.setText(ToDo.getSelectedValue());
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            ResultSet rstodo = con.createStatement().executeQuery("SELECT * FROM todo");
            while(rstodo.next()){
                if(rstodo.getString(1).equals(Info_Judul.getText())){
                    Info_Status.setText(rstodo.getString(2));
                    Info_Status.setForeground(new java.awt.Color(252, 157, 106));
                    Info_Dl.setText(rstodo.getString(3));
                    Info_Dl.setForeground(new java.awt.Color(252, 157, 106));
                    Info_Cat.setText(rstodo.getString(4));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        TombolNext.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_ToDoMouseClicked

    private void OnProgressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnProgressMouseClicked
        Info_Judul.setText("-");
        Info_Status.setText("-");
        Info_Status.setForeground(new java.awt.Color(9,132,227));
        Info_Dl.setText("-");
        Info_Dl.setForeground(new java.awt.Color(9,132,227));
        TombolNext.setBackground(new java.awt.Color(85, 239, 196));
        TombolNext.setLabel("Done");
        int i = OnProgress.getSelectedIndex();
        Info_Judul.setText(OnProgress.getSelectedValue());
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            ResultSet rsonprogress = con.createStatement().executeQuery("SELECT * FROM onprogress");
            while(rsonprogress.next()){
                if(rsonprogress.getString(1).equals(Info_Judul.getText())){
                    Info_Status.setText(rsonprogress.getString(2));
                    Info_Status.setForeground(new java.awt.Color(9,132,227));
                    Info_Dl.setText(rsonprogress.getString(3));
                    Info_Dl.setForeground(new java.awt.Color(9,132,227));
                    Info_Cat.setText(rsonprogress.getString(4));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        TombolNext.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_OnProgressMouseClicked

    private void TombolDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolDelMouseClicked
        Task del = new Task(Info_Judul.getText(),Info_Dl.getText(),Info_Cat.getText(),Info_Status.getText(), userTag.getText());
        del.delete();
        tampilkan();
        reset();
    }//GEN-LAST:event_TombolDelMouseClicked

    private void DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseClicked
        Info_Judul.setText("-");
        Info_Status.setText("-");
        Info_Status.setForeground(new java.awt.Color(85, 239, 196));
        Info_Dl.setText("-");
        Info_Dl.setForeground(new java.awt.Color(85, 239, 196));
        int i = Done.getSelectedIndex();
        Info_Judul.setText(Done.getSelectedValue());
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            ResultSet rsdone = con.createStatement().executeQuery("SELECT * FROM done");
            while(rsdone.next()){
                if(rsdone.getString(1).equals(Info_Judul.getText())){
                    Info_Status.setText(rsdone.getString(2));
                    Info_Status.setForeground(new java.awt.Color(85, 239, 196));
                    Info_Dl.setText(rsdone.getString(3));
                    Info_Dl.setForeground(new java.awt.Color(85, 239, 196));
                    Info_Cat.setText(rsdone.getString(4));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        TombolNext.setVisible(false);
        tampilkan();
    }//GEN-LAST:event_DoneMouseClicked

    private void TombolNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolNextActionPerformed
        if(Info_Status.getText().equals("To Do")){
            Task taskSesudah = new Task (Info_Judul.getText(), Info_Dl.getText(), Info_Cat.getText(), "On Progress", userTag.getText());
            Task taskSebelum = new Task (Info_Judul.getText(), Info_Dl.getText(), Info_Cat.getText(), "To Do", userTag.getText());
            taskSesudah.insert("Without Notif");
            taskSebelum.delete("Without Notif");
            TombolNext.setBackground(new java.awt.Color(85, 239, 196));
            TombolNext.setLabel("Done");
        } else if(Info_Status.getText().equals("On Progress")){
            Task taskSesudah = new Task (Info_Judul.getText(), Info_Dl.getText(), Info_Cat.getText(), "Done", userTag.getText());
            Task taskSebelum = new Task (Info_Judul.getText(), Info_Dl.getText(), Info_Cat.getText(), "On Progress", userTag.getText());
            taskSesudah.insert("Without Notif");
            taskSebelum.delete("Without Notif");
            TombolNext.setBackground(new java.awt.Color(85, 239, 196));
            TombolNext.setLabel("Done");
        }
        tampilkan();
    }//GEN-LAST:event_TombolNextActionPerformed

    private void userButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseClicked
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_userButtonMouseClicked

    public void tampilkan(){
        DefaultListModel<String> forTodo = new DefaultListModel<>(); 
        DefaultListModel<String> forOnprogress = new DefaultListModel<>(); 
        DefaultListModel<String> forDone = new DefaultListModel<>(); 
        
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            ResultSet rstodo = con.createStatement().executeQuery("SELECT * FROM todo WHERE user='"+userTag.getText()+"'");
            ResultSet rsonprogress = con.createStatement().executeQuery("SELECT * FROM onprogress WHERE user='"+userTag.getText()+"'");
            ResultSet rsdone = con.createStatement().executeQuery("SELECT * FROM done WHERE user='"+userTag.getText()+"'");
            
            while(rstodo.next()){
                String temp = rstodo.getString(1);
                forTodo.addElement(temp);
            }
            while(rsonprogress.next()){
                String temp1 = rsonprogress.getString(1);
                forOnprogress.addElement(temp1);
            }
            while(rsdone.next()){
                String temp2 = rsdone.getString(1);
                forDone.addElement(temp2);
            }
            ToDo.setModel(forTodo);
            OnProgress.setModel(forOnprogress);
            Done.setModel(forDone);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Tampilkan Gagal");
        }
    }
    
    public void reset(){
        Info_Judul.setText("-");
        Info_Status.setText("-");
        Info_Dl.setText("-");
        Info_Cat.setText("-");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Done;
    private javax.swing.JTextPane Info_Cat;
    private javax.swing.JTextField Info_Dl;
    private javax.swing.JTextField Info_Judul;
    private javax.swing.JTextField Info_Status;
    private javax.swing.JList<String> OnProgress;
    private javax.swing.JList<String> ToDo;
    private java.awt.Button TombolDel;
    private java.awt.Button TombolNext;
    private java.awt.Button addTask;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JButton userButton;
    public javax.swing.JLabel userTag;
    // End of variables declaration//GEN-END:variables
}
