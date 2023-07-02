public class Equipamento {

    private EstadoEquipamento estado;

    public Equipamento(){
        this.estado = new EstadoDesligado(this);
    }
    public void desligar(){
        System.out.println("[GE] Desligando equipamentos...");

    }

    public EstadoEquipamento getEstado() {
        return estado;
    }
}
