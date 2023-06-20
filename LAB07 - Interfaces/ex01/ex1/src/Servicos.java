public class Servicos implements Classificavel{
    private double preco;

    private String tipo;

    public Servicos(double preco, String tipo){
        this.preco = preco;
        this.tipo = tipo;
    }
    public static Classificavel[] Ordena(Classificavel[] vet) {
        int n = vet.length;
        for (int j = 1; j < n; j++) {
            Classificavel chave = vet[j];
            int i = j - 1;
            while (i >= 0 && chave.ehMenorQue(vet[i])) {
                vet[i + 1] = vet[i];
                i = i - 1;
            }
            vet[i + 1] = chave;
        }
        return(vet);
    }

    @Override
    public boolean ehMenorQue(Classificavel obj) {
        Servicos compara  = (Servicos) obj;
        if(this.preco < compara.preco){
            return true;
        }
        else{
            return false;
        }
    }

    public double getPreco() {
        return preco;
    }
}