/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;

/**
 *
 * @author juter
 */
public class ConsultaTM extends AbstractTableModel{
    private List<Requerimiento_1> requerimientos1;

    public ConsultaTM() {
        this(new ArrayList<>());
    }
    
    public ConsultaTM(List<Requerimiento_1> requerimiento1) {
        this.requerimientos1 = requerimiento1;
    }
    
    public void setRequerimientos1(int row, Requerimiento_1 requerimiento) {
        this.requerimientos1.set(row,requerimiento);
    }
    public void getRequerimientos1(int row) {
        this.requerimientos1.get(row);
    }
    @Override
    public int getRowCount() {
        return requerimientos1.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 reque = requerimientos1.get(row);
        switch (column){
            case 0:
                return reque.getLider();
            case 1:
                return reque.getCargo();
            case 2:
                return reque.getProyectos();
        }
           
        return null;
    }
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "Proyectos";
        }
        return super.getColumnName(column);
    }
    
}
