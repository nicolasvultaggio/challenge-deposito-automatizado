package ar.utnba.ddsi.depoautomatizado.services;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.VolverInicioStrategy;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class VolverInicioStrategyTest {
    @Test
    void manejarObstaculoDebeLlamarVolverAlInicioEnRobot() {
        EstrategiaObstaculo estrategia = new VolverInicioStrategy();
        Robot robot = mock(Robot.class);

        estrategia.manejarObstaculo(robot);

        verify(robot).volver();
    }
}