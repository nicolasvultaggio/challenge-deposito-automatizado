package ar.utnba.ddsi.depoautomatizado.services;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.LlamarMantenimientoStrategy;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LLamarAMantenimientoTest {
    @Test
    void AccionLlamaAMantenimiento() {
        // Arrange
        EstrategiaObstaculo estrategia = new LlamarMantenimientoStrategy();
        Robot robot = mock(Robot.class);

        // Act
        estrategia.manejarObstaculo(robot);

        // Assert
        verify(robot).llamarAMantenimiento();
    }
}