package ar.utnba.ddsi.depoautomatizado.services;

import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Accion;
import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Avanzar;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class AvanzarTest {
    @Test
    void AccionLlamaAEjecutar() {
        // Arrange
        int metros = 10;
        Accion accion = new Avanzar(metros);
        Robot robot = mock(Robot.class);

        // Act
        accion.ejecutar(robot);

        // Assert
        verify(robot).avanzar(metros);
    }
}