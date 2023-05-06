public class Horista extends Funcionario{
    double valor;
    int horas;
    public Horista(String nome, String data, double valor, int hr){
        super(nome,data,0);
        this.valor=valor;
        this.horas=hr;
    }
    public double CalcSal(){
        double x;
        x = valor * horas;

        return x;
    }
}
