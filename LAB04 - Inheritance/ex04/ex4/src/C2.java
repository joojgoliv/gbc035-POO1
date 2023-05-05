public class C2 extends C1{
    public int a;
    private int s;
    protected int d;

    public C2(){
        System.out.println(  "Classe C2: chamada do construtor padrao, sem parametros");
    }
    public C2(int a, int s, int d){
        this.a = a;
        this.s = s;
        this.d = d;
        System.out.println(  "Classe C2: chamada do construtor com parametros");
    }

    public void mostrarAtributos(){
        System.out.println("\nC2: "+a+s+d);
    }
    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("\nC2: "+a+s+d);
    }
}
