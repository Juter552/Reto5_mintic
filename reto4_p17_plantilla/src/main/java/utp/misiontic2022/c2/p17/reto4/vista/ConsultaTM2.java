/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author juter
 */
public class ConsultaTM2 extends AbstractTableModel{
    private List<Requerimiento_2> requerimientos2;

    public ConsultaTM2() {
        this(new ArrayList<>());
    }
    
    public ConsultaTM2(List<Requerimiento_2> requerimiento2) {
        this.requerimientos2 = requerimiento2;
    }
    
    public void setRequerimientos1(int row, Requerimiento_2 requerimiento) {
        this.requerimientos2.set(row,requerimiento);
    }
    public void getRequerimientos1(int row) {
        this.requerimientos2.get(row);
    }
    @Override
    public int getRowCount() {
        return requerimientos2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_2 reque = requerimientos2.get(row);
        switch (column){
            case 0:
                return reque.getID_MaterialConstruccion();
            case 1:
                return reque.getNombre_Material();
            case 2:
                return reque.getCantidad();
            case 3:
                return reque.getPrecio_Unidad();
            case 4: 
                return reque.getPrecio_Total();
        }
           
        return null;
    }
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID_MaterialConstruccion";
            case 1:
                return "Nombre";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio_Unidad";
            case 4: 
                return "Precio_Total";
        }
        return super.getColumnName(column);
    }
    
}
