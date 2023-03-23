public class Main {
    public static void main(String[] args) {

        Figurinha f[] = new Figurinha[11];
        //nome,nasc,altura,peso, pos,pais
        f[0] = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[1] = new Figurinha("Messi", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[2] = new Figurinha("Cristiano Ronaldo", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[3] = new Figurinha("Neymar88", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[4] = new Figurinha("Messi88", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[5] = new Figurinha("Cristiano Ronaldo88", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[6] = new Figurinha("Neymar99", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[7] = new Figurinha("Messi99", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");
        f[8] = new Figurinha("Cristiano Ronaldo99", "5 de Fevereiro de 1985", 1.72,72.3,"Atacante","Portugal");
        f[9] = new Figurinha("Neymar77", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        f[10] = new Figurinha("Messi77", "24 de Junho de 1987", 1.62,65.2,"Atacante","Argentina");

        Selecao brasil = new Selecao();
        Selecao argentina = new Selecao();
        brasil = new Selecao("Ramon Menezes", "Brasil", f);
        argentina = new Selecao("Scaloni", "Argentina", f);
        System.out.println(brasil.mostraTime());
    }
}