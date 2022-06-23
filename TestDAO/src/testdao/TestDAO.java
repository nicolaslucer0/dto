/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdao;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import dao.AlumnoDAOException;
import dao.AlumnoDAOTXT;
import dao.DAO;
import dao.DAOAlumnoFactory;
import dao.DAOAlumnoFactoryException;
import dao.DAOException;
import fecha.MiCalendario;
import fecha.MiCalendarioException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import persona.Alumno;
import persona.AlumnoException;
import persona.PersonaException;

/**
 *
 * @author Gabriel
 */
public class TestDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DAOAlumnoFactory daf = DAOAlumnoFactory.getInstance();

            Map<String, String> config = new HashMap();
/*

            config.put(DAOAlumnoFactory.TIPO_DAO, DAOAlumnoFactory.TIPO_DAO_TXT);
            config.put(DAOAlumnoFactory.FILE_NAME, "alumno.txt");
*/

            config.put(DAOAlumnoFactory.TIPO_DAO, DAOAlumnoFactory.TIPO_DAO_SQL);
            config.put(DAOAlumnoFactory.URL_DB, "jdbc:mysql://localhost:3306/efc?serverTimezone=UTC");
            config.put(DAOAlumnoFactory.USER, "root");
            config.put(DAOAlumnoFactory.PASSWORD, "root");
            DAO<Alumno, Integer> dao = daf.getDAO(config);
            
            System.out.println("CONNECTION OK");
            
            //Creo un alumno para usarlo en los casos de prueba
            final MiCalendario fechaNac = new MiCalendario(15,12, 1977);
            final MiCalendario fechaIng = new MiCalendario(23,03, 2001);
            Alumno alu = new Alumno(8.7, 31, 32556778, "Jonas Dark", 'M', fechaNac, fechaIng);
            
            //Se comentó cada caso con /**/            
            
            //Caso 1 - Crear Alumno y listar <> 'B'//-------------------
                     /*   
            dao.create(alu);            
            dao.ListAllTXT();
            */
            //--------------------Caso 1 - Crear Alumno y listar <> 'B'
              
            // Read
            Alumno aluRead = dao.read(24004605);
            if (aluRead==null) {
                System.err.println("Alunmo no encontrado");
            }
            else if (dao.existe(24004605)) {
                System.out.println("OK Encontrado ==> "+aluRead);
            }
            
            dao.close();
        } catch (DAOException | MiCalendarioException | PersonaException | DAOAlumnoFactoryException | AlumnoException ex) {
            Logger.getLogger(TestDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
