public class Selecao {
    private String tecnico;
    private String selec;
    private Figurinha f[] = new Figurinha[11];
    //tem que ser dentro de um metodo


    public Selecao(String tecnico, String pais){
        this.tecnico = tecnico;
        this.selec = pais;
    }

    public String mostraTime(){
        String time = "";
        for(int i = 0; i<11; i++){
            time = time + "\nJogador "+i+": "+f[i].mostraDados()+"\n";
        }
        return time;
    }

    public void definirJogadores(){
        //fazer o usuario preencher com loop

        f[0] = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[1] = new Figurinha("Messi", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[2] = new Figurinha("Cristiano Ronaldo", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[3] = new Figurinha("Neymar 88", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[4] = new Figurinha("Messi 88", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[5] = new Figurinha("Cristiano 88", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[6] = new Figurinha("Neymar 90", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[7] = new Figurinha("Messi 90", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[8] = new Figurinha("Cristiano 90", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[9] = new Figurinha("Neymar 77", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[10] = new Figurinha("Messi 77", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
    }

    public void mudarJogador(int i, ){
        f[]

    }
}
