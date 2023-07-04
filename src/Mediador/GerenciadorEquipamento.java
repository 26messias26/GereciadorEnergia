package Mediador;

import Model.Docente;
import estados.EstadoDesligado;
import estados.EstadoLigado;
import leitor.LeitorRFID;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class GerenciadorEquipamento implements Mediador {

    private ArrayList<Docente> docentes; // Docentes cadastrados no sistema.
    private ArrayList<Docente> docentesPresentes; //Docentes que se encontram na sala.

    private Equipamento equipamento;
    private LeitorRFID leitor;

    public GerenciadorEquipamento(){
        this.docentes = new ArrayList<Docente>();
        this.docentesPresentes = new ArrayList<Docente>();
    }

    @Override
    public void inicializarSistema(Equipamento equipamento, LeitorRFID leitor) {

        System.out.println("[GE] Inicializando sistema...");
        System.out.println("[GE] Verificando equipamentos...");
        this.equipamento = equipamento;
        System.out.println("[GE] Equipamentos desligados.");
        this.leitor = leitor;

        System.out.println("[GE] Indentificando docentes...");

        docentes.add(new Docente("Alex","1"));
        docentes.add(new Docente("Valeria","2"));
        docentes.add(new Docente("Luiz","3"));
        docentes.add(new Docente("Endeberg","4"));
        docentes.add(new Docente("Luiza","5"));
        docentes.add(new Docente("Murilo Braz","6"));
        System.out.println("[GE] Tudo pronto.");
    }

    @Override
    public String indentificarDocente(String matricula) {
        for (Docente docente : this.docentes){

            if(docente.getMatricula().equals(matricula)){

                if(this.docentesPresentes.contains(docente)){
                    this.docentesPresentes.remove(docente);
                }else{
                    this.docentesPresentes.add(docente);
                }

                System.out.println("Docente indentificado: <"+docente.getNome()+">");

                this.verificarDocentePresente();

                return docente.getNome();

            }

        }
        return "0";
    }

    private void verificarDocentePresente() {
        if(this.docentesPresentes.size() == 0 ){
           String notificacao = this.equipamento.desligar();
            System.out.println(notificacao);
        }

        if( this.docentesPresentes.size() == 1){
            String notificacao = this.equipamento.ligar();
            System.out.println(notificacao);
        }
    }

}
