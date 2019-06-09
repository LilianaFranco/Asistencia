package franco.metaute.com.asistencia.model;

import java.util.Date;

public class Integrante {
    //Atributos
    private String nombre;
    private String identificacion;
    private Date fechaNacimiento;
    private String eps;
    private String telefono;
    private String profesion;
    private String direccion;
    private String contactoEmergencia;
    private String telefonoContactoEmergencia;
    private String rol;

    //Constructor

    public Integrante(){

    }

    public String getNombre(){
        return nombre;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getEps(){
        return eps;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getProfesion(){
        return profesion;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getContatoEmergencia(){
        return contactoEmergencia;
    }

    public String getTelefonoContactoEmergencia(){
        return telefonoContactoEmergencia;
    }

    public String getRol(){
        return rol;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setIdentificacion(String nuevaIdentificacion){
        this.identificacion = nuevaIdentificacion;
    }

    public void setFechaNacimiento(Date nuevaFechaNacimiento){
        this.fechaNacimiento = nuevaFechaNacimiento;
    }

    public void setEps(String nuevaEps){
        this.eps = nuevaEps;
    }

    public void setTelefono(String nuevoTelefono){
        this.telefono = nuevoTelefono;
    }

    public void setProfesion(String nuevaProfesion){
        this.profesion = nuevaProfesion;
    }

    public void setDireccion(String nuevaDirección){
        this.direccion = nuevaDirección;
    }

    public void setContatoEmergencia(String nuevoContacto){
        this.contactoEmergencia = nuevoContacto;
    }

    public void setTelefonoContactoEmergencia(String nuevoTelefonoContacto){
        this.telefonoContactoEmergencia = nuevoTelefonoContacto;
    }

    public void getRol(String nuevoRol){
        this.rol =  nuevoRol;
    }
}
