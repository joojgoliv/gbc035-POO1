public class Departamento {
    private String nome;
    private Funcionario f[]= new Funcionario[10];
    int cont=0;

    public Departamento(String nome){
        this.nome = nome;
    }

    public String retNome(){
        return this.nome;
    }

    public void addFunc(Funcionario x){
        int i = 0;
        while(i<cont){
            i++;
        }
        f[i]=x;
        cont ++;
    }

    public String mostraDados(){
        String dados;
        dados ="Departamento: "+this.nome;
        for(int i=0;i<cont;i++){
            dados = dados +"\nFunc "+i+": "+f[i].retNome();
        }

        return dados;
    }
}
