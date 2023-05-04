public class professor {
    private String nome;
    private String materia;
    private int cont=0;
    private aluno a[] = new aluno[5];

    public professor(String nome, String materia){
        this.nome = nome;
        this.materia = materia;
    }

    public void addAlunos(aluno alu[]){
        for(int i =0; i< alu.length; i++){
            a[i] = alu[i];
            cont++;
        }
    }

    public String retProf(){
        return ("Nome :"+this.nome + "   Materia: "+this.materia);
    }

    public String mostraDados(){
        String dados;
        dados = "Professor: "+this.nome+"\nMateria: "+this.materia;
        for(int i = 0; i<cont;i++){
            dados = dados + "\nAluno "+i+": "+a[i].retAluno();
        }

        return dados;
    }
}
