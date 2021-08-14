package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_3 {
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Clasificacion;
    private Integer Costo_Proyecto;
   
    public Requerimiento_3() {
    }
    public Requerimiento_3(Integer iD_Proyecto, String ciudad, String clasificacion, Integer costo_proyecto) {
        ID_Proyecto = iD_Proyecto;
        Ciudad = ciudad;
        Clasificacion = clasificacion;
        Costo_Proyecto = costo_proyecto;
    }
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }
    public Integer getCosto_Proyecto() {
        return Costo_Proyecto;
    }
    public void setCosto_Proyecto(Integer costo_proyecto) {
        Costo_Proyecto = costo_proyecto;
    }
    @Override
    public String toString() {
        return  ID_Proyecto+" "+ Ciudad + " " + Clasificacion + " " + Costo_Proyecto ;
    }
    
}
