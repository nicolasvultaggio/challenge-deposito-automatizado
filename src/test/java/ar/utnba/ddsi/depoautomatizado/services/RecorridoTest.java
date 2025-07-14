package ar.utnba.ddsi.depoautomatizado.services;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Recorrido;
import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Accion;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class RecorridoTest {
    @Test
    void RecorridoEjecutaAccionesEnOrden() {
        Accion accion1 = mock(Accion.class);
        Accion accion2 = mock(Accion.class);
        Robot robot = mock(Robot.class);

        Recorrido recorrido = new Recorrido();

        recorrido.agregarAccion(accion1);
        recorrido.agregarAccion(accion2);
        recorrido.ejecutarRecorrido(robot);

        verify(accion1).ejecutar(robot);
        verify(accion2).ejecutar(robot);
    }
}