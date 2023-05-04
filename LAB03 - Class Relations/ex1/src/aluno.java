public class aluno {
    private String nome;
    private String matricula;
    private professor p[] = new professor[5];
    private int cont=0;

    public aluno(String nome,String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void addProfessor(professor prof[]){
        for(int i =0; i<prof.length; i++){
            p[i] = prof[i];
            cont++;
        }
    }

    public String retAluno(){
        return("Aluno: "+this.nome+"   Matricula: "+this.matricula);
    }

    public String mostraDados(){
        String dados;
        dados = "Aluno: "+this.nome+"\nMatricula: "+this.matricula;
        for(int i = 0; i<cont;i++){
            dados = dados + "\nProf "+i+": "+p[i].retProf();
        }

        return dados;
    }
}
