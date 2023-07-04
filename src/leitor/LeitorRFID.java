package leitor;

import Mediador.Mediador;

import java.util.Scanner;

public class LeitorRFID {

    Mediador gerenciadorEquipamento;
    Scanner leitor;
    public LeitorRFID( Mediador ge ){
        this.gerenciadorEquipamento = ge;
        this.leitor = new Scanner(System.in);

    }

    public boolean lerCracha(){
        System.out.println("[RFID] Aguardando leitura.\n");
        String matricula = this.leitor.next();

        if(matricula.equals("0")){
            return false;
        }else {
            System.out.println("[RFID] Identificando aguarde...");
            String docenteIdentificado = gerenciadorEquipamento.indentificarDocente(matricula);

            if (docenteIdentificado.equals("0")){
                System.out.println("[RFID] Acesso negado!");
            }else{
                System.out.println("[RFID] <"+docenteIdentificado+"> Porta liberada.");
            }
            return true;
        }

    }
}
