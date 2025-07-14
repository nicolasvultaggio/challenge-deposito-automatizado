package ar.utnba.ddsi.depoautomatizado.services;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EsquivarObstaculoStrategy;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class EsquivarTest {
    @Test
    void AccionLlamaAEsquivar() {
        // Arrange
        EstrategiaObstaculo estrategia = new EsquivarObstaculoStrategy();
        Robot robot = mock(Robot.class);

        // Act
        estrategia.manejarObstaculo(robot);

        // Assert
        verify(robot).esquivar();
    }
}