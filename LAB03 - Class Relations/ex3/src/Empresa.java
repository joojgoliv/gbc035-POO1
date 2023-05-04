import  java.util.Scanner;
public class Empresa {
    private String nome;
    private Departamento d[]= new Departamento[10];
    private int cont=0;
    Scanner sc = new Scanner(System.in);

    public Empresa(String nome){
        this.nome = nome;
    }

    public void addDep(){
        String n;
        System.out.println("Digite o nome do departamento: ");
        n = sc.nextLine();
        d[cont] = new Departamento(n);
        cont++;
    }

    public String mostraDados(){
        String dados;
        dados = "Empresa: "+this.nome;
        for(int i =0; i<cont;i++){
            dados = dados + "\nDep "+i+": "+d[i].retNome();
        }

        return dados;
    }
}
