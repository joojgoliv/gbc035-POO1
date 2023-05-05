public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento, double salario){
        this.dataNascimento=dataNascimento;
        this.nome=nome;
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }

    public double CalcSal(){
        return 0;
    }
}
