package estados;

import Mediador.Equipamento;

public class EstadoDesligado extends EstadoEquipamento {

    public EstadoDesligado(Equipamento equipamento) {
        super(equipamento);
    }

    @Override
    public String desligar() {
        return "[GE] Os equipamentos já se encontram desligados!";
    }

    @Override
    public String ligar() {
        equipamento.setEstado(new EstadoLigado(equipamento));
        return "[GE] Equipamentos ligados com sucesso!";
    }
}