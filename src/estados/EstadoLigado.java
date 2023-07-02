public class EstadoLigado extends EstadoEquipamento {

    public EstadoLigado(Equipamento equipamento) {
        super(equipamento);
    }

    @Override
    public void ligar() {
        System.out.println("O equipamento está ligado");
    }

    @Override
    public void desligar() {
        equipamento.setEstado(new EstadoDesligado(equipamento));

    }

}
