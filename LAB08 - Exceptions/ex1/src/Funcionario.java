public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private double teto;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.teto=40000;
    }

    public void aumentaSal(double x){
        try{
            modSal(x);
        }catch(IllegalStateException e){
            System.out.println("Argumento invalido: "+ e.getMessage());
        }
    }

    public void modSal(double x){
        if(x<0){
            throw new IllegalStateException("Valor invalido de salário");
        }else if(((x/100)+1)*this.salario>40000){
            throw new IllegalStateException("Valor ultrapassa o teto");
        }
        this.salario = ((x/100)+1)*this.salario;
    }

    public double retSal(){
        return this.salario;
    }
}