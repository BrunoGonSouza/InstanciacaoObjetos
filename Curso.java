public class Curso {
    //atributos
    String nome;
    int qtdeAlunos;
    String turma;

    //construtores com parâmetros
    public Curso(String nome, int qtdeAlunos, String turma){
        this.nome = nome;
        this.qtdeAlunos = qtdeAlunos;
        this.turma = turma;
    }
    public Curso(String nome, String turma){
        this.nome = nome;
        this.turma = turma;
    }
}
