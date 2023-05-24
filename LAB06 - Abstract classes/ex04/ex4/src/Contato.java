public abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private String niver;

    public Contato(String nome,String apelido,String email,String niver){
        this.niver = niver;
        this.email = email;
        this.apelido = apelido;
        this.nome = nome;
    }
    public String imprimirBasico(){
        return "\nNome: "+ this.nome +"\nApelido: "+this.apelido+"\nEmail: "
                +this.email +"\nNiver: "+this.niver;
    }

    public abstract String imprimirContato();
}
