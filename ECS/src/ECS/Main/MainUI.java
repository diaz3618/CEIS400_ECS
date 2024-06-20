/**
 *
 * @author Nicholas Allen, Daniel F Diaz Santiago, Vaanitya Sangwan
 */
package ECS.Main;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;  // Unused because the line is commented out
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nicholas Allen
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainUI() {
        initComponents();
        setLocationRelativeTo(null);
        populate_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JMenuItem jMenuItem7 = new javax.swing.JMenuItem();
        javax.swing.JFrame jFrame1 = new javax.swing.JFrame();
        javax.swing.ButtonGroup btnGrpSearch = new javax.swing.ButtonGroup();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        javax.swing.JLabel lblInUse4 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator8 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
        javax.swing.JButton btnBeginCheckOut = new javax.swing.JButton();
        javax.swing.JButton btnBeginCheckIn = new javax.swing.JButton();
        javax.swing.JButton btnReportLost = new javax.swing.JButton();
        javax.swing.JButton btnReportFound = new javax.swing.JButton();
        javax.swing.JButton btnReportDamaged = new javax.swing.JButton();
        javax.swing.JLabel lblInUse5 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator9 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btnModifyEmp_MGMT = new javax.swing.JButton();
        javax.swing.JButton btnAddEmp_MGMT = new javax.swing.JButton();
        javax.swing.JButton btnOverrides_MGMT = new javax.swing.JButton();
        javax.swing.JButton btnAuthorization_MGMT = new javax.swing.JButton();
        javax.swing.JButton btnVerifyMGMT = new javax.swing.JButton();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblInUse = new javax.swing.JLabel();
        scrCheckOutList = new javax.swing.JScrollPane();
        checkout_table = new javax.swing.JTable();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btnViewInvt = new javax.swing.JButton();
        javax.swing.JScrollPane scrViewInv = new javax.swing.JScrollPane();
        javax.swing.JTextArea txaViewInv = new javax.swing.JTextArea();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator5 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem login_menu_item = new javax.swing.JMenuItem();
        javax.swing.JMenuItem logout_menu_item = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator6 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem jMenuItem5 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator7 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem jMenuItem8 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
        javax.swing.JMenuItem mnuEmpList = new javax.swing.JMenuItem();
        javax.swing.JMenu mnuAddEquip = new javax.swing.JMenu();
        javax.swing.JMenuItem muiOpenEquipUI = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipment Checkout System");

        lblInUse4.setText("Check-In/Check-Out");

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        btnBeginCheckOut.setText("Begin Check-Out");
        btnBeginCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginCheckOutActionPerformed(evt);
            }
        });

        btnBeginCheckIn.setText("Begin Check-In");
        btnBeginCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginCheckInActionPerformed(evt);
            }
        });

        btnReportLost.setText("Report Lost Item");

        btnReportFound.setText("Report Item Found");
        btnReportFound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportFoundActionPerformed(evt);
            }
        });

        btnReportDamaged.setText("Report Damaged Item");
        btnReportDamaged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportDamagedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBeginCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBeginCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportLost, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportFound, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportDamaged, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBeginCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeginCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportLost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportFound, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportDamaged, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInUse5.setText("Managment");

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        btnModifyEmp_MGMT.setText("Modify Employee");
        btnModifyEmp_MGMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyEmp_MGMTActionPerformed(evt);
            }
        });

        btnAddEmp_MGMT.setText("Add Employee");
        btnAddEmp_MGMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmp_MGMTActionPerformed(evt);
            }
        });

        btnOverrides_MGMT.setText("Overrides");

        btnAuthorization_MGMT.setText("Authorization");

        btnVerifyMGMT.setText("Verify MGMT");
        btnVerifyMGMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyMGMTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerifyMGMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddEmp_MGMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifyEmp_MGMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOverrides_MGMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAuthorization_MGMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmp_MGMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyEmp_MGMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAuthorization_MGMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOverrides_MGMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerifyMGMT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInUse.setText("Current Checked-Out List");

        scrCheckOutList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        checkout_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Transaction ID", "Equipment ID", "Equipment Name", "Equipment Description", "Check Out Date", "Due In Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        checkout_table.setShowGrid(false);
        checkout_table.setShowHorizontalLines(true);
        scrCheckOutList.setViewportView(checkout_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrCheckOutList)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInUse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInUse)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrCheckOutList, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrCheckOutList.getAccessibleContext().setAccessibleName("checkoutQueue");

        btnViewInvt.setText("View Inventory");
        btnViewInvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInvtActionPerformed(evt);
            }
        });

        txaViewInv.setEditable(false);
        txaViewInv.setColumns(4);
        txaViewInv.setRows(25);
        scrViewInv.setViewportView(txaViewInv);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrViewInv)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnViewInvt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewInvt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrViewInv, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblInUse4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblInUse5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInUse4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInUse5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem2.setText("Run Daily Reports");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator5);

        login_menu_item.setText("Login");
        login_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_menu_itemActionPerformed(evt);
            }
        });
        jMenu1.add(login_menu_item);

        logout_menu_item.setText("Logout");
        jMenu1.add(logout_menu_item);

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Check/Report");

        jMenuItem3.setText("Check-Out");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Check-In");
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator6);

        jMenuItem5.setText("Report Lost");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Report Damaged");
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator7);

        jMenuItem8.setText("Report Found");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        mnuEmpList.setText("jMenuItem9");
        mnuEmpList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpListActionPerformed(evt);
            }
        });
        jMenu3.add(mnuEmpList);

        jMenuBar1.add(jMenu3);

        mnuAddEquip.setText("Add Equipment");

        muiOpenEquipUI.setText("Open");
        muiOpenEquipUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muiOpenEquipUIActionPerformed(evt);
            }
        });
        mnuAddEquip.add(muiOpenEquipUI);

        jMenuBar1.add(mnuAddEquip);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnBeginCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginCheckOutActionPerformed
        CheckOutUI checkOutFrame = new CheckOutUI();  // Create a new instance of CheckOutUI
        checkOutFrame.setVisible(true);  // Make the CheckOutUI visible
        checkOutFrame.setLocationRelativeTo(null);  // Center the CheckOutUI on the screen
    }//GEN-LAST:event_btnBeginCheckOutActionPerformed

    private void btnBeginCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginCheckInActionPerformed
        CheckInUI checkInFrame = new CheckInUI();
        checkInFrame.setVisible(true);
        checkInFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBeginCheckInActionPerformed

    private void btnReportDamagedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportDamagedActionPerformed
        ReportDamagedUI newFrame = new ReportDamagedUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportDamagedActionPerformed

    private void btnModifyEmp_MGMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyEmp_MGMTActionPerformed
        ModifyEmployeeUI newFrame = new ModifyEmployeeUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModifyEmp_MGMTActionPerformed

    private void btnAddEmp_MGMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmp_MGMTActionPerformed
        AddEmployeeUI newFrame = new AddEmployeeUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddEmp_MGMTActionPerformed

    private void btnVerifyMGMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyMGMTActionPerformed
        VerifyManagementUI newFrame = new VerifyManagementUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnVerifyMGMTActionPerformed

    private void btnReportFoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportFoundActionPerformed
        ReportFoundUI newFrame = new ReportFoundUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnReportFoundActionPerformed

    private void mnuEmpListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpListActionPerformed
        ViewEmployeeUI newFrame = new ViewEmployeeUI();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnuEmpListActionPerformed

    private void btnViewInvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInvtActionPerformed
        // Calling the viewInv method to get the text area for View Inventory
        String inventoryData = Equipment.viewInv();
        if (inventoryData.startsWith("Failed") || inventoryData.startsWith("An unexpected")) {
            JOptionPane.showMessageDialog(this, inventoryData, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        txaViewInv.setText(inventoryData);
        }
    }//GEN-LAST:event_btnViewInvtActionPerformed

    private void muiOpenEquipUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muiOpenEquipUIActionPerformed
        AddEquipmentUI equipmentUI = new AddEquipmentUI();
        equipmentUI.setVisible(true);
        equipmentUI.setLocationRelativeTo(null);
    }//GEN-LAST:event_muiOpenEquipUIActionPerformed

    private void login_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_menu_itemActionPerformed
        LoginUI login_ui = new LoginUI();
        login_ui.setVisible(true);
    }//GEN-LAST:event_login_menu_itemActionPerformed

    private void populate_table() {
        final String DB_URL = "jdbc:mysql://localhost:3306/CEIS400_group_project";
        final String DB_USER = "groupc";
        final String DB_PASSWORD = "oI209[^X`XHF";

        // Hashmap for equipment descriptions, NEEDS TO BE UPDATED
        // Fill this.
        HashMap<Integer, String> equipment_descriptions = new HashMap<>();
        equipment_descriptions.put(1, "DESCRIPTION 1");
        equipment_descriptions.put(2, "DESCRIPTION 2");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Fetch checkout and employee details
            String sql = "SELECT c.TransactionID, c.emp_id, e.FirstName, e.LastName, c.EquipmentID, c.CheckoutDate, c.ReturnDate "
                    + "FROM CEIS400_group_project.Checkout c "
                    + "JOIN CEIS400_group_project.Employee e ON c.emp_id = e.emp_id";
            pstmt = conn.prepareStatement(sql);

            // Execute query
            rs = pstmt.executeQuery();

            // Get the table model
            DefaultTableModel tableModel = (DefaultTableModel) checkout_table.getModel();

            // Clear existing rows in the table
            tableModel.setRowCount(0);

            // Process results and add to table model
            while (rs.next()) {
                int transaction_id = rs.getInt("TransactionID");
                int emp_id = rs.getInt("empID");
                String first_name = rs.getString("FirstName");
                String last_name = rs.getString("LastName");
                int equipment_id = rs.getInt("EquipmentID");
                String checkout_date = rs.getDate("CheckoutDate").toString();
                String return_date = rs.getDate("ReturnDate") != null ? rs.getDate("ReturnDate").toString() : "";
                String equipment_name = "Equipment " + equipment_id; // Placeholder for actual equipment name
                String equipment_description = equipment_descriptions.getOrDefault(equipment_id, "Unknown");

                tableModel.addRow(new Object[]{emp_id, first_name + " " + last_name, transaction_id, equipment_id, 
                    equipment_name, equipment_description, checkout_date, return_date});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            // Commented this out because my DB is empty. It keeps showing this error every time I run it.
            //JOptionPane.showMessageDialog(this, "Error fetching check-out data.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    private javax.swing.JTextArea txaViewInv;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable checkout_table;
    javax.swing.JScrollPane scrCheckOutList;
    // End of variables declaration//GEN-END:variables
}
