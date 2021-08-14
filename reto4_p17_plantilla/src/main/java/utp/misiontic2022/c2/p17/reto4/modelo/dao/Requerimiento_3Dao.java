package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        var requesd = new ArrayList<Requerimiento_3>();
        String sql ="SELECT p.ID_Proyecto, "
        +"p.Ciudad, "
        +"p.Clasificacion, "
        +"SUM(c.Cantidad * m.Precio_Unidad) as Costo_Proyecto "
        +"FROM Proyecto p " 
        +"INNER JOIN MaterialConstruccion m on "
        +"m.ID_MaterialConstruccion = c.ID_MaterialConstruccion " 
        +"INNER JOIN Compra c ON "
        +"c.ID_Proyecto = p.ID_Proyecto "
        +"WHERE p.Ciudad in ('Sta. Rosa de Cabal', 'Pereira') "
        +"GROUP BY p.Ciudad, p.Clasificacion, p.ID_Proyecto "
        +"HAVING Costo_Proyecto > 87000 ";
        try (var Connection = JDBCUtilities.getConnection();
            Statement stmt = Connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

        ) {
            while(rs.next()){
                Requerimiento_3 reque3 = new Requerimiento_3();
                reque3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                reque3.setCiudad(rs.getString("Ciudad"));
                reque3.setClasificacion(rs.getString("Clasificacion"));
                reque3.setCosto_Proyecto(rs.getInt("Costo_Proyecto"));
                requesd.add(reque3);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return requesd;
        // Su código
    }
}