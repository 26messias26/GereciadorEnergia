package Mediador;

import leitor.LeitorRFID;

public interface Mediador {

    public void inicializarSistema(Equipamento equipamento, LeitorRFID leitor);

    String indentificarDocente(String matricula);
}
