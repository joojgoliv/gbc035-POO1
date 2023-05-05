public class FigurinhaExtra {
    private String cor;
    private String categoria;
    Figurinha f;

    public FigurinhaExtra(String cor, String cat){
        this.cor=cor;
        this.categoria = cat;
    }
    public void Fig(Figurinha x){
        f = x;
    }

    public String mostraDados(){
        String dados;
        dados = "Cor: "+this.cor+"\nCategoria: "+this.categoria+f.mostraDados();

        return dados;
    }
}
