public class Data {
    //atributos
    int dia;
    int mes;
    int ano;

    //construtores
    //padrão
    public Data(){    
    }

    //com parâmetros (informações passadas no momento da construção)
    public Data(int d, int m, int a){
        //atribuição dos parâmetros aos atributos
        dia = d;
        mes = m;
        ano = a;
    }

}
