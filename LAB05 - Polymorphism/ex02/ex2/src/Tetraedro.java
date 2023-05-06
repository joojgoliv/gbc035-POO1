public class Tetraedro extends FormaTri{
    double ladoB1,H;

    public Tetraedro(double x, double h){
        super("Tridimensional","Tetraedro");
        this.ladoB1 = x;
        this.H = h;
    }

    public double obterArea(){
        double a = this.ladoB1*this.ladoB1 * 1.732;
        return a;
    }

    public double obterVolume(){
        double v = (this.ladoB1 * this.ladoB1 * this.H)/3;
        return v;
    }

    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nVolume: "+obterVolume()+"\n__________________________");
    }
}
