package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import org.springframework.boot.autoconfigure.web.WebProperties;

public class ReintentarStrategy implements EstrategiaObstaculo {
    @Override
    public void manejarObstaculo(Robot robot) {
        robot.reintentar();
    }
}
