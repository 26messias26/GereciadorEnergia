package estados;

import Mediador.Equipamento;

public class EstadoLigado extends EstadoEquipamento {

    public EstadoLigado(Equipamento equipamento) {
        super(equipamento);
    }

    @Override
    public String ligar() {
        return "[GE] Os equipamentos já se encontram ligados";
    }

    @Override
    public String desligar() {
        equipamento.setEstado(new EstadoDesligado(equipamento));
        return "[GE] Equipamentos desligados com sucesso.";
    }

}
