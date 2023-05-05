public class Figurinha {
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

    public String getNome(){
        return nome;
    }
    public String getNasc(){
        return nasc;
    }
    public String getPos(){
        return pos;
    }
    public String getPais(){
        return pais;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public String mostraDados(){
        return "\nNome: " + nome + "\nNascimento: " + nasc + "\nAltura: "+altura+"\nPeso: "+peso
                +"\nPosicao: "+pos+"\nPais: "+pais;
    }
}
