package ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posicion {
    private int x;
    private int y;
    private int z;
    
    public Posicion(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
} 