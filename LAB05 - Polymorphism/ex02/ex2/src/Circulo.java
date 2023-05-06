public class Circulo extends FormaBi{
    double raio;

    public Circulo(double x){
        super("Bidimensional","Circulo");
        this.raio = x;
    }
    public double obterArea(){
        double r = this.raio * this.raio * 3.14;

        return r;
    }


    public void MostraDados() {
        super.MostraDados();
        System.out.println("\nArea: "+obterArea()+"\n__________________________");
    }
}
