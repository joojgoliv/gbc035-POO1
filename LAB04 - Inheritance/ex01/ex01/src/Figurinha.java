import java.util.Scanner;

public class Figurinha {
        private String nome;
        private String nasc;
        private double altura;
        private double peso;
        private String pos;
        private String pais;
        Scanner sc= new Scanner(System.in);
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
