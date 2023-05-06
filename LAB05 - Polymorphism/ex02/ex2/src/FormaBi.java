public class FormaBi extends Forma{
    private String forma;
    public FormaBi(String s, String f) {
        super("Bidimensional");
        this.forma = f;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nFormato: "+this.forma);
    }
    public double obterArea(){
        return -1;//caso chamem a func em formabi
    }
}
