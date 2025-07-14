package ar.utnba.ddsi.depoautomatizado.models.entities.acciones;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Girar implements Accion {

    int grados;

    public Girar(int grados) {
        this.grados = grados;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.girar(grados);
    }
}
