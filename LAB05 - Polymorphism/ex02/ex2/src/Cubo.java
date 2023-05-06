public class Cubo extends FormaTri{
    double lado;

    public Cubo(double x){
        super("Tridimensional","Cubo");
        this.lado = x;
    }

    public double obterArea(){
        double a = (this.lado*this.lado)*6;
        return a;
    }

    public double obterVolume(){
        double v = this.lado * this.lado * this.lado;
        return v;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nVolume: "+obterVolume()+"\n__________________________");
    }
}
