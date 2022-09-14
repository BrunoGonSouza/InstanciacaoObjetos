import javax.swing.JOptionPane;

public class UsaCurso {
    public static void main(String[] args) {
        //declaração de variáveis
        String n, t;
        int q;

        n = JOptionPane.showInputDialog(
            "Digite o nome do curso");
        t = JOptionPane.showInputDialog(
            "Digite a turma");
        q = Integer.parseInt(JOptionPane.showInputDialog( "Digite a quantidade de alunos"));

        //instanciação do objeto
        Curso ads = new Curso(n, q, t);
        JOptionPane.showMessageDialog(null, 
        "Nome: " + ads.nome + 
        "\nAlunos: " + ads.qtdeAlunos + 
        "\nTurma: " + ads.turma);

        //instanciação do objeto - construtor padrão
        //Curso redes = new Curso();

        n = JOptionPane.showInputDialog(
            "Digite o nome do curso");
        t = JOptionPane.showInputDialog(
            "Digite a turma");
        
        //instanciação do objeto usando outro construtor
        Curso ccp = new Curso(n, t);
        JOptionPane.showMessageDialog(null, 
        "Nome: " + ccp.nome + 
        "\nAlunos: " + ccp.qtdeAlunos + 
        "\nTurma: " + ccp.turma);



        
    }
}
