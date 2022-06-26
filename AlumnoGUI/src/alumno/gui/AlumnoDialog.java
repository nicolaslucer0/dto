/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.gui;

import fecha.MiCalendario;
import java.util.Calendar;
import javax.swing.JOptionPane;
import persona.Alumno;
import persona.AlumnoException;
import persona.PersonaException;

/**
 *
 * @author Gabriel
 */
public class AlumnoDialog extends javax.swing.JDialog {

    private Alumno aluDTO;
    private boolean isSave;
    public boolean modificado;
    
    
    
    
    public AlumnoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Datos Alumno");
        setLocationRelativeTo(null);
        modificado = false;
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
        numDocTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apynTextField = new javax.swing.JTextField();
        fecNacDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        CantMatAprobadasTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fecIngDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        PromedioTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadoComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("DNI");

        numDocTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numDocTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Apellido y Nombre");

        apynTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apynTextFieldKeyTyped(evt);
            }
        });

        fecNacDateChooser.setDateFormatString("dd-MM-yyyy");

        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setText("Sexo");

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        CantMatAprobadasTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantMatAprobadasTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setText("Materias Aprobadas");

        fecIngDateChooser.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("Fecha de Ingreso");

        PromedioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PromedioTextFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("Promedio");

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jLabel8.setText("Estado");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(fecNacDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(numDocTextField)
                    .addComponent(CantMatAprobadasTextField)
                    .addComponent(PromedioTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apynTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecIngDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(18, 18, 18)
                                .addComponent(btnCerrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apynTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecNacDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantMatAprobadasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecIngDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PromedioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            if(camposCompletados())
            {
                if(ValidarDatos())
                {
                    form2Alu();
                    isSave = true;
                    setVisible(false);
                }                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe completar todos los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PersonaException | AlumnoException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void numDocTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDocTextFieldKeyTyped
        if (this.numDocTextField.getText().length()== 10) 
         evt.consume();     
    }//GEN-LAST:event_numDocTextFieldKeyTyped

    private void CantMatAprobadasTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantMatAprobadasTextFieldKeyTyped
        if (CantMatAprobadasTextField.getText().length()== 3) 
         evt.consume();
    }//GEN-LAST:event_CantMatAprobadasTextFieldKeyTyped

    private void PromedioTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PromedioTextFieldKeyTyped
        if (PromedioTextField.getText().length()== 5) 
         evt.consume();
    }//GEN-LAST:event_PromedioTextFieldKeyTyped

    private void apynTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apynTextFieldKeyTyped
        if (apynTextField.getText().length()== 30) 
         evt.consume();
    }//GEN-LAST:event_apynTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(AlumnoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlumnoDialog dialog = new AlumnoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    /**
     * 
     * @param alu Si en null ==> se agrega un alumno - si no, es consultar/modificar
     */
    Alumno mostrar(Alumno alu, boolean isUpdate) throws PersonaException, AlumnoException {
        if (alu==null) {   
            changeCondicionEstado(false);
            alu = new Alumno();
        }
        else {
            alu2Form(alu);            
            habilitarDeshabilitarCampos(isUpdate);            
        }
        aluDTO = alu;
        
        // Se Supende el hilo de ejecución. Se libera cuando se cierra el diálogo (setVisible(false))
        
        setVisible(true);
        
        // se cerró el diálogo
        if (!isSave) {
            return null;
        }
        form2Alu();
        return this.aluDTO;
    }
    
    public void changeEstadoDNI(boolean estado)
    {
        numDocTextField.setEnabled(estado);
    }
    
    public void changeCondicionEstado(boolean estado)
    {
        estadoComboBox.setEnabled(estado);
    }

    private void form2Alu() throws PersonaException, AlumnoException {
        // TODO Revisar si mostramos el error y se mantiene el diálogo abierto
        aluDTO.setDni(Integer.valueOf(numDocTextField.getText()));
        aluDTO.setApyNom(apynTextField.getText());
        aluDTO.setFechaNac(new MiCalendario(fecNacDateChooser.getCalendar()));
        aluDTO.setSexo(sexoComboBox.getSelectedItem().toString().charAt(0));
        aluDTO.setCantMatAprob(Integer.valueOf(CantMatAprobadasTextField.getText()));
        aluDTO.setFechaIngreso(new MiCalendario(fecIngDateChooser.getCalendar()));
        aluDTO.setPromedio(Double.valueOf(PromedioTextField.getText()));
        Character estadoCBO = "Activo".equals(estadoComboBox.getSelectedItem().toString()) ? 'A' : 'I';
        aluDTO.setEstado(estadoCBO);        
    }

    private void alu2Form(Alumno alu) {
        // No es una creación??
        numDocTextField.setText(String.valueOf(alu.getDni()));
        apynTextField.setText(alu.getApyNom());
        fecNacDateChooser.setCalendar(alu.getFechaNac());
        sexoComboBox.setSelectedIndex(alu.getSexo()=='f'||alu.getSexo()=='F'?0:1);
        CantMatAprobadasTextField.setText(String.valueOf(alu.getCantMatAprob()));
        fecIngDateChooser.setCalendar(alu.getFechaIngreso());
        PromedioTextField.setText(alu.getPromedio().toString());
        estadoComboBox.setSelectedIndex(alu.getEstado() == 'A' ? 0 : 1);
    }

    private void habilitarDeshabilitarCampos(boolean isUpdate) {
        // Habilitar/Deshabilitar dependiendo de la acción
        //numDocTextField.setEnabled(isUpdate);
        apynTextField.setEnabled(isUpdate);
        fecNacDateChooser.setEnabled(isUpdate);
        sexoComboBox.setEnabled(isUpdate);
        CantMatAprobadasTextField.setEnabled(isUpdate);
        fecIngDateChooser.setEnabled(isUpdate);
        PromedioTextField.setEnabled(isUpdate);
        estadoComboBox.setEnabled(isUpdate);
        saveButton.setEnabled(isUpdate);               
    }

        private boolean camposCompletados() {
        return numDocTextField.getText().trim().length() > 0
                && apynTextField.getText().trim().length() > 0
                && fecNacDateChooser.getCalendar() != null
                && sexoComboBox.getSelectedItem().toString().trim().length() > 0
                && CantMatAprobadasTextField.getText().trim().length() > 0
                && fecIngDateChooser.getCalendar() != null
                && PromedioTextField.getText().trim().length() > 0
                && estadoComboBox.getSelectedItem().toString().trim().length() > 0;   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantMatAprobadasTextField;
    private javax.swing.JTextField PromedioTextField;
    private javax.swing.JTextField apynTextField;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> estadoComboBox;
    private com.toedter.calendar.JDateChooser fecIngDateChooser;
    private com.toedter.calendar.JDateChooser fecNacDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField numDocTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> sexoComboBox;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarDatos() throws AlumnoException {
        
        Calendar fecN = (Calendar)fecNacDateChooser.getCalendar();
        Calendar fecI = (Calendar)fecIngDateChooser.getCalendar();

        if(fecN.getTime().after(fecI.getTime()))
        {            
            throw new AlumnoException("La fecha de nacimiento no puede superar a la fecha de ingreso."); //To change body of generated methods, choose Tools | Templates.
        }
        return true;
    }

}
