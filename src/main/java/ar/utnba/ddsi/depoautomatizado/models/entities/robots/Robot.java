package ar.utnba.ddsi.depoautomatizado.models.entities.robots;


import ar.utnba.ddsi.depoautomatizado.models.entities.acciones.Accion;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public abstract class Robot {
    private Long id;
    private boolean disponible;
    private EstrategiaObstaculo estrategiaObstaculo;
    private List<Accion> ultimasAccionesRealizadas;
    Robot(Long id) {
        this.id = id;
        this.disponible = true;
    }

    public void avanzar(int metros){
        this.desplazar(metros);
        if(this.detectarObstaculo()){
            estrategiaObstaculo.manejarObstaculo(this);
        }
    };


    protected abstract void desplazar(int metros);

    public abstract void girar(int grados);
    public abstract void recoger();
    public abstract void dejar();

    protected abstract Boolean detectarObstaculo();

    public abstract void esquivar(); //depende de la logica interna del robot
    public abstract void llamarAMantenimiento();

    public abstract void volver();//depende de la logica interna del robot haber guardado los ultimos movimientos
    public abstract void reintentar();//depende de la logica interna del robot haber guardado el ultimo movimiento


}