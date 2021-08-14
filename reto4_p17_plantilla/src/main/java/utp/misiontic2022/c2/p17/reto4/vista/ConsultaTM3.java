/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

/**
 *
 * @author juter
 */
public class ConsultaTM3 extends AbstractTableModel{
    private List<Requerimiento_3> requerimientos3;

    public ConsultaTM3() {
        this(new ArrayList<>());
    }
    
    public ConsultaTM3(List<Requerimiento_3> requerimiento3) {
        this.requerimientos3 = requerimiento3;
    }
    
    public void setRequerimientos1(int row, Requerimiento_3 requerimiento) {
        this.requerimientos3.set(row,requerimiento);
    }
    public void getRequerimientos1(int row) {
        this.requerimientos3.get(row);
    }
    @Override
    public int getRowCount() {
        return requerimientos3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_3 reque = requerimientos3.get(row);
        switch (column){
            case 0:
                return reque.getID_Proyecto();
            case 1:
                return reque.getClasificacion();
            case 2:
                return reque.getCiudad();
            case 3:
                return reque.getCosto_Proyecto();
        }
           
        return null;
    }
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "ID_Proyecto";
            case 1:
                return "Clasificacion";
            case 2:
                return "Ciudad";
            case 3:
                return "Costo_Proyecto";
        }
        return super.getColumnName(column);
    }
    
}
