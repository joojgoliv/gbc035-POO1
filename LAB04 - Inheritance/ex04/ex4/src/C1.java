public class C1 {
    public int q;
    private int w;
    protected int e;

    public C1(){
        System.out.println(  "Classe C1: chamada do construtor padrao, sem parametros");
    }
    public C1(int q, int w, int e){
        this.q = q;
        this.e = e;
        this.w = w;
        System.out.println(  "Classe C1: chamada do construtor com parametros");
    }
    public void mostrarAtributos(){
        System.out.println("\nC1: "+q+w+e);
    }
    public void mostrarAtributosSuper(){
        System.out.println("\nC1: "+q+w+e);
    }
}
