import java.util.ArrayList;

public class GerenciadorEquipamento implements Mediador {

    ArrayList<Docente> docentes;

    public GerenciadorEquipamento(){
        this.docentes = new ArrayList<Docente>();
        // preencher dorcentes atravez de um arquivo json
    }
    @Override
    public void inicializarSistema() {

        System.out.println("Inicializando sistema...");

        System.out.println("Indentificando usuarios...");
        System.out.println("Inicializando sistema...");

    }

    @Override
    public void atualizarEquipamento() {

    }
    @Override
    public String verificarDocente(String matricula) {
        for (Docente docente : this.docentes){
            if(docente.getMatricula() == matricula){
                return docente.getNome();
                // fazer uma chamada assincrona para ligar os equipamentos.
            }else{
                return "0";
            }
        }
        return "0";
    }
}
