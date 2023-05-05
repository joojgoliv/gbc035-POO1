public class FigurinhaExtra extends Figurinha{
    private String cor;
    private String categoria;
    Figurinha f;

    //Figurinha(String nome, String nasc, double altura, double peso, String pos, String pais)
    public FigurinhaExtra(String nome,String nasc,double altura, double peso,String pos,String pais, String cor, String cat){
        super(nome,nasc,altura,peso,pos,pais);
        this.cor=cor;
        this.categoria = cat;
    }

    public String mostraDados(){
        String dados =super.mostraDados();
        dados += "\nCor: "+this.cor+"\nCategoria: "+this.categoria;

        return dados;
    }
}
