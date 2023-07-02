public class Equipamento {

    private EstadoEquipamento estado;

    public Equipamento(){
        this.estado = new EstadoDesligado(this);
    }
    public void setEstado(EstadoEquipamento estado){
        this.estado = estado;
    }

    public EstadoEquipamento getEstado() {
        return estado;
    }
}
