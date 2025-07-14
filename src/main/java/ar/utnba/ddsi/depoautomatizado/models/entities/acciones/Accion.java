package ar.utnba.ddsi.depoautomatizado.models.entities.acciones;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public interface Accion {

    void ejecutar(Robot robot);

}
