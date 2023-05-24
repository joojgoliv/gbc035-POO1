public class Amigos extends Contato{
    int grau;

    public Amigos(String nome,String apelido,String email,String niver, int g){
        super(nome, apelido, email, niver);
        try {
            setGrau(g);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }

    public void setGrau(int g){
        if(g<1 && g>2){
            throw new IllegalArgumentException("Fora do range");
        }
        this.grau = g;
    }

    @Override
    public String imprimirContato() {
        String c;
        if(this.grau == 1)
            c = "Melhor Amigo";
        else if(this.grau == 2)
            c = "Amigo";
        else
            c = "Conhecido";

        return imprimirBasico()+"\nAmizade: "+c;
    }
}
