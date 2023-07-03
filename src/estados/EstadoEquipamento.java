package estados;


import Mediador.Equipamento;

public abstract class EstadoEquipamento {
    Equipamento equipamento;

    public EstadoEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public abstract void ligar();

    public abstract void desligar();

}