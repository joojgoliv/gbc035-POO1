public class Produtos implements Classificavel{
    private int codigo;
    private double preco;

    public Produtos(int codigo, double preco){
        this.codigo = codigo;
        this.preco = preco;
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
        Produtos compara  = (Produtos) obj;
        if(this.codigo < compara.codigo){
            return true;
        }
        else{
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }
}