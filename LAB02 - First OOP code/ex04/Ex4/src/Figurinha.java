public class Figurinha{
    private String nome;
    private String nasc;
    private double altura;
    private double peso;
    private String pos;
    private String pais;
    public Figurinha(String nome, String nasc, double altura, double peso, String pos, String pais){
        this.nome = nome;
        this.nasc = nasc;
        this.altura = altura;
        this.peso = peso;
        this.pos = pos;
        this.pais = pais;
    }
    public String mostraDados(){
        return "\nNome: " + nome + "\nNascimento: " + nasc + "\nAltura: "+altura+"\nPeso: "+peso
                +"\nPosicao: "+pos+"\nPais: "+pais;
    }

    public void mudarNome(String nome){
        this.nome = nome;
    }
    public void mudarNasc(String nasc){
        this.nasc = nasc;
    }
    public void mudarAltura(double altura){
        this.altura = altura;
    }
    public void mudarPeso(double peso){
        this.peso = peso;
    }
    public void mudarPos(String pos){
        this.pos = pos;
    }
    public void mudarPais(String pais){
        this.pais = pais;
    }

}
