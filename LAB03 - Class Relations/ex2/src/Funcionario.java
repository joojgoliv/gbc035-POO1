public class Funcionario {
    private String nome;
    private Departamento d;

    public Funcionario(String nome){
        this.nome = nome;
    }
    public void defDepartamento(Departamento x){
        d = x;
        //x.addFunc(this.Funcionario);
    }

    public String mostraDados(){
        String dados = "Nome: "+this.nome+"\nDepartamento: "
                + d.retNome();
        return dados;
    }

    public String retNome(){
        return this.nome;
    }
}
