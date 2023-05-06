public class FolhaPagamento {

    public void folha(Funcionario f[]){
        for(int i =0; i<f.length; i++){
            if(f[i] == null){
                break;
            }
            System.out.println("Funcionario "+i+": "+f[i].getNome()+"\nData de Nascimento: "+f[i].getDataNascimento()
            +"\nSalario atual: "+f[i].CalcSal()+ "\n__________________________________________________________");
        }
    }
}
