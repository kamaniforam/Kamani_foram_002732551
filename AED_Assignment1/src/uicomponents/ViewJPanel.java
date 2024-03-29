package uicomponents;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmployeeDetails;
import model.EmployeeHistory;

/**
 *
 * @author foram
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory history;

    public ViewJPanel(EmployeeDetails employee) {
        initComponents();
    }

    public ViewJPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpNameLbl = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        EmpIdLbl = new javax.swing.JLabel();
        AgeLbl = new javax.swing.JLabel();
        startDate = new javax.swing.JTextField();
        GenderLbl = new javax.swing.JLabel();
        level = new javax.swing.JTextField();
        StartDateLbl = new javax.swing.JLabel();
        teamInfo = new javax.swing.JTextField();
        LevelLbl = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        TeamInfoLbl = new javax.swing.JLabel();
        phoneNo = new javax.swing.JTextField();
        PositionTitleLbl = new javax.swing.JLabel();
        EmailLbl = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        CellLbl = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();
        viewTable = new javax.swing.JScrollPane();
        viewJTable = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        View = new javax.swing.JButton();
        dropdown = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();
        search = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        EmpNameLbl.setText("Employee Name:");

        EmpIdLbl.setText("Employee Id:");

        AgeLbl.setText("Age:");

        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });

        GenderLbl.setText("Gender");

        StartDateLbl.setText("Start Date:");

        LevelLbl.setText("Level:");

        TeamInfoLbl.setText("Team Info:");

        PositionTitleLbl.setText("Position Title:");

        EmailLbl.setText("Email Address:");

        CellLbl.setText("Cell Phone Number:");

        empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameActionPerformed(evt);
            }
        });

        Title.setBackground(new java.awt.Color(0, 153, 153));
        Title.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("VIEW EMPLOYEE DETAIL");

        photo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), null));

        viewJTable.setAutoCreateRowSorter(true);
        viewJTable.setBackground(new java.awt.Color(204, 204, 204));
        viewJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), null));
        viewJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp Name", "Emp Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone No", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        viewTable.setViewportView(viewJTable);

        Update.setBackground(new java.awt.Color(153, 153, 153));
        Update.setText("UPDATE");
        Update.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(153, 153, 153));
        Delete.setText("DELETE");
        Delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(153, 153, 153));
        View.setText("VIEW");
        View.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Female", "Male", "Others" }));

        btnsearch.setBackground(new java.awt.Color(153, 153, 153));
        btnsearch.setText("SEARCH");
        btnsearch.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Name", "Employee Id", "Email" }));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(153, 153, 153));
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewTable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmpNameLbl)
                                    .addComponent(StartDateLbl)
                                    .addComponent(GenderLbl)
                                    .addComponent(AgeLbl)
                                    .addComponent(EmpIdLbl))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(empName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PositionTitleLbl)
                                    .addComponent(TeamInfoLbl)
                                    .addComponent(LevelLbl)
                                    .addComponent(CellLbl)
                                    .addComponent(EmailLbl))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(level, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 64, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewTable, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpNameLbl)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpIdLbl)
                            .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeLbl)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderLbl)
                            .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StartDateLbl)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PositionTitleLbl)
                            .addGap(58, 58, 58))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LevelLbl))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TeamInfoLbl))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CellLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailLbl))))
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateActionPerformed

    private void empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        int selectedRowIndex = viewJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
        EmployeeDetails selectedEmp = (EmployeeDetails) model.getValueAt(selectedRowIndex, 0);

        history.deleteEmployee(selectedEmp);

        JOptionPane.showMessageDialog(this, "Employee Profile Deleted");
        populateTable();

        empName.setText("");
        empId.setText("");
        age.setText("");
        dropdown.setSelectedIndex(0);
        startDate.setText("");
        level.setText("");
        teamInfo.setText("");
        position.setText("");
        phoneNo.setText("");
        email.setText("");
        photo.setIcon(null);
    }//GEN-LAST:event_DeleteActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
        EmployeeDetails selectedEmp = (EmployeeDetails) model.getValueAt(selectedRowIndex, 0);

        empName.setText(selectedEmp.getEmpName());
        empId.setText(selectedEmp.getEmpId());
        age.setText(String.valueOf(selectedEmp.getAge()));
        dropdown.setSelectedItem(selectedEmp.getGender());
        startDate.setText(String.valueOf(selectedEmp.getStartDate()));
        level.setText(selectedEmp.getLevel());
        teamInfo.setText(selectedEmp.getTeamInfo());
        position.setText(selectedEmp.getPositionTitle());
        phoneNo.setText(String.valueOf(selectedEmp.getPhoneNo()));
        email.setText(selectedEmp.getEmailId());
        photo.setIcon(selectedEmp.getPhoto());
    
    }//GEN-LAST:event_ViewActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
        if (viewJTable.getSelectedRowCount() == 1) {
            String name = empName.getText();
            String id = empId.getText();
            int ageOfEmployee = Integer.parseInt(age.getText());
            String genderOfEmployee = (String) dropdown.getSelectedItem();
            String date = startDate.getText();
            String levelEmp = level.getText();
            String teamin = teamInfo.getText();
            String pos = position.getText();
            long cont = Long.parseLong(phoneNo.getText());
            String ema = email.getText();

            model.setValueAt(name, viewJTable.getSelectedRow(), 0);
            model.setValueAt(id, viewJTable.getSelectedRow(), 1);
            model.setValueAt(ageOfEmployee, viewJTable.getSelectedRow(), 2);
            model.setValueAt(genderOfEmployee, viewJTable.getSelectedRow(), 3);
            model.setValueAt(date, viewJTable.getSelectedRow(), 4);
            model.setValueAt(levelEmp, viewJTable.getSelectedRow(), 5);
            model.setValueAt(teamin, viewJTable.getSelectedRow(), 6);
            model.setValueAt(pos, viewJTable.getSelectedRow(), 7);
            model.setValueAt(cont, viewJTable.getSelectedRow(), 8);
            model.setValueAt(ema, viewJTable.getSelectedRow(), 9);
            
            JOptionPane.showMessageDialog(this, "Employee Details Updated!");
        } else {
            if (viewJTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to Update!");
            }
        }
        
        

    }//GEN-LAST:event_UpdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String name = empName.getText();
        String id = empId.getText();
        String emailAdd = email.getText();

        DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
        model.setRowCount(0);

        for (EmployeeDetails ed : history.getHistory()) {
            Object[] row = new Object[10];

            row[0] = ed;
            
            if (ed.getEmpName().equals(name) || ed.getEmpId().equals(id) || ed.getEmailId().equals(emailAdd)) {
                row[1] = ed.getEmpId();
                row[2] = ed.getAge();
                row[3] = ed.getGender();
                row[4] = ed.getStartDate();
                row[5] = ed.getLevel();
                row[6] = ed.getTeamInfo();
                row[7] = ed.getPositionTitle();
                row[8] = ed.getPhoneNo();
                row[9] = ed.getEmailId();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        empName.setText("");
        empId.setText("");
        age.setText("");
        startDate.setText("");
        level.setText("");
        teamInfo.setText("");
        position.setText("");
        phoneNo.setText("");
        email.setText("");
        photo.setIcon(null);
        dropdown.setSelectedIndex(0);
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLbl;
    private javax.swing.JLabel CellLbl;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JLabel EmpIdLbl;
    private javax.swing.JLabel EmpNameLbl;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel LevelLbl;
    private javax.swing.JLabel PositionTitleLbl;
    private javax.swing.JLabel StartDateLbl;
    private javax.swing.JLabel TeamInfoLbl;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JTextField age;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empId;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField level;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField position;
    private javax.swing.JComboBox<String> search;
    private javax.swing.JTextField startDate;
    private javax.swing.JTextField teamInfo;
    private javax.swing.JTable viewJTable;
    private javax.swing.JScrollPane viewTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewJTable.getModel();
        model.setRowCount(0);

        for (EmployeeDetails ed : history.getHistory()) {

            Object[] row = new Object[10];

            row[0] = ed;
            row[1] = ed.getEmpId();
            row[2] = ed.getAge();
            row[3] = ed.getGender();
            row[4] = ed.getStartDate();
            row[5] = ed.getLevel();
            row[6] = ed.getTeamInfo();
            row[7] = ed.getPositionTitle();
            row[8] = ed.getPhoneNo();
            row[9] = ed.getEmailId();
            model.addRow(row);

        }
    }
}
