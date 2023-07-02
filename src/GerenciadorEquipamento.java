import java.util.ArrayList;

public class GerenciadorEquipamento implements Mediador {

    ArrayList docentes;

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
}
