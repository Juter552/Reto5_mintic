package utp.misiontic2022.c2.p17.reto4.vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        try {
            ArrayList<Requerimiento_1> requerimiento_1Daos = controlador.consultarRequerimiento1();

            for (Requerimiento_1 requerimiento_1 : requerimiento_1Daos) {
               
                System.out.println( requerimiento_1.toString());         
            }  
        } catch (SQLException e) {
            System.err.println(e);
        }
       
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2> requerimiento_2s = controlador.consultarRequerimiento2();

            for (Requerimiento_2 requerimiento_2 : requerimiento_2s) {
            
                    System.out.println(requerimiento_2.toString());
               
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3> requerimiento_3s = controlador.consultarRequerimiento3();

            for (Requerimiento_3 requerimiento_3 : requerimiento_3s) {
                System.out.println(requerimiento_3.toString()); 
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
}
