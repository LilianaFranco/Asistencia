package franco.metaute.com.asistencia.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SesionEntrenamientoTest {

    @Test
    public void noDuplicaAsistencia(){
        Integrante integrante = new Integrante();
        integrante.setIdentificacion("65565656");
        integrante.setNombre("liliana");
        SesionEntrenamiento sesion = new SesionEntrenamiento();
        sesion.agregarAsistente(integrante);
        sesion.agregarAsistente(integrante);
        assertEquals(1,sesion.getAsistencia().size());
    }

}
