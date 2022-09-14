import javax.swing.JOptionPane;

public class UsaData {
    public static void main(String[] args) {
        //variáveis
        int auxd, auxm, auxa;
        //construtor padrão
        Data ontem = new Data();
        //construtor com parâmetros com valores definidos
        Data hoje = new Data(6,9,2022);

        JOptionPane.showMessageDialog(null, 
        ontem.dia + "/" + 
        ontem.mes + "/" + 
        ontem.ano);

        JOptionPane.showMessageDialog(null, 
        hoje.dia + "/" + 
        hoje.mes + "/" + 
        hoje.ano);

        auxd = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o dia"));
        auxm = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o mês"));
        auxa = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o ano"));

        //usando as variáveis para instanciar o objeto
        Data amanha = new Data(auxd, auxm, auxa);

        JOptionPane.showMessageDialog(null, 
        amanha.dia + "/" + 
        amanha.mes + "/" + 
        amanha.ano);
    }
}
