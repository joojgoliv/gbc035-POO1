public class Chefe extends Funcionario{

    public Chefe(String nome, String data, double sal){
        super(nome,data,sal);
    }

    public double CalcSal(){
        double x = super.getSalario();
        return x;
    }
}
