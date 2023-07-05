import Mediador.Mediador;
import Mediador.GerenciadorEquipamento;
import leitor.LeitorRFID;
import Mediador.Equipamento;

public class Main {
    public static void main(String[] args) {
        boolean run = true;

        // LIGANDO O SISTEMA
        Mediador GE = new GerenciadorEquipamento();
        LeitorRFID leitor = new LeitorRFID(GE);
        Equipamento equipamento = new Equipamento();

        try {
            GE.inicializarSistema(equipamento, leitor);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        while (run){
            try{
                run = leitor.lerCracha();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try{
        Thread.sleep(1500);} catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("[GE] Encerrando sitema...");

        System.out.println("[GE] Obrigado pela a atenção");

    }
}