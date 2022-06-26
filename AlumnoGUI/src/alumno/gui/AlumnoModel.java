/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import persona.Alumno;

/**
 *
 * @author Gabriel
 */
public class AlumnoModel extends AbstractTableModel {

    private List<Alumno> lista;
    
    private static final String[] ENCABEZADOS = {"DNI", "Apellido y Nombre", "Fecha Nac.", "Estado"};
    
    public AlumnoModel() {
        lista = new ArrayList<>();
    }

    public void setLista(List<Alumno> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        return ENCABEZADOS.length;
    }

    @Override
    public String getColumnName(int column) {
        return ENCABEZADOS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno alu = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return alu.getDni();
            case 1: return alu.getApyNom();
            case 2: return alu.getFechaNac();
            case 3: return alu.getEstado() == 'A' ? "Activo" : "Inactivo";
            
            default: return null;
        }
    }

    public List<Alumno> getLista() {
        return lista;
    }
    
    public void refrescarModelo() {
        fireTableDataChanged();
    }

}
