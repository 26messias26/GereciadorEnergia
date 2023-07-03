package Model;

public class Docente {
    private String nome;
    private String matricula;

    public Docente(String nome, String matricula ){

        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
