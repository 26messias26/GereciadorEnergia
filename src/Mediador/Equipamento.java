package Mediador;

import estados.EstadoEquipamento;
import estados.EstadoDesligado;

public class Equipamento {

    private EstadoEquipamento estado;

    public Equipamento(){
        this.estado = new EstadoDesligado(this);
    }
    public void setEstado(EstadoEquipamento estado){
        this.estado = estado;
    }

    public String ligar(){
        return estado.ligar();
    }

    public String desligar(){
        return estado.desligar();
    }

    public EstadoEquipamento getEstado() {
        return estado;
    }
}
