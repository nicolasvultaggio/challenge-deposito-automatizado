package ar.utnba.ddsi.depoautomatizado.models.entities.acciones;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Avanzar implements Accion {

    int metros;

    public Avanzar(int metros) {
        this.metros = metros;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.avanzar(metros);
    }
}
