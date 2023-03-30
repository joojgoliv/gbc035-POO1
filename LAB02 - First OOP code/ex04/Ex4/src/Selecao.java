public class Selecao {
    private String tecnico;
    private String selec;
    private Figurinha f = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
   /* f[0] = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
    f[1] = new Figurinha("Messi", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
    f[2] = new Figurinha("Cristiano Ronaldo", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");*/


    public Selecao(String tecnico, String pais){
        this.tecnico = tecnico;
        this.selec = pais;
    }

    public String mostraTime(){
        String time = null;
        for(int i = 1; i<=3; i++){
            time = time + "\nJogador "+i+": "+f.mostraDados();
        }
        return time;
    }
}
