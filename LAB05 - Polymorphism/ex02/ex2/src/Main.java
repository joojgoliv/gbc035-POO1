public class Main {
    public static void main(String[] args) {
        Forma f[] = new Forma[6];
        f[0] = new Circulo(5);
        f[1] = new Quadrado(3.5);
        f[2] = new Triangulo(4);
        f[3] = new Cubo(2.45);
        f[4] = new Esfera(2.5);
        f[5]= new Tetraedro(5,3); //lado da base e altura

        for(int i =0;i<f.length;i++){
            f[i].MostraDados();
        }

    }
}