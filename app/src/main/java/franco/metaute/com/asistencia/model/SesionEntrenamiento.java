package franco.metaute.com.asistencia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SesionEntrenamiento {
    //Atributos
    private Date fecha;
    private int duracion;
    private String lugar;
    private String planEntrenamiento;
    private List<Integrante> asistencia;

    //Constructor
    public SesionEntrenamiento(){
        asistencia = new ArrayList<>();
    }

    public boolean asistio(String identificacionBuscada){
        boolean asistio = false;
        for (int i=0; i<asistencia.size(); i++) {
            Integrante integranteActual = asistencia.get(i);
            String identificacionActual = integranteActual.getIdentificacion();
            if (identificacionActual.equals(identificacionBuscada)) {
                asistio = true;
            }
        }
        return asistio;
    }

    public void agregarAsistente(Integrante integranteAsistente) {
        String identificacionBuscada = integranteAsistente.getIdentificacion();
        if (asistio(identificacionBuscada) == false) {
            asistencia.add(integranteAsistente);
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPlanEntrenamiento() {
        return planEntrenamiento;
    }

    public void setPlanEntrenamiento(String planEntrenamiento) {
        this.planEntrenamiento = planEntrenamiento;
    }

    public List<Integrante> getAsistencia(){
        return asistencia;
    }
}
