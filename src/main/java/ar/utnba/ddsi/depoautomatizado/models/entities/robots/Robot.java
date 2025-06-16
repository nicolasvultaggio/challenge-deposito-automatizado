package ar.utnba.ddsi.depoautomatizado.models.entities.robots;


import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Robot {
    private Long id;
    private boolean disponible;
    private EstrategiaObstaculo estrategiaObstaculo;

    Robot(Long id) {
        this.id = id;
        this.disponible = true;
    }
} 