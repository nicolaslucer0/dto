/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fecha.MiCalendarioException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persona.Alumno;
import persona.AlumnoException;
import persona.Persona;
import persona.PersonaException;

/**
 *
 * @author Gabriel
 */
public class AlumnoDAOTXT extends DAO<Alumno, Integer>{

    private RandomAccessFile raf;
    
    AlumnoDAOTXT(File archivo, String mode) throws AlumnoDAOException {
        try {
            raf = new RandomAccessFile(archivo, mode);
        } catch (FileNotFoundException ex) {
            throw new AlumnoDAOException("Archivo no encontrado ==> "+ex.getMessage());
        }
    }
    
    @Override
    public void create(Alumno alu) throws AlumnoDAOException {
        if (existe(alu.getDni())) {
            throw new AlumnoDAOException("El alumno con DNI "+alu.getDni()+" ya existe");
        }
        
        try {
            // Posicionar al final
            raf.seek(raf.length());
            
            // Escribo
            raf.writeBytes(alu+System.lineSeparator());
            
        } catch (IOException ex) {
            throw new AlumnoDAOException("Error E/S ==> "+ex.getMessage());
        }
    }

    @Override
    public Alumno read(Integer dni) throws AlumnoDAOException {
        try {
            // Posicionar al inicio
            raf.seek(0);
            String linea;
            String[] campos;
            while ((linea = raf.readLine())!=null) {
                campos = linea.split(Persona.DELIM);
                if (Integer.valueOf(campos[0]).equals(dni)) {
                    Alumno alu = Alumno.string2Alumno(campos);
                    if (alu.getEstado()!='B') {
                        return alu;
                    }
                    return null;
                }
            }
        } catch (IOException ex) {
            throw new AlumnoDAOException("Error E/S ==> "+ex.getMessage());
        } catch (PersonaException | MiCalendarioException | AlumnoException ex) {
            throw new AlumnoDAOException("Error al formar el alumno ==> "+ex.getMessage());
        }
        return null;
    }

    /**
     * Este método actualiza un alumno activo
     * El parámetro alu se utiliza para pisar la información actual
     */
    @Override
    public void update(Alumno alu) {
        
        try {
            // Posicionar al inicio
            raf.seek(0);
            String linea;
            String[] campos;
            long puntero = 0;
            while ((linea = raf.readLine())!=null) {
                campos = linea.split(Persona.DELIM);
                if (Integer.valueOf(campos[0]).equals(alu.getDni())) {
                    raf.seek(puntero);
                    raf.writeBytes(alu+System.lineSeparator());
                    return;
                }
                puntero = raf.getFilePointer();
            }
        } catch (IOException ex) {
        }
    }

    @Override
    public void delete(Integer dni) throws AlumnoDAOException {
    
// Borrado lógico - Marcarlo como borrado
        // Leer el alumno y setear el estado en 'B'
        Alumno alu = read(dni);
        try {
            alu.setEstado('B');
        } catch (AlumnoException ex) {
            Logger.getLogger(AlumnoDAOTXT.class.getName()).log(Level.SEVERE, null, ex);
        }        
        update(alu);
        
    }

    @Override
    public boolean existe(Integer dni) throws AlumnoDAOException {
        try {
            // Posicionar al inicio
            raf.seek(0);
            String linea;
            while ((linea = raf.readLine())!=null) {
                if (Integer.valueOf(linea.substring(0, 8)).equals(dni)) {
                    return true;
                }
            }
        } catch (IOException ex) {
            throw new AlumnoDAOException("Error E/S ==> "+ex.getMessage());
        }
        
        return false;
    }

    @Override
    public List<Alumno> findAll() throws DAOException {
        
        // Solo los Activos (A/M)
        return findAll(false);
    }

    @Override
    public List<Alumno> findAll(boolean all) throws DAOException {
        
        // TODO findAll
        List<Alumno> lista = new ArrayList<>();

        try {
            // Posicionar al inicio
            raf.seek(0);
            String linea;
            String[] campos;
            while ((linea = raf.readLine())!=null) {
                campos = linea.split(Persona.DELIM);
                Alumno alu = Alumno.string2Alumno(campos);
                if (all || alu.getEstado()!='B') {
                    lista.add(alu);    
                }
            }
        } catch (IOException ex) {
            throw new AlumnoDAOException("Error E/S ==> "+ex.getMessage());
        } catch (PersonaException | MiCalendarioException | AlumnoException ex) {
            throw new AlumnoDAOException("Error al formar el alumno ==> "+ex.getMessage());
        }
        
        
        return lista;
    }

    @Override
    public void close() throws DAOException {
        try {
            if (raf!=null) {
                raf.close();
            }
        } catch (IOException ex) {
            throw new DAOException("Error al cerrar archivo ==> "+ex.getMessage());
        }
    }
    
}
