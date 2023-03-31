public class Main {
    public static void main(String[] args) {
        //nome,nasc,altura,peso, pos,pais


        Selecao brasil = new Selecao("Ramon Menezes", "Brasil");
        brasil.definirJogadores();
        Selecao argentina = new Selecao("Scaloni", "Argentina");
        argentina.definirJogadores();
        System.out.println(argentina.mostraTime());
    }
}