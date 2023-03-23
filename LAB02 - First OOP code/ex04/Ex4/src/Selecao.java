public class Selecao {
    private String tecnico;
    private String selec;
    private Figurinha f[] = new Figurinha[11];
    public Selecao(String tecnico, String pais, Figurinha f[]){
        this.tecnico = tecnico;
        this.selec = pais;
        for(int i =0; i < 11; i++){
            this.f[i] = f[i];
        }
    }

    public String mostraTime(){
        String time = null;
        for(int i = 1; i<=11; i++){
            time = time + "\nJogador "+i+": "+f[i--].mostraDados();
        }
        return time;
    }
}
