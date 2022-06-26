/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.gui;

import dao.AlumnoDAOSQL;
import dao.AlumnoDAOTXT;
import dao.DAO;
import dao.DAOAlumnoFactory;
import dao.DAOAlumnoFactoryException;
import dao.DAOException;
import java.awt.HeadlessException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import persona.Alumno;
import persona.AlumnoException;
import persona.PersonaException;

public class AlumnoGUI extends javax.swing.JFrame {

    private DAO<Alumno, Integer> dao;
    private AlumnoDAOSQL daoSQL;
    private AlumnoDAOTXT daoTXT;

    /**
     * Creates new form AlumnoGUI
     */
    public AlumnoGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Alumnos GUI");

        alumnoModel = new AlumnoModel();
        alumnosTable.setModel(alumnoModel);

        jPanel1.setVisible(false);
        urlDBTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repoComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alumnosTable = new javax.swing.JTable();
        verEliminadosRadioButton = new javax.swing.JRadioButton();
        agregarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        urlDBTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userDBTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordDBField = new javax.swing.JPasswordField();
        connDBButton = new javax.swing.JButton();
        pnlTXT = new javax.swing.JPanel();
        fileSystemButton = new javax.swing.JButton();
        fullPathTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        repoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TXT", "SQL" }));
        repoComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                repoComboBoxItemStateChanged(evt);
            }
        });
        repoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repoComboBoxActionPerformed(evt);
            }
        });

        alumnosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        alumnosTable.setEnabled(false);
        jScrollPane1.setViewportView(alumnosTable);

        verEliminadosRadioButton.setText("Ver Eliminados");
        verEliminadosRadioButton.setEnabled(false);
        verEliminadosRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                verEliminadosRadioButtonItemStateChanged(evt);
            }
        });
        verEliminadosRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEliminadosRadioButtonActionPerformed(evt);
            }
        });

        agregarButton.setText("Agregar");
        agregarButton.setEnabled(false);
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar");
        modificarButton.setEnabled(false);
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.setEnabled(false);
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        consultarButton.setText("Consultar");
        consultarButton.setEnabled(false);
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        urlDBTextField.setText("jdbc:mysql://localhost:33060/dao?serverTimezone=UTC");
        urlDBTextField.setToolTipText("");

        jLabel1.setText("URL");

        jLabel3.setText("Usuario");

        userDBTextField.setText("root");

        jLabel2.setText("Clave");

        connDBButton.setText("Conectar");
        connDBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connDBButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urlDBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userDBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordDBField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connDBButton)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlDBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(userDBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(passwordDBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connDBButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileSystemButton.setText("...");
        fileSystemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSystemButtonActionPerformed(evt);
            }
        });

        fullPathTextField.setEditable(false);
        fullPathTextField.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlTXTLayout = new javax.swing.GroupLayout(pnlTXT);
        pnlTXT.setLayout(pnlTXTLayout);
        pnlTXTLayout.setHorizontalGroup(
            pnlTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTXTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullPathTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(fileSystemButton)
                .addContainerGap())
        );
        pnlTXTLayout.setVerticalGroup(
            pnlTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTXTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileSystemButton)
                    .addComponent(fullPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(repoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eliminarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agregarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(verEliminadosRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(repoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verEliminadosRadioButton)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton)
                        .addGap(26, 26, 26)
                        .addComponent(modificarButton)
                        .addGap(28, 28, 28)
                        .addComponent(eliminarButton)
                        .addGap(27, 27, 27)
                        .addComponent(consultarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileSystemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSystemButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        int resp = chooser.showOpenDialog(this);

        if (resp != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = chooser.getSelectedFile();
        fullPathTextField.setText(file.getAbsolutePath());

        Map<String, String> config = new HashMap<>();
        config.put(DAOAlumnoFactory.TIPO_DAO, DAOAlumnoFactory.TIPO_DAO_TXT);
        config.put(DAOAlumnoFactory.FILE_NAME, fullPathTextField.getText());

        try {
            daoTXT = (AlumnoDAOTXT) DAOAlumnoFactory.getInstance().getDAO(config);
            dao = daoTXT;
        } catch (DAOAlumnoFactoryException ex) {
            Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error Dao Factory" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("¡¡¡ DAO TXT creado !!!");

        try {
            alumnoModel.setLista(dao.findAll(verEliminadosRadioButton.isSelected()));
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexion: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Habiliar Componentes
        verEliminadosRadioButton.setEnabled(true);
        habilitarBotones();
    }//GEN-LAST:event_fileSystemButtonActionPerformed

    private void repoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repoComboBoxActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        Alumno alu = getSelectedAlumno();
        if (alu == null) {
            return;
        }
        Alumno aluOrigen = new Alumno();
        backupAlumno(aluOrigen, alu);
        // TODO Show Modal
        AlumnoDialog dialog = new AlumnoDialog(this, true);
        try {
            dialog.changeEstadoDNI(false);
            dialog.mostrar(alu, true);
        } catch (PersonaException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            if (aluModificado(aluOrigen, alu)) {
                alu.setEstado('M');
            }

            dao.update(alu);
        } catch (DAOException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        alumnoModel.refrescarModelo();

    }//GEN-LAST:event_modificarButtonActionPerformed

    private boolean aluModificado(Alumno aluOri, Alumno aluMod) {
        return (!aluOri.getApyNom().equals(aluMod.getApyNom())
                || !aluOri.getSexo().equals(aluMod.getSexo())
                || !aluOri.getFechaNac().equals(aluMod.getFechaNac())
                || !aluOri.getCantMatAprob().equals(aluMod.getCantMatAprob())
                || !aluOri.getPromedio().equals(aluMod.getPromedio())
                || !aluOri.getFechaIngreso().equals(aluMod.getFechaIngreso()));
    }

    private Alumno getSelectedAlumno() throws HeadlessException {
        final int selectedRow = alumnosTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un alumno", "Error", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
        return alumnoModel.getLista().get(selectedRow);
    }

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        Alumno alu = getSelectedAlumno();
        if (alu == null) {
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que querés eliminar a " + alu.getApyNom(), "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {
            try {
                dao.delete(alu.getDni());
                alumnoModel.setLista(dao.findAll(verEliminadosRadioButton.isSelected()));
            } catch (DAOException ex) {
                JOptionPane.showMessageDialog(this, "Eliminar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            alumnoModel.refrescarModelo();
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        Alumno alu = getSelectedAlumno();
        if (alu == null) {
            return;
        }

        AlumnoDialog dialog = new AlumnoDialog(this, true);
        try {
            dialog.changeEstadoDNI(false);
            dialog.mostrar(alu, false);
        } catch (PersonaException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        try {
            // Show Modal
            AlumnoDialog dialog = new AlumnoDialog(this, true);
            Alumno alu;

            dialog.changeEstadoDNI(true);
            alu = dialog.mostrar(null, false);

            if (alu != null) {
                try {
                    dao.create(alu);
                } catch (DAOException ex) {
                    Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                alumnoModel.getLista().add(alu);
                alumnoModel.refrescarModelo();
            }

        } catch (PersonaException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_agregarButtonActionPerformed

    private void repoComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_repoComboBoxItemStateChanged
        String tipoDAO = repoComboBox.getSelectedItem().toString();
        alumnoModel.setLista(new ArrayList<>());
        if ("TXT".equals(tipoDAO)) {
            jPanel1.setVisible(false);
            pnlTXT.setVisible(true);    
            dao = daoTXT;
        } else {
            jPanel1.setVisible(true);
            urlDBTextField.setEnabled(true);
            pnlTXT.setVisible(false);    
            dao = daoSQL;
        }

        if (dao != null) {
            try {
                disableConnectionButtons();
                alumnoModel.setLista(dao.findAll(verEliminadosRadioButton.isSelected()));
            } catch (DAOException ex) {
                Logger.getLogger(AlumnoGUI.class.getName()).log(Level.SEVERE, null, ex); //cambiar texto
            }
            alumnoModel.refrescarModelo();
        }

    }//GEN-LAST:event_repoComboBoxItemStateChanged

    private void disableConnectionButtons() {
        urlDBTextField.setEnabled(false);
        passwordDBField.setEnabled(false);
        userDBTextField.setEnabled(false);
        connDBButton.setEnabled(false);
    }

    private void connDBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connDBButtonActionPerformed
        Map<String, String> config = new HashMap();

        config.put(DAOAlumnoFactory.TIPO_DAO, DAOAlumnoFactory.TIPO_DAO_SQL);
        config.put(DAOAlumnoFactory.URL_DB, urlDBTextField.getText());
        config.put(DAOAlumnoFactory.USER, userDBTextField.getText());
        config.put(DAOAlumnoFactory.PASSWORD, String.valueOf(passwordDBField.getPassword()));
        try {
            dao = DAOAlumnoFactory.getInstance().getDAO(config);
            daoSQL = (AlumnoDAOSQL) dao;
        } catch (DAOAlumnoFactoryException ex) {
            JOptionPane.showMessageDialog(this, "Error de Conexion: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Connection DB OK!!!");
        habilitarBotones();

        try {
            disableConnectionButtons();
            alumnoModel.setLista(dao.findAll(verEliminadosRadioButton.isSelected()));
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la grilla", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Habiliar Componentes
        verEliminadosRadioButton.setEnabled(true);
        habilitarBotones();


    }//GEN-LAST:event_connDBButtonActionPerformed

    private void verEliminadosRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEliminadosRadioButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_verEliminadosRadioButtonActionPerformed


    private void verEliminadosRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_verEliminadosRadioButtonItemStateChanged
        try {
            alumnoModel.setLista(dao.findAll(verEliminadosRadioButton.isSelected()));
        } catch (DAOException ex) {
            JOptionPane.showMessageDialog(this, "Lista Eliminados: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verEliminadosRadioButtonItemStateChanged

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
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnoGUI().setVisible(true);
            }
        });
    }

    private void habilitarBotones() {
        alumnosTable.setEnabled(true);
        agregarButton.setEnabled(true);
        modificarButton.setEnabled(true);
        eliminarButton.setEnabled(true);
        consultarButton.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JTable alumnosTable;
    private javax.swing.JButton connDBButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton fileSystemButton;
    private javax.swing.JTextField fullPathTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JPasswordField passwordDBField;
    private javax.swing.JPanel pnlTXT;
    private javax.swing.JComboBox<String> repoComboBox;
    private javax.swing.JTextField urlDBTextField;
    private javax.swing.JTextField userDBTextField;
    private javax.swing.JRadioButton verEliminadosRadioButton;
    // End of variables declaration//GEN-END:variables

    AlumnoModel alumnoModel;

    private void backupAlumno(Alumno aluOrigen, Alumno alu) {

        try {
            aluOrigen.setDni(alu.getDni());
            aluOrigen.setApyNom(alu.getApyNom());
            aluOrigen.setCantMatAprob(alu.getCantMatAprob());
            aluOrigen.setFechaIngreso(alu.getFechaIngreso());
            aluOrigen.setFechaNac(alu.getFechaNac());
            aluOrigen.setPromedio(alu.getPromedio());
            aluOrigen.setSexo(alu.getSexo());
            aluOrigen.setEstado(alu.getEstado());
        } catch (PersonaException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, "Error al procesar los datos personales", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
