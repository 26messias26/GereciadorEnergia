package leitor;

import Mediador.Mediador;

import java.util.Scanner;

public class LeitorRFID {

    Mediador GerenciadorEquipamento;
    Scanner leitor;
    public LeitorRFID(){
        this.leitor = new Scanner(System.in);

    }

    public void lerCracha(){
        System.out.println("[RFID] Aguardando leitura.\n");
        String matricula = this.leitor.next();

        System.out.println("[RFID] Identificando aguarde...");
        String docenteIdentificado = GerenciadorEquipamento.verificarDocente(matricula);

        if (docenteIdentificado == "0"){
            System.out.println("[RFID] Acesso negado!");
        }else{
            System.out.println("[RFID] <"+docenteIdentificado+"> Porta liberada.");
        }
    }
}
