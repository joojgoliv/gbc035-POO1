public class Main {
    public static void main(String[] args) {

        Figurinha f;
        f = new Figurinha("Neymar", "5 de Fevereiro de 1992", 1.7,75.3,"Atacante","Brasil");
        FigurinhaExtra fig = new FigurinhaExtra("Ouro", "Legend");
        fig.Fig(f);
        System.out.println(fig.mostraDados());

    }
}