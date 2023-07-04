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

        GE.inicializarSistema(equipamento,leitor);

        while (run){
            run = leitor.lerCracha();
        }

        System.out.println("[Encerrando sitema...]");


        // PRIMEIRO DORCENTE ENTRA

//        System.out.println("Um dorcente entra.\n");
//        System.out.println("[RFID] Identificando aguarde...");
//        System.out.println("[RFID] <THIAGO> Porta liberada.");
//        System.out.println("[GE] Analisando presentes...");
//        System.out.println("[GE] Ligando equipamentos...");
//        System.out.println("[RFID] Porta trancada.");
//        System.out.println("[RFID] Aguardando leitura.");
//        System.out.println("[GE] Equipamentos prontos.\n");

//        // SEGUNDO DORCENTE ENTRA
//
//        System.out.println("Um dorcente entra.\n");
//        System.out.println("[RFID] Identificando aguarde...");
//        System.out.println("[RFID] <ALEX> Porta liberada.");
//        System.out.println("[GE] Analisando presentes...");
//        System.out.println("[RFID] Porta trancada.");
//        System.out.println("[RFID] Aguardando leitura.");
//
//        // UM ALUNO TENTA ENTRAR
//
//        System.out.println("Um aluno não autorizado tenta entra.\n");
//        System.out.println("[RFID] Identificando aguarde...");
//        System.out.println("[RFID] <BRUNO> Acesso nedagado.");
//        System.out.println("[RFID] Aguardando leitura.\n");
//
//        // UM DORCENTE SAI
//
//        System.out.println("Um dorcente sai.\n");
//        System.out.println("[RFID] Identificando aguarde...");
//        System.out.println("[RFID] <ALEX> Porta liberada.");
//        System.out.println("[GE] Analisando dorcentes.");
//        System.out.println("[GE] Analisando equipamentos.");
//        System.out.println("[GE] Equipamentos prontos.");
//        System.out.println("[RFID] Porta trancada.");
//        System.out.println("[RFID] Aguardando leitura.\n");
//
//        // UTIMO DORCENTE SAI
//
//        System.out.println("Utimo dorcente sai.\n");
//        System.out.println("[RFID] Identificando aguarde...");
//        System.out.println("[RFID] <THIAGO> Porta liberada.");
//        System.out.println("[GE] Analisando dorcentes.");
//        System.out.println("[GE] Sala vazia.");
//        System.out.println("[GE] Analisando equipamentos...");
//        System.out.println("[GE] Desligando equipamentos...");
//        System.out.println("[RFID] Porta trancada.");
//        System.out.println("[RFID] Aguardando leitura.\n");
//        System.out.println("[GE] Equipamentos desligados.");

    }
}