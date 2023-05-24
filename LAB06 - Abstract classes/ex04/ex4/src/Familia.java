public class Familia extends Contato{
    private String parentesco;

    public Familia(String nome,String apelido,String email,String niver, String parentesco){
        super(nome, apelido, email, niver);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return imprimirBasico() + "\nGrau de parentesco: "+this.parentesco;
    }
}
