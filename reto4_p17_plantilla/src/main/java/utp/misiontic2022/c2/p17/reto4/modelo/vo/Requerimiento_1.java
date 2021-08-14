package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_1 {
    private String Lider;
    private String Cargo;
    private Integer Proyectos;
    
    public Requerimiento_1() {
    }
    public Requerimiento_1(String lider, String cargo, Integer proyectos) {
        Lider = lider;
        Cargo = cargo;
        Proyectos = proyectos;
    }
    public String getLider() {
        return Lider;
    }
    public void setLider(String lider) {
        Lider = lider;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public Integer getProyectos() {
        return Proyectos;
    }
    public void setProyectos(Integer proyectos) {
        Proyectos = proyectos;
    }
    @Override
    public String toString() {
        return Lider+ " "+ Cargo  + " " + Proyectos ;
    }
   
}
