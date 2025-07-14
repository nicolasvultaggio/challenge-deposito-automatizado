package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Accion;

import java.util.List;

public class Clark extends Robot {
    
    public Clark(Long id) {
        super(id);
    }

    @Override
    public void desplazar(int metros) {
        //TODO
    }

    @Override
    public void girar(int grados) {
        //TODO
    }

    @Override
    public void recoger() {
        //TODO
    }

    @Override
    public void dejar() {
        //TODO
    }

    public void esquivar() {
        //TODO
    }

    @Override
    public void volver() {

    }

    @Override
    public void reintentar() {

    }

    @Override
    public void llamarAMantenimiento() {

    }

    @Override
    protected Boolean detectarObstaculo() {
        //TODO
        return null;
    }

} 