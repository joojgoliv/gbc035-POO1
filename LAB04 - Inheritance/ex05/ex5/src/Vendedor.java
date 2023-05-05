public class Vendedor extends Funcionario{
    double comissao;
    double vendas;
    public Vendedor(String nome, String data, double sal,double com, double venda){
        super(nome,data,sal);
        this.comissao=com;
        this.vendas=venda;
    }

    public double CalcSal(){
        double x;
        x=getSalario() + (comissao*vendas);

        return x;
    }
}
