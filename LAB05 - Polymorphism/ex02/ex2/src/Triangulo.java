public class Triangulo extends FormaBi{
    double lado;

    public Triangulo(double x){
        super("Bidimensional","Triangulo");
        this.lado =x;
    }

    public double obterArea() {
        double a = this.lado*this.lado;
        a=a/2;

        return a;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nArea: "+obterArea()+"\n__________________________");
    }
}
