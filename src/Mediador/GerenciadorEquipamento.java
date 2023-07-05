package Mediador;

import Model.Docente;
import estados.EstadoDesligado;
import estados.EstadoLigado;
import leitor.LeitorRFID;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class GerenciadorEquipamento implements Mediador {

    private ArrayList<Docente> docentes; // Docentes cadastrados no sistema.
    private ArrayList<Docente> docentesPresentes; //Docentes que se encontram na sala.

    private Equipamento equipamento;
    private LeitorRFID leitor;

    public GerenciadorEquipamento(){
        this.docentes = new ArrayList<Docente>();
        this.docentesPresentes = new ArrayList<Docente>();

//      TIMER
        Timer timer = new Timer();
    }

    @Override
    public void inicializarSistema(Equipamento equipamento, LeitorRFID leitor) throws InterruptedException {

        System.out.println("[GE] Inicializando sistema...");
        Thread.sleep(1500);
        System.out.println("[GE] Verificando equipamentos...");
        this.equipamento = equipamento;
        Thread.sleep(1500);
        System.out.println("[GE] Equipamentos desligados.");

        this.leitor = leitor;

        System.out.println("[GE] Indentificando docentes...");

        docentes.add(new Docente("Alex","1"));
        docentes.add(new Docente("Valeria","2"));
        docentes.add(new Docente("Luiz","3"));
        docentes.add(new Docente("Endeberg","4"));
        docentes.add(new Docente("Luiza","5"));
        docentes.add(new Docente("Murilo Braz","6"));
        Thread.sleep(1500);
        System.out.println("[GE] Tudo pronto.");
    }

    @Override
    public String indentificarDocente(String matricula) throws InterruptedException {
        for (Docente docente : this.docentes){

            if(docente.getMatricula().equals(matricula)){

                if(this.docentesPresentes.contains(docente)){
                    this.docentesPresentes.remove(docente);
                }else{
                    this.docentesPresentes.add(docente);
                }
                Thread.sleep(1000);
                System.out.println("[GE] Docente indentificado: <"+docente.getNome()+">");

                Thread.sleep(600);
                this.verificarDocentePresente();

                return docente.getNome();

            }

        }
        return "0";
    }

    private void verificarDocentePresente() throws InterruptedException {
        if(this.docentesPresentes.size() == 0 ){
           String notificacao = this.equipamento.desligar();
            Thread.sleep(1000);
            System.out.println(notificacao);
        }

        if( this.docentesPresentes.size() == 1){
            String notificacao = this.equipamento.ligar();
            System.out.println(notificacao);
        }
    }

}
