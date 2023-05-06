public class FormaTri extends Forma{
    public String forma;

    public FormaTri(String d, String f){
        super("Tridimensional");
        this.forma = f;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nFormato: "+this.forma);
    }

    public double obterArea(){
        return -1;//caso chamem a func em formabi
    }
    public double obterVolume(){
        return -1;//caso chamem a func em formabi
    }
}
