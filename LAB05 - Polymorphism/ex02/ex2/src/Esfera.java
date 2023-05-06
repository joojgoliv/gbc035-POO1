public class Esfera extends FormaTri{
    double lado;

    public Esfera(double x){
        super("Tridimensional","Esfera");
        this.lado = x;
    }

    public double obterArea(){
        double a = (this.lado*this.lado)*4*3.14;
        return a;
    }

    public double obterVolume(){
        double v = (this.lado * this.lado * this.lado * 3.14 * 4)/3;
        return v;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nVolume: "+obterVolume()+"\n__________________________");
    }
}
