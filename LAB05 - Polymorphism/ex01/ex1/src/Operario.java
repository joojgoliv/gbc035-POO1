public class Operario extends Funcionario{
    double valor;
    int prouzido;

    public Operario(String nome, String data, double valor,int prod){
        super(nome,data,0);
        this.valor = valor;
        this.prouzido=prod;
    }
    public double CalcSal(){
        double x;
        x = valor * prouzido;

        return x;
    }
}
