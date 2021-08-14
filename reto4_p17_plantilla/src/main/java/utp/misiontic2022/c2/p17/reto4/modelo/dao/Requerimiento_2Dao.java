package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        var requese = new ArrayList<Requerimiento_2>();
        String sql="SELECT m.ID_MaterialConstruccion, "
        +"m.Nombre_Material, "
        +"c.Cantidad, "
        +"m.Precio_Unidad, "
        +"m.Precio_Unidad * c.Cantidad as Precio_Total "
        +"FROM MaterialConstruccion m " 
        +"INNER JOIN Compra c ON "
        +"c.ID_MaterialConstruccion = m.ID_MaterialConstruccion " 
        +"WHERE c.ID_Proyecto in (14, 20, 18, 36, 45, 48, 56) "
        +"ORDER BY c.ID_Proyecto ASC, m.Precio_Unidad DESC ";

        try (var Connection =JDBCUtilities.getConnection();
            Statement stmt = Connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){
                Requerimiento_2 requed = new Requerimiento_2();
                requed.setID_MaterialConstruccion(rs.getInt("ID_MaterialConstruccion"));
                requed.setNombre_Material(rs.getString("Nombre_Material"));
                requed.setCantidad(rs.getInt("Cantidad"));
                requed.setPrecio_Unidad(rs.getInt("Precio_Unidad"));
                requed.setPrecio_Total(rs.getInt("Precio_Total"));
                requese.add(requed);
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
       
        
        return requese;
    }
}