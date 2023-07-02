public class Main {
    public static void main(String[] args) {


        // LIGANDO O SISTEMA

        System.out.println("[GUE] Inicializando GUE...");
        System.out.println("[GUE] Verificando equipamentos...");
        System.out.println("[GUE] Equipamentos desligados.");
        System.out.println("[GUE] Tudo pronto.");
        System.out.println("[RFID] Aguardando leitura.\n");

        // PRIMEIRO DORCENTE ENTRA

        System.out.println("Um dorcente entra.\n");
        System.out.println("[RFID] Identificando aguarde...");
        System.out.println("[RFID] <THIAGO> Porta liberada.");
        System.out.println("[GUE] Analisando presentes...");
        System.out.println("[GUE] Ligando equipamentos...");
        System.out.println("[RFID] Porta trancada.");
        System.out.println("[RFID] Aguardando leitura.");
        System.out.println("[GUE] Equipamentos prontos.\n");

        // SEGUNDO DORCENTE ENTRA

        System.out.println("Um dorcente entra.\n");
        System.out.println("[RFID] Identificando aguarde...");
        System.out.println("[RFID] <ALEX> Porta liberada.");
        System.out.println("[GUE] Analisando presentes...");
        System.out.println("[RFID] Porta trancada.");
        System.out.println("[RFID] Aguardando leitura.");

        // UM ALUNO TENTA ENTRAR

        System.out.println("Um aluno não autorizado tenta entra.\n");
        System.out.println("[RFID] Identificando aguarde...");
        System.out.println("[RFID] <BRUNO> Acesso nedagado.");
        System.out.println("[RFID] Aguardando leitura.\n");

        // UM DORCENTE SAI

        System.out.println("Um dorcente sai.\n");
        System.out.println("[RFID] Identificando aguarde...");
        System.out.println("[RFID] <ALEX> Porta liberada.");
        System.out.println("[GUE] Analisando dorcentes.");
        System.out.println("[GUE] Analisando equipamentos.");
        System.out.println("[GUE] Equipamentos prontos.");
        System.out.println("[RFID] Porta trancada.");
        System.out.println("[RFID] Aguardando leitura.\n");

        // UTIMO DORCENTE SAI

        System.out.println("Utimo dorcente sai.\n");
        System.out.println("[RFID] Identificando aguarde...");
        System.out.println("[RFID] <THIAGO> Porta liberada.");
        System.out.println("[GUE] Analisando dorcentes.");
        System.out.println("[GUE] Sala vazia.");
        System.out.println("[GUE] Analisando equipamentos...");
        System.out.println("[GUE] Desligando equipamentos...");
        System.out.println("[RFID] Porta trancada.");
        System.out.println("[RFID] Aguardando leitura.\n");
        System.out.println("[GUE] Equipamentos desligados.");

    }
}