public class Figurinha {
    protected String nome;
    protected String nasc;
    protected double altura;
    protected double peso;
    protected String pos;
    protected String pais;
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
}
