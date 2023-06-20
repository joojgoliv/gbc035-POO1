public class Clientes implements Classificavel{
    private String nome;
    private String CPF;

    public Clientes(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
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
        Clientes compara  = (Clientes) obj;
        int x = this.nome.compareTo(compara.nome);
        if(x < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }
}

