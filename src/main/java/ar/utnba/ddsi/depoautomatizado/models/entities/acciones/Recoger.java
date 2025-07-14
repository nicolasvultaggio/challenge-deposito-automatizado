package ar.utnba.ddsi.depoautomatizado.models.entities.acciones;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Recoger implements Accion {
    @Override
    public void ejecutar(Robot robot) {
        robot.recoger();
    }
}
