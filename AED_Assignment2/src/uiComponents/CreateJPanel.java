/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents;

import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.House;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import validations.VerifyNumber;
import validations.VerifyString;

/**
 *
 * @author foram
 */
public class CreateJPanel extends javax.swing.JPanel {
    private javax.swing.JSplitPane jSplitPane1;

    /**
     * Creates new form CreateJPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hispDirectory;

    public CreateJPanel(PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory, javax.swing.JSplitPane jSplitPane1,HospitalDirectory hispDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.hispDirectory = hispDirectory;
        this.jSplitPane1 = jSplitPane1;
        addVerifiers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblPersonID = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPersonID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        ddCity = new javax.swing.JComboBox<>();
        ddCommunity = new javax.swing.JComboBox<>();
        ddHouseNumber = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        viewPerson = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Person Profile");

        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblPersonID.setText("Person ID");

        lblAddress.setText("Address:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        lblZipCode.setText("ZipCode:");

        lblHouseNumber.setText("House Number:");

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        ddCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a City", "Boston", "Newyork", "California" }));
        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        ddCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Community", "Boylston", "MissionMain", "MissionHill" }));
        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        ddHouseNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose House Number", "1", "2", "3", "4", "5", "6" }));

        btnSave.setText("Save Profile");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        viewPerson.setText("View");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonID)
                            .addComponent(lblName)
                            .addComponent(lblZipCode)
                            .addComponent(lblCommunity))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtZipCode)
                            .addComponent(txtName)
                            .addComponent(txtPersonID))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(lblAddress)
                            .addComponent(lblHouseNumber)
                            .addComponent(lblCity))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddHouseNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtAge)
                            .addComponent(ddCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(27, 27, 27)
                                .addComponent(viewPerson)))))
                .addGap(0, 128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonID)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNumber)
                    .addComponent(ddHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().isEmpty() || txtPersonID.getText().isEmpty()
                || txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
                || txtZipCode.getText().isEmpty() || ddCity.getSelectedItem() == null
                || ddCommunity.getSelectedItem() == null || ddHouseNumber.getSelectedItem() == null || ddCity.getSelectedIndex() == 0
                || ddCommunity.getSelectedIndex() == 0 || ddHouseNumber.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "All fields are Mandatory");
        } else {

            Person person = personDirectory.addNewPerson();
            House house = new House();

            person.setIdOfPerson(Integer.parseInt(txtPersonID.getText()));
            person.setAgeOfPerson(Integer.parseInt(txtAge.getText()));
            person.setNameOfPerson(txtName.getText());

            house.setStreetName(txtAddress.getText());
            house.setApartmentNumber(ddHouseNumber.getSelectedItem().toString());
            house.setNameOfCity(ddCity.getSelectedItem().toString());
            house.setNameOfCommunity(ddCommunity.getSelectedItem().toString());
            house.setZipCode(Integer.parseInt(txtZipCode.getText()));

            person.setHouse(house);
            JOptionPane.showMessageDialog(this, "Profile Saved");

        }

        txtPersonID.setText("");
        txtAge.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtZipCode.setText("");
        ddHouseNumber.setSelectedIndex(0);
        ddCity.setSelectedIndex(0);
        ddCommunity.setSelectedIndex(0);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPane = new ViewJPanel(personDirectory, patientDirectory, encounterHistory,jSplitPane1,hispDirectory);
        jSplitPane1.setRightComponent(viewPane);
    }//GEN-LAST:event_viewPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JComboBox<String> ddHouseNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonID;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JButton viewPerson;
    // End of variables declaration//GEN-END:variables

    private void addVerifiers() {
        InputVerifier integerVerifier = new VerifyNumber();
        txtPersonID.setInputVerifier(integerVerifier);
        txtAge.setInputVerifier(integerVerifier);
        txtZipCode.setInputVerifier(integerVerifier);
        
        InputVerifier stringVerifier = new VerifyString();
        txtName.setInputVerifier(stringVerifier);
        txtAddress.setInputVerifier(stringVerifier);
    }
}
