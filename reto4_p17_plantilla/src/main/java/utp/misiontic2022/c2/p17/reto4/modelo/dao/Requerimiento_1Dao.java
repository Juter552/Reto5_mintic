package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
   
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        var reques = new ArrayList<Requerimiento_1>() ;
        String sql="SELECT l.Nombre ||"+"' '"+"|| l.Primer_Apellido as Lider, "
        +"l.Cargo, count(p.ID_Proyecto) as Proyectos "
        +"FROM Lider l "
        +"INNER JOIN Proyecto p ON "
        +"p.ID_Lider = l.ID_Lider "
        +"WHERE p.Constructora = 'Pegaso' "
        +"GROUP BY l.ID_Lider "
        +"ORDER BY l.Cargo, Lider ; ";
        try (var Connection = JDBCUtilities.getConnection();
            Statement stmt = Connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){
                Requerimiento_1 reque = new Requerimiento_1();
                
                reque.setLider(rs.getString("Lider"));
                reque.setCargo(rs.getString("Cargo"));
                reque.setProyectos(rs.getInt("Proyectos"));
                reques.add(reque);
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return reques;
    }
}