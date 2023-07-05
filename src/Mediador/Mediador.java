package Mediador;

import leitor.LeitorRFID;

public interface Mediador {

    public void inicializarSistema(Equipamento equipamento, LeitorRFID leitor) throws InterruptedException;

    public String indentificarDocente(String matricula) throws InterruptedException;

}
