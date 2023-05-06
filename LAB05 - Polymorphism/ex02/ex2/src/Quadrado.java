public class Quadrado extends FormaBi{
    double lado;

    public Quadrado(double x){
        super("Bidimensional", "Quadrado");
        this.lado = x;
    }

    public double obterArea() {
        double a = this.lado* this.lado;

        return a;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nArea: "+obterArea()+"\n__________________________");
    }
}
