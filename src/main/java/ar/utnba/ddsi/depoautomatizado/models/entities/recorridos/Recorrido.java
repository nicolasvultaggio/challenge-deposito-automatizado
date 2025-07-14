package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos;

import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Accion;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    private final List<Accion> acciones ;

    public Recorrido() {
        this.acciones = new ArrayList<>();
    }

    public void ejecutarRecorrido(Robot robot) {
        acciones.forEach(accion -> accion.ejecutar(robot));
    }

    public void agregarAccion(Accion accion) {
        acciones.add(accion);
    }

    public void quitarAccion(Accion accion) {
        acciones.remove(accion);
    }
} 