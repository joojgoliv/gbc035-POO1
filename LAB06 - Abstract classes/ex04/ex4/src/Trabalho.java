public class Trabalho extends Contato{
    String relacao;

    public Trabalho(String nome,String apelido,String email,String niver, String relacao){
        super(nome,apelido,email,niver);
        this.relacao = relacao;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico()+"\nRelacao: "+this.relacao;
    }
}
