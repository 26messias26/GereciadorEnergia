package estados;

import Mediador.Equipamento;

public class EstadoDesligado extends EstadoEquipamento {

    public EstadoDesligado(Equipamento equipamento) {
        super(equipamento);
    }

    @Override
    public void desligar() {
        System.out.println("O equipamento está desligado.");
    }

    @Override
    public void ligar() {
        equipamento.setEstado(new EstadoLigado(equipamento));
    }
}