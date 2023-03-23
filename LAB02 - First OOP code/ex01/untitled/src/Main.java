public class Main {
    public static void main(String[] args) {

        Figurinha f[] = new Figurinha[3];
        //nome,nasc,altura,peso, pos,pais
        f[0] = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[1] = new Figurinha("Messi", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[2] = new Figurinha("Cristiano Ronaldo", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");

        for(int i = 0; i < 3; i++){
            System.out.println(f[i].mostraDados());
        }
    }
}